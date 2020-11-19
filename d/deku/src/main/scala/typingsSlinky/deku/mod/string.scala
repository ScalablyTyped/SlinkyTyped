package typingsSlinky.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("deku", "string")
@js.native
object string extends js.Object {
  
  /**
    * Render a virtual element to a string. You can pass in an option state context object that will be given to all components.
    */
  def render(vnode: VirtualElement): String = js.native
  def render[C](vnode: VirtualElement, context: C): String = js.native
}
