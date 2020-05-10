package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IMarkdownString
import typingsSlinky.monacoEditor.mod.IRange
import typingsSlinky.monacoEditor.mod.editor.ISingleEditOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionItem extends js.Object {
  /**
    * An optional array of additional text edits that are applied when
    * selecting this completion. Edits must not overlap with the main edit
    * nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[ISingleEditOperation]] = js.native
  /**
    * A command that should be run upon acceptance of this item.
    */
  var command: js.UndefOr[Command] = js.native
  /**
    * An optional set of characters that when pressed while this completion is active will accept it first and
    * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
    * characters will be ignored.
    */
  var commitCharacters: js.UndefOr[js.Array[String]] = js.native
  /**
    * A human-readable string with additional information
    * about this item, like type or symbol information.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * A human-readable string that represents a doc-comment.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.native
  /**
    * A string that should be used when filtering a set of
    * completion items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var filterText: js.UndefOr[String] = js.native
  /**
    * A string or snippet that should be inserted in a document when selecting
    * this completion.
    * is used.
    */
  var insertText: String = js.native
  /**
    * Addition rules (as bitmask) that should be applied when inserting
    * this completion.
    */
  var insertTextRules: js.UndefOr[CompletionItemInsertTextRule] = js.native
  /**
    * The kind of this completion item. Based on the kind
    * an icon is chosen by the editor.
    */
  var kind: CompletionItemKind = js.native
  /**
    * The label of this completion item. By default
    * this is also the text that is inserted when selecting
    * this completion.
    */
  var label: String = js.native
  /**
    * Select this item when showing. *Note* that only one completion item can be selected and
    * that the editor decides which item that is. The rule is that the *first* item of those
    * that match best is selected.
    */
  var preselect: js.UndefOr[Boolean] = js.native
  /**
    * A range of text that should be replaced by this completion item.
    *
    * Defaults to a range from the start of the [current word](#TextDocument.getWordRangeAtPosition) to the
    * current position.
    *
    * *Note:* The range must be a [single line](#Range.isSingleLine) and it must
    * [contain](#Range.contains) the position at which completion has been [requested](#CompletionItemProvider.provideCompletionItems).
    */
  var range: IRange = js.native
  /**
    * A string that should be used when comparing this item
    * with other items. When `falsy` the [label](#CompletionItem.label)
    * is used.
    */
  var sortText: js.UndefOr[String] = js.native
  /**
    * A modifier to the `kind` which affect how the item
    * is rendered, e.g. Deprecated is rendered with a strikeout
    */
  var tags: js.UndefOr[js.Array[CompletionItemTag]] = js.native
}

object CompletionItem {
  @scala.inline
  def apply(insertText: String, kind: CompletionItemKind, label: String, range: IRange): CompletionItem = {
    val __obj = js.Dynamic.literal(insertText = insertText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  @scala.inline
  implicit class CompletionItemOps[Self <: CompletionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: CompletionItemKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: IRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalTextEdits(value: js.Array[ISingleEditOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTextEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalTextEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTextEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitCharacters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: String | IMarkdownString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterText")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTextRules(value: CompletionItemInsertTextRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTextRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTextRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTextRules")(js.undefined)
        ret
    }
    @scala.inline
    def withPreselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSortText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortText")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[CompletionItemTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

