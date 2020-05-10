package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSuggestionProps extends IPeoplePickerItemSharedProps {
  /**
    * Flag that controls whether each suggested PeoplePicker item (Persona) is rendered with or without secondary text
    * for compact look.
    * @defaultvalue false
    */
  var compact: js.UndefOr[Boolean] = js.native
  /** Persona props for each suggested for picking PeoplePicker item. */
  var personaProps: js.UndefOr[IPersonaProps] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
  ] = js.native
  /** General common props for all PeoplePicker items suggestions. */
  var suggestionsProps: js.UndefOr[IBasePickerSuggestionsProps[_]] = js.native
}

object IPeoplePickerItemSuggestionProps {
  @scala.inline
  def apply(): IPeoplePickerItemSuggestionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeoplePickerItemSuggestionProps]
  }
  @scala.inline
  implicit class IPeoplePickerItemSuggestionPropsOps[Self <: IPeoplePickerItemSuggestionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonaProps(value: IPersonaProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonaProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IPeoplePickerItemSuggestionStyleProps => Partial[IPeoplePickerItemSuggestionStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(
      value: IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsProps(value: IBasePickerSuggestionsProps[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsProps")(js.undefined)
        ret
    }
  }
  
}

