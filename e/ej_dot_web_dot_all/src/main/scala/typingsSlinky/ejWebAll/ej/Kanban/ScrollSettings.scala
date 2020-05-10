package typingsSlinky.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSettings extends js.Object {
  /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
    * @Default {false}
    */
  var allowFreezeSwimlane: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
    * @Default {0}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
    * @Default {auto}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object ScrollSettings {
  @scala.inline
  def apply(): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSettings]
  }
  @scala.inline
  implicit class ScrollSettingsOps[Self <: ScrollSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFreezeSwimlane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreezeSwimlane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFreezeSwimlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreezeSwimlane")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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

