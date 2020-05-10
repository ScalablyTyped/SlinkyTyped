package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.CancellationToken
import typingsSlinky.monacoEditor.mod.Position
import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionItemProvider extends js.Object {
  /**
    * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
    * or [details](#CompletionItem.detail).
    *
    * The editor will only resolve a completion item once.
    */
  var resolveCompletionItem: js.UndefOr[
    js.Function4[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      ProviderResult[CompletionItem]
    ]
  ] = js.native
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.native
  /**
    * Provide completion items for the given position and document.
    */
  def provideCompletionItems(model: ITextModel, position: Position, context: CompletionContext, token: CancellationToken): ProviderResult[CompletionList] = js.native
}

object CompletionItemProvider {
  @scala.inline
  def apply(
    provideCompletionItems: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
  ): CompletionItemProvider = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction4(provideCompletionItems))
    __obj.asInstanceOf[CompletionItemProvider]
  }
  @scala.inline
  implicit class CompletionItemProviderOps[Self <: CompletionItemProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvideCompletionItems(
      value: (ITextModel, Position, CompletionContext, CancellationToken) => ProviderResult[CompletionList]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideCompletionItems")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withResolveCompletionItem(
      value: (/* model */ ITextModel, /* position */ Position, /* item */ CompletionItem, /* token */ CancellationToken) => ProviderResult[CompletionItem]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCompletionItem")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveCompletionItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCompletionItem")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacters")(js.undefined)
        ret
    }
  }
  
}

