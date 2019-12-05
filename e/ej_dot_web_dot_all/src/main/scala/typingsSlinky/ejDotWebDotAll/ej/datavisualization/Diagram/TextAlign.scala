package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextAlign")
@js.native
object TextAlign extends js.Object {
  //Used to align text on center of node/connector
  @js.native
  sealed trait Center
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign
  
  //Used to align text on left side of node/connector
  @js.native
  sealed trait Left
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign
  
  //Used to align text on Right side of node/connector
  @js.native
  sealed trait Right
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign
  
  /* 1 */ val Center: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign.Center with Double = js.native
  /* 0 */ val Left: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign.Left with Double = js.native
  /* 2 */ val Right: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign with Double] = js.native
}

