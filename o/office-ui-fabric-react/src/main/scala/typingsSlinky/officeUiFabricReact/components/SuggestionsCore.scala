package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsSlinky.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuggestionsCore {
  
  @scala.inline
  def apply[T](
    onSuggestionClick: (js.UndefOr[SyntheticMouseEvent[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Unit,
    shouldLoopSelection: Boolean,
    suggestions: js.Array[ISuggestionModel[T]]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onSuggestionClick = js.Any.fromFunction3(onSuggestionClick), shouldLoopSelection = shouldLoopSelection.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ISuggestionsCoreProps[T]]))
  }
  
  @JSImport("office-ui-fabric-react", "SuggestionsCore")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.SuggestionsCore[T]] {
    
    @scala.inline
    def componentRef(value: IRefObject[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ js.Object | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRenderSuggestion(value: (T, /* suggestionItemProps */ ISuggestionItemProps[T]) => ReactElement): this.type = set("onRenderSuggestion", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSuggestionRemove(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[IPersonaProps], /* index */ js.UndefOr[Double]) => Unit
    ): this.type = set("onSuggestionRemove", js.Any.fromFunction3(value))
    
    @scala.inline
    def resultsMaximumNumber(value: Double): this.type = set("resultsMaximumNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showRemoveButtons(value: Boolean): this.type = set("showRemoveButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestionsAvailableAlertText(value: String): this.type = set("suggestionsAvailableAlertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestionsContainerAriaLabel(value: String): this.type = set("suggestionsContainerAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestionsItemClassName(value: String): this.type = set("suggestionsItemClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ISuggestionsCoreProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
