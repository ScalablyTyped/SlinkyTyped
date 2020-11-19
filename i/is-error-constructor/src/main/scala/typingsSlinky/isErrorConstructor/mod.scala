package typingsSlinky.isErrorConstructor

import typingsSlinky.isErrorConstructor.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-error-constructor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Check if a value is an error constructor.
  	@example
  	```
  	import isErrorConstructor = require('is-error-constructor');
  	isErrorConstructor(Error);
  	//=> true
  	isErrorConstructor(RangeError);
  	//=> true
  	function FakeError() {}
  	isErrorConstructor(FakeError);
  	//=> false
  	class UnicornError extends Error {}
  	isErrorConstructor(UnicornError);
  	//=> true
  	```
  	*/
  def apply(value: js.Any): /* is std.ErrorConstructor */ Boolean = js.native
  
  /**
  	Check if a value is an error constructor.
  	@example
  	```
  	import isErrorConstructor = require('is-error-constructor');
  	isErrorConstructor(Error);
  	//=> true
  	isErrorConstructor(RangeError);
  	//=> true
  	function FakeError() {}
  	isErrorConstructor(FakeError);
  	//=> false
  	class UnicornError extends Error {}
  	isErrorConstructor(UnicornError);
  	//=> true
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isErrorConstructor(value: unknown): value is ErrorConstructor;
  // export = isErrorConstructor;
  def default(value: js.Any): /* is std.ErrorConstructor */ Boolean = js.native
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function isErrorConstructor(value: unknown): value is ErrorConstructor;
  // export = isErrorConstructor;
  @JSName("default")
  var default_Original: Call = js.native
}
