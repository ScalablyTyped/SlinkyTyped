package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.IDisposable
import typingsSlinky.monacoEditor.mod.IEvent
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeLensProvider extends StObject {
  
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.native
  
  def provideCodeLenses(model: ITextModel, token: CancellationToken): ProviderResult[CodeLensList] = js.native
  
  var resolveCodeLens: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* codeLens */ CodeLens, 
      /* token */ CancellationToken, 
      ProviderResult[CodeLens]
    ]
  ] = js.native
}
object CodeLensProvider {
  
  @scala.inline
  def apply(provideCodeLenses: (ITextModel, CancellationToken) => ProviderResult[CodeLensList]): CodeLensProvider = {
    val __obj = js.Dynamic.literal(provideCodeLenses = js.Any.fromFunction2(provideCodeLenses))
    __obj.asInstanceOf[CodeLensProvider]
  }
  
  @scala.inline
  implicit class CodeLensProviderMutableBuilder[Self <: CodeLensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidChange(
      value: (/* listener */ js.Function1[CodeLensProvider, js.Any], /* thisArg */ js.UndefOr[js.Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
    
    @scala.inline
    def setProvideCodeLenses(value: (ITextModel, CancellationToken) => ProviderResult[CodeLensList]): Self = StObject.set(x, "provideCodeLenses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveCodeLens(
      value: (/* model */ ITextModel, /* codeLens */ CodeLens, /* token */ CancellationToken) => ProviderResult[CodeLens]
    ): Self = StObject.set(x, "resolveCodeLens", js.Any.fromFunction3(value))
    
    @scala.inline
    def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
  }
}
