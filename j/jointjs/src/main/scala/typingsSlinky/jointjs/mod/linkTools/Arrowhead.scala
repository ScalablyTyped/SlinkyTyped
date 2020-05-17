package typingsSlinky.jointjs.mod.linkTools

import typingsSlinky.jointjs.mod.dia.Event
import typingsSlinky.jointjs.mod.dia.ToolView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "linkTools.Arrowhead")
@js.native
abstract class Arrowhead () extends ToolView {
  var arrowheadType: String = js.native
  var ratio: Double = js.native
  /* protected */ def onPointerDown(evt: Event): Unit = js.native
  /* protected */ def onPointerMove(evt: Event): Unit = js.native
  /* protected */ def onPointerUp(evt: Event): Unit = js.native
}

