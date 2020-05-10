package typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionItemProps[T] extends js.Object {
  /** Optional className for the root element of the suggestion item. */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the ISuggestionItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISuggestionsItem]] = js.native
  /** Unique id of the suggested item. */
  var id: js.UndefOr[String] = js.native
  /** An override for the 'selected' property of the SuggestionModel. */
  var isSelectedOverride: js.UndefOr[Boolean] = js.native
  /**
    * The ARIA label for the button to remove the suggestion from the list.
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.native
  /** Whether the remove button should be rendered or not. */
  var showRemoveButton: js.UndefOr[Boolean] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]] = js.native
  /** Individual suggestion object containing its properties. */
  var suggestionModel: ISuggestionModel[T] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.native
  /** Optional renderer to override the default one for each type of picker. */
  def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): ReactElement = js.native
  /** Callback for when the user clicks on the suggestion. */
  def onClick(ev: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  /** Callback for when the item is removed from the array of suggested items. */
  def onRemoveItem(ev: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
}

object ISuggestionItemProps {
  @scala.inline
  def apply[T](
    RenderSuggestion: (T, ISuggestionItemProps[T]) => ReactElement,
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    onRemoveItem: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    suggestionModel: ISuggestionModel[T]
  ): ISuggestionItemProps[T] = {
    val __obj = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1(onClick), onRemoveItem = js.Any.fromFunction1(onRemoveItem), suggestionModel = suggestionModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionItemProps[T]]
  }
  @scala.inline
  implicit class ISuggestionItemPropsOps[Self[t] <: ISuggestionItemProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRenderSuggestion(value: (T, ISuggestionItemProps[T]) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderSuggestion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRemoveItem(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoveItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuggestionModel(value: ISuggestionModel[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ISuggestionsItem | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ISuggestionsItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ISuggestionsItem]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelectedOverride(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelectedOverride: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectedOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButtonAriaLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButtonAriaLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRemoveButton(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRemoveButton: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ISuggestionsItemStyleProps => Partial[ISuggestionsItemStyles]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

