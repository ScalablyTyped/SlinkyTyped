package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameProvider extends StObject {
  
  def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit with Rejection] = js.native
  
  var resolveRenameLocation: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[RenameLocation with Rejection]
    ]
  ] = js.native
}
object RenameProvider {
  
  @scala.inline
  def apply(
    provideRenameEdits: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection]
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
    __obj.asInstanceOf[RenameProvider]
  }
  
  @scala.inline
  implicit class RenameProviderMutableBuilder[Self <: RenameProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideRenameEdits(
      value: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection]
    ): Self = StObject.set(x, "provideRenameEdits", js.Any.fromFunction4(value))
    
    @scala.inline
    def setResolveRenameLocation(
      value: (/* model */ ITextModel, /* position */ Position, /* token */ CancellationToken) => ProviderResult[RenameLocation with Rejection]
    ): Self = StObject.set(x, "resolveRenameLocation", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResolveRenameLocationUndefined: Self = StObject.set(x, "resolveRenameLocation", js.undefined)
  }
}
