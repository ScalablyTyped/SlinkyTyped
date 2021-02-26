package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.anon.Ranges
import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTypeRenameProvider extends StObject {
  
  /**
    * Provide a list of ranges that can be live-renamed together.
    */
  def provideOnTypeRenameRanges(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Ranges] = js.native
  
  var wordPattern: js.UndefOr[js.RegExp] = js.native
}
object OnTypeRenameProvider {
  
  @scala.inline
  def apply(provideOnTypeRenameRanges: (ITextModel, Position, CancellationToken) => ProviderResult[Ranges]): OnTypeRenameProvider = {
    val __obj = js.Dynamic.literal(provideOnTypeRenameRanges = js.Any.fromFunction3(provideOnTypeRenameRanges))
    __obj.asInstanceOf[OnTypeRenameProvider]
  }
  
  @scala.inline
  implicit class OnTypeRenameProviderMutableBuilder[Self <: OnTypeRenameProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideOnTypeRenameRanges(value: (ITextModel, Position, CancellationToken) => ProviderResult[Ranges]): Self = StObject.set(x, "provideOnTypeRenameRanges", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWordPattern(value: js.RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
  }
}
