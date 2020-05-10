package typingsSlinky.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.mode
	 */
@js.native
trait Mode extends js.Object {
  /**
  		 * Height in pixels allocated to the control. If it's -1, then there is no limit on height
  		 */
  var allocatedHeight: Double = js.native
  /**
  		 * Width in pixels allocated to the control.
  		 */
  var allocatedWidth: Double = js.native
  /**
  		 * Is the control in 'Read-only' mode.
  		 */
  var isControlDisabled: Boolean = js.native
  /**
  		 * Is the control in 'Visible' mode.
  		 */
  var isVisible: Boolean = js.native
  /**
  		 * The defined control label
  		 */
  var label: String = js.native
  /**
  		 * set control state so that it will be stored in one session
  		 */
  def setControlState(state: Dictionary): Boolean = js.native
  /**
  		 * Make the control full screen.
  		 * @param value True if control needs to autosize to full screen. False if control needs to autosize to allocated width.
  		 */
  def setFullScreen(value: Boolean): Unit = js.native
  /**
  		 * API to determine container sizing if control needs to react. Control will get allocatedWidth/allocatedHeight if input is 'true'
  		 * @param value True if controls needs to track container size, control will get allocatedWidth/allocatedHeight
  		 */
  def trackContainerResize(value: Boolean): Unit = js.native
}

object Mode {
  @scala.inline
  def apply(
    allocatedHeight: Double,
    allocatedWidth: Double,
    isControlDisabled: Boolean,
    isVisible: Boolean,
    label: String,
    setControlState: Dictionary => Boolean,
    setFullScreen: Boolean => Unit,
    trackContainerResize: Boolean => Unit
  ): Mode = {
    val __obj = js.Dynamic.literal(allocatedHeight = allocatedHeight.asInstanceOf[js.Any], allocatedWidth = allocatedWidth.asInstanceOf[js.Any], isControlDisabled = isControlDisabled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], setControlState = js.Any.fromFunction1(setControlState), setFullScreen = js.Any.fromFunction1(setFullScreen), trackContainerResize = js.Any.fromFunction1(trackContainerResize))
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocatedWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsControlDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetControlState(value: Dictionary => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControlState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFullScreen(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFullScreen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackContainerResize(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackContainerResize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

