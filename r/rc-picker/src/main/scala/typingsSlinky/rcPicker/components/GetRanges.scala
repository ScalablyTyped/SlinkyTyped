package typingsSlinky.rcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.anon.Label
import typingsSlinky.rcPicker.getRangesMod.RangesProps
import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.RangeList
import typingsSlinky.rcPicker.rcPickerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GetRanges {
  @JSImport("rc-picker/lib/utils/getRanges", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def okDisabled(value: Boolean): this.type = set("okDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onNowFunction0(value: () => Unit): this.type = set("onNow", js.Any.fromFunction0(value))
    @scala.inline
    def onNow(value: js.Function0[Unit] | `false`): this.type = set("onNow", value.asInstanceOf[js.Any])
    @scala.inline
    def onNowNull: this.type = set("onNow", null)
    @scala.inline
    def onOkFunction0(value: () => Unit): this.type = set("onOk", js.Any.fromFunction0(value))
    @scala.inline
    def onOk(value: js.Function0[Unit] | `false`): this.type = set("onOk", value.asInstanceOf[js.Any])
    @scala.inline
    def onOkNull: this.type = set("onOk", null)
    @scala.inline
    def rangeListVarargs(value: Label*): this.type = set("rangeList", js.Array(value :_*))
    @scala.inline
    def rangeList(value: RangeList): this.type = set("rangeList", value.asInstanceOf[js.Any])
    @scala.inline
    def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RangesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(locale: Locale, needConfirmButton: Boolean, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RangesProps]))
  }
}

