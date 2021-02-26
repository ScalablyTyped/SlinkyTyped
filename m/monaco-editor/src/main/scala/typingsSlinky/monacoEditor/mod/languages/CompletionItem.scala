package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.anon.Insert
import typingsSlinky.monacoEditor.mod.IMarkdownString
import typingsSlinky.monacoEditor.mod.IRange
import typingsSlinky.monacoEditor.mod.editor.ISingleEditOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionItem extends StObject {
  
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
  var label: String | CompletionItemLabel = js.native
  
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
  var range: IRange | Insert = js.native
  
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
  def apply(
    insertText: String,
    kind: CompletionItemKind,
    label: String | CompletionItemLabel,
    range: IRange | Insert
  ): CompletionItem = {
    val __obj = js.Dynamic.literal(insertText = insertText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItem]
  }
  
  @scala.inline
  implicit class CompletionItemMutableBuilder[Self <: CompletionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[ISingleEditOperation]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: ISingleEditOperation*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommitCharacters(value: js.Array[String]): Self = StObject.set(x, "commitCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitCharactersUndefined: Self = StObject.set(x, "commitCharacters", js.undefined)
    
    @scala.inline
    def setCommitCharactersVarargs(value: String*): Self = StObject.set(x, "commitCharacters", js.Array(value :_*))
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String | IMarkdownString): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextRules(value: CompletionItemInsertTextRule): Self = StObject.set(x, "insertTextRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextRulesUndefined: Self = StObject.set(x, "insertTextRules", js.undefined)
    
    @scala.inline
    def setKind(value: CompletionItemKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String | CompletionItemLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselect(value: Boolean): Self = StObject.set(x, "preselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselectUndefined: Self = StObject.set(x, "preselect", js.undefined)
    
    @scala.inline
    def setRange(value: IRange | Insert): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortText(value: String): Self = StObject.set(x, "sortText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortTextUndefined: Self = StObject.set(x, "sortText", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[CompletionItemTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: CompletionItemTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
