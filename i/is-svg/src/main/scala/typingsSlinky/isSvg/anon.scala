package typingsSlinky.isSvg

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    /**
    	Check if a string or buffer is [SVG](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics).
    	@param input - The data to check.
    	@returns Whether `input` is SVG or not.
    	@example
    	```
    	import isSvg = require('is-svg');
    	isSvg('<svg xmlns="http://www.w3.org/2000/svg"><path fill="#00CD9F"/></svg>');
    	//=> true
    	```
    	*/
    def apply(input: String): Boolean = js.native
    def apply(input: Buffer): Boolean = js.native
  }
}
