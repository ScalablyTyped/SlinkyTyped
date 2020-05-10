package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.AnonComments
import typingsSlinky.monacoEditor.monacoEditorStrings.always
import typingsSlinky.monacoEditor.monacoEditorStrings.auto
import typingsSlinky.monacoEditor.monacoEditorStrings.first
import typingsSlinky.monacoEditor.monacoEditorStrings.indentation
import typingsSlinky.monacoEditor.monacoEditorStrings.mouseover
import typingsSlinky.monacoEditor.monacoEditorStrings.off
import typingsSlinky.monacoEditor.monacoEditorStrings.on
import typingsSlinky.monacoEditor.monacoEditorStrings.onlySnippets
import typingsSlinky.monacoEditor.monacoEditorStrings.recentlyUsed
import typingsSlinky.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typingsSlinky.monacoEditor.monacoEditorStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorContribOptions extends js.Object {
  val acceptSuggestionOnCommitCharacter: Boolean = js.native
  val acceptSuggestionOnEnter: on | smart | off = js.native
  val codeActionsOnSave: ICodeActionsOnSaveOptions = js.native
  val codeActionsOnSaveTimeout: Double = js.native
  val codeLens: Boolean = js.native
  val colorDecorators: Boolean = js.native
  val contextmenu: Boolean = js.native
  val find: InternalEditorFindOptions = js.native
  val folding: Boolean = js.native
  val foldingStrategy: auto | indentation = js.native
  val formatOnPaste: Boolean = js.native
  val formatOnType: Boolean = js.native
  val gotoLocation: InternalGoToLocationOptions = js.native
  val hover: InternalEditorHoverOptions = js.native
  val lightbulbEnabled: Boolean = js.native
  val links: Boolean = js.native
  val matchBrackets: Boolean = js.native
  val occurrencesHighlight: Boolean = js.native
  val parameterHints: InternalParameterHintOptions = js.native
  val quickSuggestions: Boolean | AnonComments = js.native
  val quickSuggestionsDelay: Double = js.native
  val selectionClipboard: Boolean = js.native
  val selectionHighlight: Boolean = js.native
  val showFoldingControls: always | mouseover = js.native
  val suggest: InternalSuggestOptions = js.native
  val suggestFontSize: Double = js.native
  val suggestLineHeight: Double = js.native
  val suggestOnTriggerCharacters: Boolean = js.native
  val suggestSelection: first | recentlyUsed | recentlyUsedByPrefix = js.native
  val tabCompletion: on | off | onlySnippets = js.native
  val wordBasedSuggestions: Boolean = js.native
}

object EditorContribOptions {
  @scala.inline
  def apply(
    acceptSuggestionOnCommitCharacter: Boolean,
    acceptSuggestionOnEnter: on | smart | off,
    codeActionsOnSave: ICodeActionsOnSaveOptions,
    codeActionsOnSaveTimeout: Double,
    codeLens: Boolean,
    colorDecorators: Boolean,
    contextmenu: Boolean,
    find: InternalEditorFindOptions,
    folding: Boolean,
    foldingStrategy: auto | indentation,
    formatOnPaste: Boolean,
    formatOnType: Boolean,
    gotoLocation: InternalGoToLocationOptions,
    hover: InternalEditorHoverOptions,
    lightbulbEnabled: Boolean,
    links: Boolean,
    matchBrackets: Boolean,
    occurrencesHighlight: Boolean,
    parameterHints: InternalParameterHintOptions,
    quickSuggestions: Boolean | AnonComments,
    quickSuggestionsDelay: Double,
    selectionClipboard: Boolean,
    selectionHighlight: Boolean,
    showFoldingControls: always | mouseover,
    suggest: InternalSuggestOptions,
    suggestFontSize: Double,
    suggestLineHeight: Double,
    suggestOnTriggerCharacters: Boolean,
    suggestSelection: first | recentlyUsed | recentlyUsedByPrefix,
    tabCompletion: on | off | onlySnippets,
    wordBasedSuggestions: Boolean
  ): EditorContribOptions = {
    val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], codeActionsOnSave = codeActionsOnSave.asInstanceOf[js.Any], codeActionsOnSaveTimeout = codeActionsOnSaveTimeout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], lightbulbEnabled = lightbulbEnabled.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], wordBasedSuggestions = wordBasedSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorContribOptions]
  }
  @scala.inline
  implicit class EditorContribOptionsOps[Self <: EditorContribOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptSuggestionOnCommitCharacter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnCommitCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptSuggestionOnEnter(value: on | smart | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeActionsOnSave(value: ICodeActionsOnSaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionsOnSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeActionsOnSaveTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionsOnSaveTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeLens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorDecorators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextmenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFind(value: InternalEditorFindOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFoldingStrategy(value: auto | indentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatOnPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatOnType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGotoLocation(value: InternalGoToLocationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(value: InternalEditorHoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightbulbEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightbulbEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccurrencesHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterHints(value: InternalParameterHintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickSuggestions(value: Boolean | AnonComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickSuggestionsDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestionsDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFoldingControls(value: always | mouseover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFoldingControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggest(value: InternalSuggestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestOnTriggerCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestOnTriggerCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestSelection(value: first | recentlyUsed | recentlyUsedByPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabCompletion(value: on | off | onlySnippets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordBasedSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordBasedSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

