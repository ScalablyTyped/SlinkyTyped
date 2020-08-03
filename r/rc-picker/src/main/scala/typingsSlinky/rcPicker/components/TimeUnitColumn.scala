package typingsSlinky.rcPicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.timeUnitColumnMod.TimeUnitColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimeUnitColumn {
  @JSImport("rc-picker/es/panels/TimePanel/TimeUnitColumn", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelect(value: /* value */ Double => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def unitsVarargs(value: typingsSlinky.rcPicker.timeUnitColumnMod.Unit*): this.type = set("units", js.Array(value :_*))
    @scala.inline
    def units(value: js.Array[typingsSlinky.rcPicker.timeUnitColumnMod.Unit]): this.type = set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimeUnitColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimeUnitColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

