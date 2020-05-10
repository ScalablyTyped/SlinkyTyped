package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettings extends js.Object {
  /** Options for customizing the higher level labels in range navigator.
    */
  var higherLevel: js.UndefOr[LabelSettingsHigherLevel] = js.native
  /** Options for customizing the labels in lower level.
    */
  var lowerLevel: js.UndefOr[LabelSettingsLowerLevel] = js.native
  /** Options for customizing the style of labels in range navigator.
    */
  var style: js.UndefOr[LabelSettingsStyle] = js.native
}

object LabelSettings {
  @scala.inline
  def apply(): LabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettings]
  }
  @scala.inline
  implicit class LabelSettingsOps[Self <: LabelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigherLevel(value: LabelSettingsHigherLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigherLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("higherLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerLevel(value: LabelSettingsLowerLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: LabelSettingsStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

