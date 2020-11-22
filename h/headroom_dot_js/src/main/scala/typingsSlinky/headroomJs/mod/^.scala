package typingsSlinky.headroomJs.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.headroomJs.mod.headroom.HeadroomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI enhancement for fixed headers.
  * Hides header when scrolling down
  * Shows header when scrolling up
  */
@JSImport("headroom.js", JSImport.Namespace)
@js.native
class ^ protected () extends Headroom_ {
  def this(element: HTMLElement) = this()
  def this(element: Node) = this()
  def this(element: HTMLElement, options: HeadroomOptions) = this()
  def this(element: Node, options: HeadroomOptions) = this()
}
@JSImport("headroom.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var cutsTheMustard: Boolean = js.native
  
  var options: HeadroomOptions = js.native
}
