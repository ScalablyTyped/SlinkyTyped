package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationProvider extends StObject {
  
  /**
    * Provide the declaration of the symbol at the given position and document.
    */
  def provideDeclaration(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]] = js.native
}
object DeclarationProvider {
  
  @scala.inline
  def apply(
    provideDeclaration: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): DeclarationProvider = {
    val __obj = js.Dynamic.literal(provideDeclaration = js.Any.fromFunction3(provideDeclaration))
    __obj.asInstanceOf[DeclarationProvider]
  }
  
  @scala.inline
  implicit class DeclarationProviderMutableBuilder[Self <: DeclarationProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideDeclaration(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = StObject.set(x, "provideDeclaration", js.Any.fromFunction3(value))
  }
}
