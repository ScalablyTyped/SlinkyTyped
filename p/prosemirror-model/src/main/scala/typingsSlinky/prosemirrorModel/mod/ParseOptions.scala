package typingsSlinky.prosemirrorModel.mod

import typingsSlinky.prosemirrorModel.AnonNode
import typingsSlinky.prosemirrorModel.prosemirrorModelStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * A set of additional nodes to count as
    * [context](#model.ParseRule.context) when parsing, above the
    * given [top node](#model.ParseOptions.topNode).
    */
  var context: js.UndefOr[ResolvedPos[S] | Null] = js.native
  /**
    * When given, the parser will, beside parsing the content,
    * record the document positions of the given DOM positions. It
    * will do so by writing to the objects, adding a `pos` property
    * that holds the document position. DOM positions that are not
    * in the parsed content will not be written to.
    */
  var findPositions: js.UndefOr[js.Array[AnonNode] | Null] = js.native
  /**
    * The child node index to start parsing from.
    */
  var from: js.UndefOr[Double | Null] = js.native
  /**
    * By default, whitespace is collapsed as per HTML's rules. Pass
    * `true` to preserve whitespace, but normalize newlines to
    * spaces, and `"full"` to preserve whitespace entirely.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.native
  /**
    * The child node index to stop parsing at.
    */
  var to: js.UndefOr[Double | Null] = js.native
  /**
    * Provide the starting content match that content parsed into the
    * top node is matched against.
    */
  var topMatch: js.UndefOr[ContentMatch[_] | Null] = js.native
  /**
    * By default, the content is parsed into the schema's default
    * [top node type](#model.Schema.topNodeType). You can pass this
    * option to use the type and attributes from a different node
    * as the top container.
    */
  var topNode: js.UndefOr[ProsemirrorNode[S] | Null] = js.native
}

object ParseOptions {
  @scala.inline
  def apply[S](): ParseOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions[S]]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self[s] <: ParseOptions[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withContext(value: ResolvedPos[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContextNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withFindPositions(value: js.Array[AnonNode]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindPositions: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withFindPositionsNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPositions")(null)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withFromNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(null)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean | full): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespaceNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(null)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withToNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(null)
        ret
    }
    @scala.inline
    def withTopMatch(value: ContentMatch[_]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopMatch: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMatchNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMatch")(null)
        ret
    }
    @scala.inline
    def withTopNode(value: ProsemirrorNode[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopNode: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topNode")(js.undefined)
        ret
    }
    @scala.inline
    def withTopNodeNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topNode")(null)
        ret
    }
  }
  
}

