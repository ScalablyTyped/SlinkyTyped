package typingsSlinky.materializeCss

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.AutocompleteData
import typingsSlinky.materializeCss.M.ChipData
import typingsSlinky.materializeCss.materializeCssStrings.addChip
import typingsSlinky.materializeCss.materializeCssStrings.close
import typingsSlinky.materializeCss.materializeCssStrings.deleteChip
import typingsSlinky.materializeCss.materializeCssStrings.destroy
import typingsSlinky.materializeCss.materializeCssStrings.getSelectedValues
import typingsSlinky.materializeCss.materializeCssStrings.gotoDate
import typingsSlinky.materializeCss.materializeCssStrings.hours
import typingsSlinky.materializeCss.materializeCssStrings.minutes
import typingsSlinky.materializeCss.materializeCssStrings.next
import typingsSlinky.materializeCss.materializeCssStrings.open
import typingsSlinky.materializeCss.materializeCssStrings.pause
import typingsSlinky.materializeCss.materializeCssStrings.prev
import typingsSlinky.materializeCss.materializeCssStrings.recalculateDimensions
import typingsSlinky.materializeCss.materializeCssStrings.select
import typingsSlinky.materializeCss.materializeCssStrings.selectChip
import typingsSlinky.materializeCss.materializeCssStrings.selectOption
import typingsSlinky.materializeCss.materializeCssStrings.set
import typingsSlinky.materializeCss.materializeCssStrings.setDate
import typingsSlinky.materializeCss.materializeCssStrings.showView
import typingsSlinky.materializeCss.materializeCssStrings.start
import typingsSlinky.materializeCss.materializeCssStrings.updateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(method: /* keyof materialize-css.PickAutocompleteopenclose */ open | close | destroy): JQuery = js.native
  def autocomplete(method: selectOption, el: Element): JQuery = js.native
  def autocomplete(method: updateData, data: AutocompleteData): JQuery = js.native
  def autocomplete(options: PartialAutocompleteOptionData): JQuery = js.native
  def carousel(): JQuery = js.native
  def carousel(method: destroy): JQuery = js.native
  def carousel(method: next): JQuery = js.native
  def carousel(method: next, n: Double): JQuery = js.native
  def carousel(method: prev): JQuery = js.native
  def carousel(method: prev, n: Double): JQuery = js.native
  def carousel(method: set): JQuery = js.native
  def carousel(method: set, n: Double): JQuery = js.native
  def carousel(options: PartialCarouselOptionsDist): JQuery = js.native
  def characterCounter(): JQuery = js.native
  def characterCounter(method: destroy): JQuery = js.native
  def chips(): JQuery = js.native
  def chips(method: addChip, chip: ChipData): JQuery = js.native
  def chips(method: deleteChip): JQuery = js.native
  def chips(method: deleteChip, n: Double): JQuery = js.native
  def chips(method: destroy): JQuery = js.native
  def chips(method: selectChip, n: Double): JQuery = js.native
  def chips(options: PartialChipsOptionsAutocompleteOptions): JQuery = js.native
  def collapsible(): JQuery = js.native
  def collapsible(method: close, n: Double): JQuery = js.native
  def collapsible(method: destroy): JQuery = js.native
  def collapsible(method: open, n: Double): JQuery = js.native
  def collapsible(options: PartialCollapsibleOptionsAccordion): JQuery = js.native
  def datepicker(): JQuery = js.native
  def datepicker(method: /* keyof materialize-css.PickDatepickeropenclosede */ open | close | destroy): JQuery = js.native
  def datepicker(method: gotoDate, date: js.Date): JQuery = js.native
  def datepicker(method: setDate): JQuery = js.native
  def datepicker(method: setDate, date: js.Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptionsAutoClose): JQuery = js.native
  def dropdown(): JQuery = js.native
  def dropdown(
    method: /* keyof materialize-css.PickDropdownrecalculateDi */ recalculateDimensions | open | close | destroy
  ): JQuery = js.native
  def dropdown(options: PartialDropdownOptionsAlignment): JQuery = js.native
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(method: /* keyof materialize-css.PickFloatingActionButtono */ open | close | destroy): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  def formSelect(): JQuery = js.native
  def formSelect(method: /* keyof materialize-css.PickFormSelectgetSelected */ getSelectedValues | destroy): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  def materialbox(): JQuery = js.native
  def materialbox(method: /* keyof materialize-css.PickMaterialboxdestroyope */ destroy | open | close): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptionsInDuration): JQuery = js.native
  def modal(): JQuery = js.native
  def modal(method: /* keyof materialize-css.PickModalopenclosedestroy */ open | close | destroy): JQuery = js.native
  def modal(options: PartialModalOptionsDismissible): JQuery = js.native
  def parallax(): JQuery = js.native
  def parallax(method: destroy): JQuery = js.native
  def parallax(options: PartialParallaxOptions): JQuery = js.native
  def pushpin(): JQuery = js.native
  def pushpin(method: destroy): JQuery = js.native
  def pushpin(options: PartialPushpinOptionsBottom): JQuery = js.native
  def range(): JQuery = js.native
  def range(method: destroy): JQuery = js.native
  def scrollSpy(): JQuery = js.native
  def scrollSpy(method: destroy): JQuery = js.native
  def scrollSpy(options: PartialScrollSpyOptions): JQuery = js.native
  def sidenav(): JQuery = js.native
  def sidenav(method: /* keyof materialize-css.PickSidenavopenclosedestr */ open | close | destroy): JQuery = js.native
  def sidenav(options: PartialSidenavOptionsDraggable): JQuery = js.native
  def slider(): JQuery = js.native
  def slider(
    method: /* keyof materialize-css.PickSliderpausestartnextp */ start | next | prev | destroy | pause
  ): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  def tabs(): JQuery = js.native
  def tabs(method: destroy): JQuery = js.native
  def tabs(method: select, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptionsDuration): JQuery = js.native
  def tapTarget(): JQuery = js.native
  def tapTarget(method: /* keyof materialize-css.PickTapTargetopenclosedes */ open | close | destroy): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptionsOnClose): JQuery = js.native
  def timepicker(): JQuery = js.native
  def timepicker(method: /* keyof materialize-css.PickTimepickeropenclosede */ open | close | destroy): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_hours(method: showView, view: hours): JQuery = js.native
  @JSName("timepicker")
  def timepicker_minutes(method: showView, view: minutes): JQuery = js.native
  def tooltip(): JQuery = js.native
  def tooltip(method: /* keyof materialize-css.PickTooltipopenclosedestr */ open | close | destroy): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}

