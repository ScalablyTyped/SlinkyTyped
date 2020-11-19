package typingsSlinky.prosemirrorInputrules

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorInputrules.anon.Rules
import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.NodeType
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Plugin
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-inputrules", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var closeDoubleQuote: InputRule[js.Any] = js.native
  
  var closeSingleQuote: InputRule[js.Any] = js.native
  
  var ellipsis: InputRule[js.Any] = js.native
  
  var emDash: InputRule[js.Any] = js.native
  
  def inputRules[S /* <: Schema[_, _] */](config: Rules[S]): Plugin[S, _] = js.native
  
  var openDoubleQuote: InputRule[js.Any] = js.native
  
  var openSingleQuote: InputRule[js.Any] = js.native
  
  var smartQuotes: js.Array[InputRule[js.Any]] = js.native
  
  def textblockTypeInputRule[S /* <: Schema[_, _] */](regexp: js.RegExp, nodeType: NodeType[S]): InputRule[S] = js.native
  def textblockTypeInputRule[S /* <: Schema[_, _] */](
    regexp: js.RegExp,
    nodeType: NodeType[S],
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[_] | Null]]
  ): InputRule[S] = js.native
  def textblockTypeInputRule[S /* <: Schema[_, _] */](regexp: js.RegExp, nodeType: NodeType[S], getAttrs: StringDictionary[js.Any]): InputRule[S] = js.native
  
  def undoInputRule[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def undoInputRule[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* p */ Transaction[S], Unit]): Boolean = js.native
  
  def wrappingInputRule[S /* <: Schema[_, _] */](regexp: js.RegExp, nodeType: NodeType[S]): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: js.RegExp,
    nodeType: NodeType[S],
    getAttrs: js.UndefOr[scala.Nothing],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node[S], Boolean]
  ): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: js.RegExp,
    nodeType: NodeType[S],
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[_] | Null]]
  ): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: js.RegExp,
    nodeType: NodeType[S],
    getAttrs: js.Function1[/* p */ js.Array[String], js.UndefOr[StringDictionary[_] | Null]],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node[S], Boolean]
  ): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](regexp: js.RegExp, nodeType: NodeType[S], getAttrs: StringDictionary[js.Any]): InputRule[S] = js.native
  def wrappingInputRule[S /* <: Schema[_, _] */](
    regexp: js.RegExp,
    nodeType: NodeType[S],
    getAttrs: StringDictionary[js.Any],
    joinPredicate: js.Function2[/* p1 */ js.Array[String], /* p2 */ Node[S], Boolean]
  ): InputRule[S] = js.native
  
  @js.native
  class InputRule[S /* <: Schema[_, _] */] protected () extends js.Object {
    /**
      * Create an input rule. The rule applies when the user typed
      * something and the text directly in front of the cursor matches
      * `match`, which should probably end with `$`.
      *
      * The `handler` can be a string, in which case the matched text, or
      * the first matched group in the regexp, is replaced by that
      * string.
      *
      * Or a it can be a function, which will be called with the match
      * array produced by
      * [`RegExp.exec`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/exec),
      * as well as the start and end of the matched range, and which can
      * return a [transaction](#state.Transaction) that describes the
      * rule's effect, or null to indicate the input was not handled.
      */
    def this(`match`: js.RegExp, handler: String) = this()
    def this(
      `match`: js.RegExp,
      handler: js.Function4[
            /* state */ EditorState[S], 
            /* match */ js.Array[String], 
            /* start */ Double, 
            /* end */ Double, 
            Transaction[S] | Null
          ]
    ) = this()
  }
}
