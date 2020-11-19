package typingsSlinky.d3.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.d3Drag.mod.DragBehavior
import typingsSlinky.d3Drag.mod.SubjectPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "drag")
@js.native
object drag extends js.Object {
  
  def apply[GElement /* <: Element */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
}
