package typingsSlinky.pkgVersions

import typingsSlinky.pkgVersions.anon.Call
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the version numbers of a package from the npm registry.
  	@returns The version numbers.
  	@example
  	```
  	import pkgVersions = require('pkg-versions');
  	(async () => {
  		console.log(await pkgVersions('ava'));
  		//=> {'0.0.3', '0.0.4', …}
  	})();
  	```
  	*/
  @JSImport("pkg-versions", JSImport.Namespace)
  @js.native
  def apply(packageName: String): js.Promise[Set[String]] = js.native
  
  @JSImport("pkg-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pkgVersions(packageName: string): Promise<Set<string>>;
  // export = pkgVersions;
  @JSImport("pkg-versions", "default")
  @js.native
  def default: Call = js.native
  /**
  	Get the version numbers of a package from the npm registry.
  	@returns The version numbers.
  	@example
  	```
  	import pkgVersions = require('pkg-versions');
  	(async () => {
  		console.log(await pkgVersions('ava'));
  		//=> {'0.0.3', '0.0.4', …}
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pkgVersions(packageName: string): Promise<Set<string>>;
  // export = pkgVersions;
  @JSImport("pkg-versions", "default")
  @js.native
  def default(packageName: String): js.Promise[Set[String]] = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
