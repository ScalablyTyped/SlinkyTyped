package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRangeProvider extends StObject {
  
  /**
    * Provide ranges that should be selected from the given position.
    */
  def provideSelectionRanges(model: ITextModel, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[js.Array[SelectionRange]]] = js.native
}
object SelectionRangeProvider {
  
  @scala.inline
  def apply(
    provideSelectionRanges: (ITextModel, js.Array[Position], CancellationToken) => ProviderResult[js.Array[js.Array[SelectionRange]]]
  ): SelectionRangeProvider = {
    val __obj = js.Dynamic.literal(provideSelectionRanges = js.Any.fromFunction3(provideSelectionRanges))
    __obj.asInstanceOf[SelectionRangeProvider]
  }
  
  @scala.inline
  implicit class SelectionRangeProviderMutableBuilder[Self <: SelectionRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideSelectionRanges(
      value: (ITextModel, js.Array[Position], CancellationToken) => ProviderResult[js.Array[js.Array[SelectionRange]]]
    ): Self = StObject.set(x, "provideSelectionRanges", js.Any.fromFunction3(value))
  }
}
