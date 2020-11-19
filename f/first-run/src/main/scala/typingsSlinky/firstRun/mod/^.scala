package typingsSlinky.firstRun.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("first-run", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Check if it's the first time the process is run.
  	@example
  	```
  	// x.js
  	import firstRun = require('first-run');
  	console.log(firstRun());
  	// $ node x.js
  	// true
  	// $ node x.js
  	// false
  	```
  	*/
  def apply(): Boolean = js.native
  def apply(options: Options): Boolean = js.native
  
  /**
  	Clear the state.
  	*/
  def clear(): Unit = js.native
  def clear(options: Options): Unit = js.native
}
