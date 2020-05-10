package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationControl extends js.Object {
  /** Set the absolutePosition for navigation control
    * @Default {{x:0,y:0}}
    */
  var absolutePosition: js.UndefOr[js.Any] = js.native
  /** Specifies the navigation control template for map
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.native
  /** Set the dockPosition value for navigation control
    * @Default {centerleft}
    */
  var dockPosition: js.UndefOr[Position | String] = js.native
  /** Enables or Disables the Navigation for handling zooming map
    * @Default {false}
    */
  var enableNavigation: js.UndefOr[Boolean] = js.native
  /** Set the orientation value for navigation control
    * @Default {vertical}
    */
  var orientation: js.UndefOr[LabelOrientation | String] = js.native
}

object NavigationControl {
  @scala.inline
  def apply(): NavigationControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControl]
  }
  @scala.inline
  implicit class NavigationControlOps[Self <: NavigationControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDockPosition(value: Position | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: LabelOrientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
  }
  
}

