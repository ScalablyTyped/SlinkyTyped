package typingsSlinky.novaEditorNode

import typingsSlinky.novaEditorNode.anon.Args
import typingsSlinky.novaEditorNode.anon.Cwd
import typingsSlinky.novaEditorNode.anon.DataProvider
import typingsSlinky.novaEditorNode.anon.Env
import typingsSlinky.novaEditorNode.anon.InitializationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /// https://novadocs.panic.com/api-reference/charset/
  @JSGlobal("Charset")
  @js.native
  class Charset ()
    extends typingsSlinky.novaEditorNode.Charset {
    def this(characters: String) = this()
  }
  object Charset {
    
    @JSGlobal("Charset")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Charset.alphanumeric")
    @js.native
    def alphanumeric: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def alphanumeric_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.digits")
    @js.native
    def digits: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def digits_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("digits")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.letters")
    @js.native
    def letters: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def letters_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letters")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.lower")
    @js.native
    def lower: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def lower_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lower")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.newlines")
    @js.native
    def newlines: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def newlines_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newlines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.symbols")
    @js.native
    def symbols: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def symbols_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.upper")
    @js.native
    def upper: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def upper_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upper")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.whitespace")
    @js.native
    def whitespace: typingsSlinky.novaEditorNode.Charset = js.native
    
    /* static member */
    @JSGlobal("Charset.whitespaceAndNewlines")
    @js.native
    def whitespaceAndNewlines: typingsSlinky.novaEditorNode.Charset = js.native
    @scala.inline
    def whitespaceAndNewlines_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespaceAndNewlines")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def whitespace_=(x: typingsSlinky.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Color")
  @js.native
  class Color protected ()
    extends typingsSlinky.novaEditorNode.Color {
    def this(format: ColorFormat, components: ColorComponents) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/completion-item/
  @JSGlobal("CompletionItem")
  @js.native
  class CompletionItem protected ()
    extends typingsSlinky.novaEditorNode.CompletionItem {
    def this(label: String, kind: CompletionItemKind) = this()
  }
  
  @JSGlobal("CompletionItemKind")
  @js.native
  object CompletionItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.novaEditorNode.CompletionItemKind with Double] = js.native
    
    /* 14 */ val Argument: typingsSlinky.novaEditorNode.CompletionItemKind.Argument with Double = js.native
    
    /* 2 */ val Category: typingsSlinky.novaEditorNode.CompletionItemKind.Category with Double = js.native
    
    /* 1 */ val Class: typingsSlinky.novaEditorNode.CompletionItemKind.Class with Double = js.native
    
    /* 9 */ val Closure: typingsSlinky.novaEditorNode.CompletionItemKind.Closure with Double = js.native
    
    /* 15 */ val Color: typingsSlinky.novaEditorNode.CompletionItemKind.Color with Double = js.native
    
    /* 11 */ val Constant: typingsSlinky.novaEditorNode.CompletionItemKind.Constant with Double = js.native
    
    /* 10 */ val Constructor: typingsSlinky.novaEditorNode.CompletionItemKind.Constructor with Double = js.native
    
    /* 4 */ val Enum: typingsSlinky.novaEditorNode.CompletionItemKind.Enum with Double = js.native
    
    /* 16 */ val EnumMember: typingsSlinky.novaEditorNode.CompletionItemKind.EnumMember with Double = js.native
    
    /* 18 */ val Expression: typingsSlinky.novaEditorNode.CompletionItemKind.Expression with Double = js.native
    
    /* 21 */ val File: typingsSlinky.novaEditorNode.CompletionItemKind.File with Double = js.native
    
    /* 7 */ val Function: typingsSlinky.novaEditorNode.CompletionItemKind.Function with Double = js.native
    
    /* 3 */ val Interface: typingsSlinky.novaEditorNode.CompletionItemKind.Interface with Double = js.native
    
    /* 23 */ val Keyword: typingsSlinky.novaEditorNode.CompletionItemKind.Keyword with Double = js.native
    
    /* 8 */ val Method: typingsSlinky.novaEditorNode.CompletionItemKind.Method with Double = js.native
    
    /* 20 */ val Package: typingsSlinky.novaEditorNode.CompletionItemKind.Package with Double = js.native
    
    /* 13 */ val Property: typingsSlinky.novaEditorNode.CompletionItemKind.Property with Double = js.native
    
    /* 22 */ val Reference: typingsSlinky.novaEditorNode.CompletionItemKind.Reference with Double = js.native
    
    /* 17 */ val Statement: typingsSlinky.novaEditorNode.CompletionItemKind.Statement with Double = js.native
    
    /* 6 */ val Struct: typingsSlinky.novaEditorNode.CompletionItemKind.Struct with Double = js.native
    
    /* 27 */ val StyleClass: typingsSlinky.novaEditorNode.CompletionItemKind.StyleClass with Double = js.native
    
    /* 25 */ val StyleDirective: typingsSlinky.novaEditorNode.CompletionItemKind.StyleDirective with Double = js.native
    
    /* 26 */ val StyleID: typingsSlinky.novaEditorNode.CompletionItemKind.StyleID with Double = js.native
    
    /* 24 */ val StyleRuleset: typingsSlinky.novaEditorNode.CompletionItemKind.StyleRuleset with Double = js.native
    
    /* 19 */ val Tag: typingsSlinky.novaEditorNode.CompletionItemKind.Tag with Double = js.native
    
    /* 0 */ val Type: typingsSlinky.novaEditorNode.CompletionItemKind.Type with Double = js.native
    
    /* 5 */ val Union: typingsSlinky.novaEditorNode.CompletionItemKind.Union with Double = js.native
    
    /* 12 */ val Variable: typingsSlinky.novaEditorNode.CompletionItemKind.Variable with Double = js.native
  }
  
  @JSGlobal("CompletionReason")
  @js.native
  object CompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.novaEditorNode.CompletionReason with Double] = js.native
    
    /* 1 */ val Character: typingsSlinky.novaEditorNode.CompletionReason.Character with Double = js.native
    
    /* 0 */ val Invoke: typingsSlinky.novaEditorNode.CompletionReason.Invoke with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/composite-disposable/
  @JSGlobal("CompositeDisposable")
  @js.native
  class CompositeDisposable ()
    extends typingsSlinky.novaEditorNode.CompositeDisposable
  
  /// https://novadocs.panic.com/api-reference/disposable/
  @JSGlobal("Disposable")
  @js.native
  class Disposable ()
    extends typingsSlinky.novaEditorNode.Disposable
  object Disposable {
    
    /* static member */
    @JSGlobal("Disposable.isDisposable")
    @js.native
    def isDisposable(x: js.Any): /* is nova-editor-node.Disposable */ Boolean = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/emitter/
  @JSGlobal("Emitter")
  @js.native
  class Emitter ()
    extends typingsSlinky.novaEditorNode.Emitter
  
  @JSGlobal("FileSystem")
  @js.native
  class FileSystem protected ()
    extends typingsSlinky.novaEditorNode.FileSystem
  
  @JSGlobal("InsertTextFormat")
  @js.native
  object InsertTextFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.novaEditorNode.InsertTextFormat with Double] = js.native
    
    /* 0 */ val PlainText: typingsSlinky.novaEditorNode.InsertTextFormat.PlainText with Double = js.native
    
    /* 1 */ val Snippet: typingsSlinky.novaEditorNode.InsertTextFormat.Snippet with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/issue/
  @JSGlobal("Issue")
  @js.native
  class Issue ()
    extends typingsSlinky.novaEditorNode.Issue
  
  /// https://novadocs.panic.com/api-reference/issue-collection/
  @JSGlobal("IssueCollection")
  @js.native
  class IssueCollection ()
    extends typingsSlinky.novaEditorNode.IssueCollection {
    def this(name: String) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/issue-parser/
  @JSGlobal("IssueParser")
  @js.native
  class IssueParser ()
    extends typingsSlinky.novaEditorNode.IssueParser {
    def this(matcherNames: String) = this()
    def this(matcherNames: js.Array[String]) = this()
  }
  
  @JSGlobal("IssueSeverity")
  @js.native
  object IssueSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.novaEditorNode.IssueSeverity with Double] = js.native
    
    /* 0 */ val Error: typingsSlinky.novaEditorNode.IssueSeverity.Error with Double = js.native
    
    /* 2 */ val Hint: typingsSlinky.novaEditorNode.IssueSeverity.Hint with Double = js.native
    
    /* 3 */ val Info: typingsSlinky.novaEditorNode.IssueSeverity.Info with Double = js.native
    
    /* 1 */ val Warning: typingsSlinky.novaEditorNode.IssueSeverity.Warning with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/language-client/
  @JSGlobal("LanguageClient")
  @js.native
  class LanguageClient protected ()
    extends typingsSlinky.novaEditorNode.LanguageClient {
    def this(identifier: String, name: String, serverOptions: Args, clientOptions: InitializationOptions) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/notification-request/
  @JSGlobal("NotificationRequest")
  @js.native
  class NotificationRequest protected ()
    extends typingsSlinky.novaEditorNode.NotificationRequest {
    def this(identifier: String) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/process/
  // This could be improved to split into automatic pipe and jsonrpc types with
  // the appropriate methods enabled, but because stdio is configured within
  // options it feels like overkill
  @JSGlobal("Process")
  @js.native
  class Process protected ()
    extends typingsSlinky.novaEditorNode.Process {
    def this(command: String) = this()
    def this(command: String, options: Cwd) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/range/
  @JSGlobal("Range")
  @js.native
  class Range protected ()
    extends typingsSlinky.novaEditorNode.Range {
    def this(start: Double, end: Double) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/scanner/
  @JSGlobal("Scanner")
  @js.native
  class Scanner protected ()
    extends typingsSlinky.novaEditorNode.Scanner {
    def this(string: String) = this()
  }
  
  @JSGlobal("Task")
  @js.native
  class Task protected ()
    extends typingsSlinky.novaEditorNode.Task {
    def this(name: String) = this()
  }
  object Task {
    
    /* static member */
    @JSGlobal("Task.Build")
    @js.native
    val Build: TaskName = js.native
    
    /* static member */
    @JSGlobal("Task.Clean")
    @js.native
    val Clean: TaskName = js.native
    
    /* static member */
    @JSGlobal("Task.Run")
    @js.native
    val Run: TaskName = js.native
  }
  
  /// https://docs.nova.app/api-reference/task-process-action/
  @JSGlobal("TaskProcessAction")
  @js.native
  class TaskProcessAction protected ()
    extends typingsSlinky.novaEditorNode.TaskProcessAction {
    def this(command: String) = this()
    def this(command: String, options: Env) = this()
  }
  
  /// https://docs.nova.app/api-reference/text-edit/
  @JSGlobal("TextEdit")
  @js.native
  class TextEdit protected ()
    extends typingsSlinky.novaEditorNode.TextEdit {
    def this(range: typingsSlinky.novaEditorNode.Range, newText: String) = this()
  }
  object TextEdit {
    
    /* static member */
    @JSGlobal("TextEdit.delete")
    @js.native
    def delete(range: typingsSlinky.novaEditorNode.Range): typingsSlinky.novaEditorNode.TextEdit = js.native
    
    /* static member */
    @JSGlobal("TextEdit.insert")
    @js.native
    def insert(position: Double, newText: String): typingsSlinky.novaEditorNode.TextEdit = js.native
    
    /* static member */
    @JSGlobal("TextEdit.replace")
    @js.native
    def replace(range: typingsSlinky.novaEditorNode.Range, newText: String): typingsSlinky.novaEditorNode.TextEdit = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/text-editor/
  @JSGlobal("TextEditor")
  @js.native
  class TextEditor protected ()
    extends typingsSlinky.novaEditorNode.TextEditor
  object TextEditor {
    
    /* static member */
    @JSGlobal("TextEditor.isTextEditor")
    @js.native
    def isTextEditor(`object`: js.Any): /* is nova-editor-node.TextEditor */ Boolean = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/tree-item/
  @JSGlobal("TreeItem")
  @js.native
  class TreeItem protected ()
    extends typingsSlinky.novaEditorNode.TreeItem {
    def this(name: String) = this()
    def this(name: String, collapsibleState: TreeItemCollapsibleState) = this()
  }
  
  @JSGlobal("TreeItemCollapsibleState")
  @js.native
  object TreeItemCollapsibleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.novaEditorNode.TreeItemCollapsibleState with Double] = js.native
    
    /* 1 */ val Collapsed: typingsSlinky.novaEditorNode.TreeItemCollapsibleState.Collapsed with Double = js.native
    
    /* 2 */ val Expanded: typingsSlinky.novaEditorNode.TreeItemCollapsibleState.Expanded with Double = js.native
    
    /* 0 */ val None: typingsSlinky.novaEditorNode.TreeItemCollapsibleState.None with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/tree-view/
  @JSGlobal("TreeView")
  @js.native
  class TreeView[E] protected ()
    extends typingsSlinky.novaEditorNode.TreeView[E] {
    def this(identifier: String) = this()
    def this(identifier: String, options: DataProvider[E]) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/
  @JSGlobal("atob")
  @js.native
  def atob(data: String): String = js.native
  
  @JSGlobal("btoa")
  @js.native
  def btoa(data: String): String = js.native
  
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(): Unit = js.native
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(handle: Double): Unit = js.native
  
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(): Unit = js.native
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(handle: Double): Unit = js.native
  
  @JSGlobal("nova")
  @js.native
  val nova: Environment = js.native
  
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}
