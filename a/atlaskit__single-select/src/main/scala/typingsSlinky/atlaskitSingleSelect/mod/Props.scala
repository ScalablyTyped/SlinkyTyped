package typingsSlinky.atlaskitSingleSelect.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.atlaskitSingleSelect.AnonEvent
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /** Subtle items do not have a background color. */
  var appearance: js.UndefOr[typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle] = js.native
  /** Item to be selected on component mount. */
  var defaultSelected: js.UndefOr[ItemType] = js.native
  /** Sets whether the dropdown should be constrained to the width of its trigger */
  var droplistShouldFitContainer: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether the field should be selectable. If it is, the field will be
    * a text box, which will filter the items.
    */
  var hasAutocomplete: js.UndefOr[Boolean] = js.native
  /** id property to be passed down to the html select component. */
  var id: js.UndefOr[String] = js.native
  /** message to show on the dialog when isInvalid is true */
  var invalidMessage: js.UndefOr[TagMod[Any]] = js.native
  /** Sets whether the component should be open on mount. */
  var isDefaultOpen: js.UndefOr[Boolean] = js.native
  /** Sets whether the select is selectable. Changes hover state. */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /** controls the top margin of the label component rendered. */
  var isFirstChild: js.UndefOr[Boolean] = js.native
  /**
    * Set whether there is an error with the selection. Sets an orange border
    * and shows the warning icon.
    */
  var isInvalid: js.UndefOr[Boolean] = js.native
  /**
    * Sets whether form including select can be submitted without an option
    * being made.
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  /**
    * An array of objects, each one of which must have an array of items, and
    * may have a heading. All items should have content and value properties, with
    * content being the displayed text.
    */
  var items: js.UndefOr[js.Array[GroupType]] = js.native
  /** Label to be displayed above select. */
  var label: js.UndefOr[String] = js.native
  /** Set the max height of the dropdown list in pixels. */
  var maxHeight: js.UndefOr[Double] = js.native
  /** name property to be passed to the html select element. */
  var name: js.UndefOr[String] = js.native
  /**
    * Message to display in any group in items if there are no items in it,
    * including if there is one item that has been selected.
    */
  var noMatchesFound: js.UndefOr[String] = js.native
  /** Handler to be called when the filtered items changes. */
  var onFilterChange: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
  /**
    * Handler called when the select is opened or closed. Called with an object
    * that has both the event, and the new isOpen state.
    */
  var onOpenChange: js.UndefOr[js.Function1[/* change */ AnonEvent, Unit]] = js.native
  /**
    * Handler to be called when an item is selected. Called with an object that
    * has the item selected as a property on the object.
    */
  var onSelected: js.UndefOr[js.Function1[/* item */ ItemType, Unit]] = js.native
  /** Text to be shown within the select when no item is selected. */
  var placeholder: js.UndefOr[String] = js.native
  /** Where the select dropdown should be displayed relative to the field position. */
  var position: js.UndefOr[String] = js.native
  /** Sets whether the field should be constrained to the width of its trigger */
  var shouldFitContainer: js.UndefOr[Boolean] = js.native
  /** Sets whether the droplist should flip its position when there is not enough space. */
  var shouldFlip: js.UndefOr[Boolean] = js.native
  /** Sets whether the field will become focused. */
  var shouldFocus: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearance(value: typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelected(value: ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDroplistShouldFitContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droplistShouldFitContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroplistShouldFitContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droplistShouldFitContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAutocomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAutocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAutocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMessageReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidMessage(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefaultOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFirstChild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFirstChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirstChild")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[GroupType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
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
    def withNoMatchesFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchesFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMatchesFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchesFound")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterChange(value: /* filter */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenChange(value: /* change */ AnonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpenChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelected(value: /* item */ ItemType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFitContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFitContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFitContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFitContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFlip")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocus")(js.undefined)
        ret
    }
  }
  
}

