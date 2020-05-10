package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FsCommand.
  */
@js.native
trait SchemaFsCommand extends js.Object {
  /**
    * Distance from the left of the browser.Applicable when positionOption is
    * DISTANCE_FROM_TOP_LEFT_CORNER.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Position in the browser where the window will open.
    */
  var positionOption: js.UndefOr[String] = js.native
  /**
    * Distance from the top of the browser. Applicable when positionOption is
    * DISTANCE_FROM_TOP_LEFT_CORNER.
    */
  var top: js.UndefOr[Double] = js.native
  /**
    * Height of the window.
    */
  var windowHeight: js.UndefOr[Double] = js.native
  /**
    * Width of the window.
    */
  var windowWidth: js.UndefOr[Double] = js.native
}

object SchemaFsCommand {
  @scala.inline
  def apply(): SchemaFsCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFsCommand]
  }
  @scala.inline
  implicit class SchemaFsCommandOps[Self <: SchemaFsCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOption")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(js.undefined)
        ret
    }
  }
  
}

