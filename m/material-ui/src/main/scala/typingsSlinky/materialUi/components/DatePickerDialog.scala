package typingsSlinky.materialUi.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.DatePicker.DatePickerDialogProps
import typingsSlinky.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsSlinky.materialUi.datePickerDialogMod.default
import typingsSlinky.materialUi.materialUiStrings.`inline`
import typingsSlinky.materialUi.materialUiStrings.dialog
import typingsSlinky.materialUi.materialUiStrings.landscape
import typingsSlinky.materialUi.materialUiStrings.portrait
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerDialog {
  @JSImport("material-ui/DatePicker/DatePickerDialog", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def DateTimeFormat(value: typingsSlinky.materialUi.anon.Call): this.type = set("DateTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def animation(value: ReactComponentClass[PopoverAnimationProps]): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelLabelReactElement(value: ReactElement): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelLabel(value: TagMod[Any]): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def container(value: dialog | `inline`): this.type = set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def disableYearSelection(value: Boolean): this.type = set("disableYearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: portrait | landscape): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def okLabelReactElement(value: ReactElement): this.type = set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def okLabel(value: TagMod[Any]): this.type = set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onAccept(value: /* d */ js.Date => Unit): this.type = set("onAccept", js.Any.fromFunction1(value))
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def shouldDisableDate(value: /* day */ js.Date => Boolean): this.type = set("shouldDisableDate", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def utils(value: typingsSlinky.materialUi.MaterialUI.propTypes.utils): this.type = set("utils", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerDialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DatePickerDialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

