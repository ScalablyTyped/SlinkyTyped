package typingsSlinky.datGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GUIParams extends js.Object {
  /**
    * Handles GUI's element placement for you.
    * @default true
    */
  var autoPlace: js.UndefOr[Boolean] = js.native
  /**
    * If true, close/open button shows on top of the GUI.
    * @default false
    */
  var closeOnTop: js.UndefOr[Boolean] = js.native
  /**
    * If true, starts closed.
    * @default false
    */
  var closed: js.UndefOr[Boolean] = js.native
  /**
    * If true, GUI is closed by the "h" keypress.
    * @default false
    */
  var hideable: js.UndefOr[Boolean] = js.native
  /**
    * JSON object representing the saved state of this GUI.
    */
  var load: js.UndefOr[js.Any] = js.native
  /**
    * The name of this GUI.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The identifier for a set of saved values.
    */
  var preset: js.UndefOr[String] = js.native
  /**
    * The width of GUI element.
    */
  var width: js.UndefOr[Double] = js.native
}

object GUIParams {
  @scala.inline
  def apply(): GUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GUIParams]
  }
  @scala.inline
  implicit class GUIParamsOps[Self <: GUIParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPlace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withHideable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideable")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

