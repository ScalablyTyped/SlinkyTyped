package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionStyleProps
import typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionStyles
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IPeoplePickerItemSuggestionProps644981553 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
  
  @scala.inline
  def personaProps(value: IPersonaProps): this.type = set("personaProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def styles(
    value: IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
  ): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stylesFunction1(value: IPeoplePickerItemSuggestionStyleProps => DeepPartial[IPeoplePickerItemSuggestionStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  @scala.inline
  def suggestionsProps(value: IBasePickerSuggestionsProps[_]): this.type = set("suggestionsProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
}
