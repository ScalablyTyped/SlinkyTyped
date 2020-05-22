package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
@JSGlobal("ASPxClientXYDiagramPane")
@js.native
class ASPxClientXYDiagramPane ()
  extends typingsSlinky.devexpressWeb.ASPxClientXYDiagramPane {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typingsSlinky.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the diagram that owns the current pane object.
    */
  /* CompleteClass */
  override var diagram: typingsSlinky.devexpressWeb.ASPxClientXYDiagram = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the pane title's settings.
    */
  /* CompleteClass */
  override var title: typingsSlinky.devexpressWeb.ASPxClientPaneTitle = js.native
}

