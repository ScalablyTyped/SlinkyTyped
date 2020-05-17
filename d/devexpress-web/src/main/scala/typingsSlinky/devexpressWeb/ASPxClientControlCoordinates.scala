package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ControlCoordinates class.
  */
@js.native
trait ASPxClientControlCoordinates extends js.Object {
  /**
    * Gets the point's pane.
    */
  var pane: ASPxClientXYDiagramPane = js.native
  /**
    * Gets the point's visibility state.
    */
  var visibility: String = js.native
  /**
    * Gets the point's X-coordinate, in pixels.
    */
  var x: Double = js.native
  /**
    * Gets the point's Y-coordinate, in pixels.
    */
  var y: Double = js.native
}

object ASPxClientControlCoordinates {
  @scala.inline
  def apply(pane: ASPxClientXYDiagramPane, visibility: String, x: Double, y: Double): ASPxClientControlCoordinates = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlCoordinates]
  }
  @scala.inline
  implicit class ASPxClientControlCoordinatesOps[Self <: ASPxClientControlCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPane(value: ASPxClientXYDiagramPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

