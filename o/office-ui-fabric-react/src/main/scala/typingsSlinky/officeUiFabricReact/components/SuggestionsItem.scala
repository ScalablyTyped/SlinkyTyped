package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItem
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItemStyleProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItemStyles
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuggestionsItem {
  
  @JSImport("office-ui-fabric-react", "SuggestionsItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsItem[T]] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ ISuggestionsItem | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[ISuggestionsItem]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[ISuggestionsItem]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isSelectedOverride(value: Boolean): this.type = set("isSelectedOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeButtonAriaLabel(value: String): this.type = set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showRemoveButton(value: Boolean): this.type = set("showRemoveButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: ISuggestionsItemStyleProps => DeepPartial[ISuggestionsItemStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ISuggestionItemProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](
    RenderSuggestion: (T, ISuggestionItemProps[T]) => ReactElement,
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    onRemoveItem: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    suggestionModel: ISuggestionModel[T]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1(onClick), onRemoveItem = js.Any.fromFunction1(onRemoveItem), suggestionModel = suggestionModel.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ISuggestionItemProps[T]]))
  }
}
