package typingsSlinky.humanizeString

import typingsSlinky.humanizeString.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Convert a camelized/dasherized/underscored string into a humanized one: `fooBar-Baz_Faz` → `Foo bar baz faz`.
  	@param text - The string to make human readable.
  	@example
  	```
  	import humanizeString = require('humanize-string');
  	humanizeString('fooBar');
  	//=> 'Foo bar'
  	humanizeString('foo-bar');
  	//=> 'Foo bar'
  	humanizeString('foo_bar');
  	//=> 'Foo bar'
  	```
  	*/
  @JSImport("humanize-string", JSImport.Namespace)
  @js.native
  def apply(text: String): String = js.native
  
  @JSImport("humanize-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function humanizeString(text: string): string;
  // export = humanizeString;
  @JSImport("humanize-string", "default")
  @js.native
  def default: Call = js.native
  /**
  	Convert a camelized/dasherized/underscored string into a humanized one: `fooBar-Baz_Faz` → `Foo bar baz faz`.
  	@param text - The string to make human readable.
  	@example
  	```
  	import humanizeString = require('humanize-string');
  	humanizeString('fooBar');
  	//=> 'Foo bar'
  	humanizeString('foo-bar');
  	//=> 'Foo bar'
  	humanizeString('foo_bar');
  	//=> 'Foo bar'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function humanizeString(text: string): string;
  // export = humanizeString;
  @JSImport("humanize-string", "default")
  @js.native
  def default(text: String): String = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
