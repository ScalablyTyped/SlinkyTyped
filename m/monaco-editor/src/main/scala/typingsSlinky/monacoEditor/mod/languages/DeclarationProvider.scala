package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationProvider extends js.Object {
  /**
    * Provide the declaration of the symbol at the given position and document.
    */
  def provideDeclaration(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object DeclarationProvider {
  @scala.inline
  def apply(
    provideDeclaration: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): DeclarationProvider = {
    val __obj = js.Dynamic.literal(provideDeclaration = js.Any.fromFunction3(provideDeclaration))
  
    __obj.asInstanceOf[DeclarationProvider]
  }
}

