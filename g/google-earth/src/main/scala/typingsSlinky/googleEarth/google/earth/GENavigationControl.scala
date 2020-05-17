package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GENavigationControl extends js.Object {
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def getControlType(): GENavigationControlEnum = js.native
  /**
    * The position of the navigation controls in Google Earth
    */
  def getScreenXY(): KmlVec2 = js.native
  /**
    * Whether Street View is enabled in the navigation controls.
    */
  def getStreetViewEnabled(): Boolean = js.native
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def getVisibility(): GEVisibilityEnum = js.native
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def setControlType(controlType: GENavigationControlEnum): Unit = js.native
  /**
    * Enables or disables user-initiated entry to Street View imagery.
    * When true, the Pegman icon is present in the navigation controls, allowing a user to drag the Pegman onto a street to initiate Street View.
    * Users can also zoom down to ground level to enter Street View when this is set to true.
    */
  def setStreetViewEnabled(streetViewEnabled: Boolean): Unit = js.native
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit = js.native
}

object GENavigationControl {
  @scala.inline
  def apply(
    getControlType: () => GENavigationControlEnum,
    getScreenXY: () => KmlVec2,
    getStreetViewEnabled: () => Boolean,
    getVisibility: () => GEVisibilityEnum,
    setControlType: GENavigationControlEnum => Unit,
    setStreetViewEnabled: Boolean => Unit,
    setVisibility: GEVisibilityEnum => Unit
  ): GENavigationControl = {
    val __obj = js.Dynamic.literal(getControlType = js.Any.fromFunction0(getControlType), getScreenXY = js.Any.fromFunction0(getScreenXY), getStreetViewEnabled = js.Any.fromFunction0(getStreetViewEnabled), getVisibility = js.Any.fromFunction0(getVisibility), setControlType = js.Any.fromFunction1(setControlType), setStreetViewEnabled = js.Any.fromFunction1(setStreetViewEnabled), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[GENavigationControl]
  }
  @scala.inline
  implicit class GENavigationControlOps[Self <: GENavigationControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetControlType(value: () => GENavigationControlEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControlType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScreenXY(value: () => KmlVec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStreetViewEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStreetViewEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibility(value: () => GEVisibilityEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibility")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetControlType(value: GENavigationControlEnum => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControlType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStreetViewEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStreetViewEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisibility(value: GEVisibilityEnum => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibility")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

