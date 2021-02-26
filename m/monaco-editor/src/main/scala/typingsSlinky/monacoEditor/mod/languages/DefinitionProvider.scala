package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionProvider extends StObject {
  
  /**
    * Provide the definition of the symbol at the given position and document.
    */
  def provideDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]] = js.native
}
object DefinitionProvider {
  
  @scala.inline
  def apply(
    provideDefinition: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): DefinitionProvider = {
    val __obj = js.Dynamic.literal(provideDefinition = js.Any.fromFunction3(provideDefinition))
    __obj.asInstanceOf[DefinitionProvider]
  }
  
  @scala.inline
  implicit class DefinitionProviderMutableBuilder[Self <: DefinitionProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDefinition(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = StObject.set(x, "provideDefinition", js.Any.fromFunction3(value))
  }
}
