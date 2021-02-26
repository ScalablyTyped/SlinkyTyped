package typingsSlinky.npmName

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.Error
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Check whether a package/organization name is available (not registered) on npm.
  	An organization name should start with `@` and should not be a scoped package.
  	@param name - Name to check.
  	@returns Whether the given name is available.
  	@example
  	```
  	import npmName = require('npm-name');
  	(async () => {
  		// Check a package name
  		console.log(await npmName('chalk'));
  		//=> false
  		// Check an organization name
  		console.log(await npmName('@ava'));
  		//=> false
  		console.log(await npmName('@abc123'));
  		//=> true
  		try {
  			await npmName('_ABC');
  		} catch (error) {
  			console.log(error.message);
  			// Invalid package name: _ABC
  			// - name cannot start with an underscore
  			// - name can no longer contain capital letters
  		}
  	})();
  	```
  	*/
  @JSImport("npm-name", JSImport.Namespace)
  @js.native
  def apply(name: String): js.Promise[Boolean] = js.native
  @JSImport("npm-name", JSImport.Namespace)
  @js.native
  def apply(name: String, options: Options): js.Promise[Boolean] = js.native
  
  @JSImport("npm-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("npm-name", "InvalidNameError")
  @js.native
  class InvalidNameError () extends Error
  @JSImport("npm-name", "InvalidNameError")
  @js.native
  def InvalidNameError: Instantiable0[js.Error] = js.native
  @scala.inline
  def InvalidNameError_=(x: Instantiable0[js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidNameError")(x.asInstanceOf[js.Any])
  
  /**
  	Check whether multiple package/organization names are available (not registered) on npm.
  	An organization name should start with `@` and should not be a scoped package.
  	@param names - Multiple names to check.
  	@returns A `Map` of name and status.
  	@example
  	```
  	import npmName = require('npm-name');
  	(async () => {
  		const result = await npmName.many(['chalk', '@sindresorhus/is', 'abc123']);
  		console.log(result.get('chalk'));
  		//=> false
  		console.log(result.get('@sindresorhus/is'));
  		//=> false
  		console.log(result.get('abc123'));
  		//=> true
  	})();
  	```
  	*/
  @JSImport("npm-name", "many")
  @js.native
  def many[NameType /* <: String */](names: js.Array[NameType]): js.Promise[Map[NameType, Boolean]] = js.native
  @JSImport("npm-name", "many")
  @js.native
  def many[NameType /* <: String */](names: js.Array[NameType], options: Options): js.Promise[Map[NameType, Boolean]] = js.native
  
  type InvalidNameErrorClass = js.Error
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Registry URL to check name availability against.
    		Default: User's configured npm registry URL.
    		*/
    val registryUrl: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(registryUrl: String): Options = {
      val __obj = js.Dynamic.literal(registryUrl = registryUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistryUrl(value: String): Self = StObject.set(x, "registryUrl", value.asInstanceOf[js.Any])
    }
  }
}
