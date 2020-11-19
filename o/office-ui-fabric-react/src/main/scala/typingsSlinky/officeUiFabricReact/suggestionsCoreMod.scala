package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/SuggestionsCore", JSImport.Namespace)
@js.native
object suggestionsCoreMod extends js.Object {
  
  @js.native
  class SuggestionsCore[T] protected ()
    extends Component[ISuggestionsCoreProps[T], js.Object, js.Any] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
    
    var SuggestionsItemOfProperType: js.Any = js.native
    
    var _onClickTypedSuggestionsItem: js.Any = js.native
    
    var _onRemoveTypedSuggestionsItem: js.Any = js.native
    
    var _selectedElement: ReactRef[HTMLDivElement] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggestionsCore(): Unit = js.native
    
    var currentIndex: Double = js.native
    
    var currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
    
    def deselectAllSuggestions(): Unit = js.native
    
    def getCurrentItem(): ISuggestionModel[T] = js.native
    
    def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
    
    def hasSuggestionSelected(): Boolean = js.native
    
    /**
      * Increments the selected suggestion index
      */
    def nextSuggestion(): Boolean = js.native
    
    /**
      * Decrements the selected suggestion index
      */
    def previousSuggestion(): Boolean = js.native
    
    def removeSuggestion(index: Double): Unit = js.native
    
    def scrollSelected(): Unit = js.native
    
    val selectedElement: js.UndefOr[HTMLDivElement] = js.native
    
    def setSelectedSuggestion(index: Double): Unit = js.native
  }
}
