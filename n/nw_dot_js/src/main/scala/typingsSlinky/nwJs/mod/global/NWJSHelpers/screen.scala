package typingsSlinky.nwJs.mod.global.NWJSHelpers

import typingsSlinky.nwJs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Screen screen object
  */
@js.native
trait screen extends js.Object {
  /**
    * Physical screen resolution, can be negative, not necessarily start from 0,depending on screen arrangement
    */
  var bounds: Height = js.native
  /**
    * Unique id for a screen
    */
  var id: Double = js.native
  var isBuiltIn: Boolean = js.native
  var rotation: Double = js.native
  var scaleFactor: Double = js.native
  var touchSupport: Double = js.native
  /**
    * Useable area within the screen bound
    */
  var work_area: Height = js.native
}

object screen {
  @scala.inline
  def apply(
    bounds: Height,
    id: Double,
    isBuiltIn: Boolean,
    rotation: Double,
    scaleFactor: Double,
    touchSupport: Double,
    work_area: Height
  ): screen = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBuiltIn = isBuiltIn.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], touchSupport = touchSupport.asInstanceOf[js.Any], work_area = work_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[screen]
  }
  @scala.inline
  implicit class screenOps[Self <: screen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuiltIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchSupport(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWork_area(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("work_area")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

