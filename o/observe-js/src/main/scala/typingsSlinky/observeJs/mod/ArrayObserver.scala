package typingsSlinky.observeJs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.observeJs.mod.observejs.ArrayObserverInstance
import typingsSlinky.observeJs.mod.observejs.ArrayObserverStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("observe-js", "ArrayObserver")
@js.native
class ArrayObserver protected () extends ArrayObserverInstance {
  /**
    * Constructor
    * @param receiver the target for observation
    */
  def this(receiver: js.Array[_]) = this()
}
@JSImport("observe-js", "ArrayObserver")
@js.native
object ArrayObserver extends TopLevel[ArrayObserverStatic]
