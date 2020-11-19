package typingsSlinky.isScoped

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Check if a string is a [scoped npm package name](https://docs.npmjs.com/misc/scope).
    	@example
    	```
    	import isScoped = require('is-scoped');
    	isScoped('@sindresorhus/df');
    	//=> true
    	isScoped('cat-names');
    	//=> false
    	```
    	*/
    def apply(input: String): Boolean = js.native
  }
}
