package typingsSlinky.prosemirrorMarkdown.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenConfig extends js.Object {
  /**
    * Attributes for the node or mark. When `getAttrs` is provided,
    * it takes precedence.
    */
  var attrs: js.UndefOr[Record[String, _]] = js.native
  /**
    * This token comes in `_open` and `_close` variants (which are
    * appended to the base token name provides a the object
    * property), and wraps a block of content. The block should be
    * wrapped in a node of the type named to by the property's
    * value.
    */
  var block: js.UndefOr[String] = js.native
  /**
    * A function used to compute the attributes for the node or mark
    * that takes a [markdown-it
    * token](https://markdown-it.github.io/markdown-it/#Token) and
    * returns an attribute object.
    */
  var getAttrs: js.UndefOr[js.Function1[/* token */ typingsSlinky.markdownIt.tokenMod.^, Record[String, _]]] = js.native
  /**
    * When true, ignore content for the matched token.
    */
  var ignore: js.UndefOr[Boolean] = js.native
  /**
    * This token also comes in `_open` and `_close` variants, but
    * should add a mark (named by the value) to its content, rather
    * than wrapping it in a node.
    */
  var mark: js.UndefOr[String] = js.native
  /**
    * This token maps to a single node, whose type can be looked up
    * in the schema under the given name. Exactly one of `node`,
    * `block`, or `mark` must be set.
    */
  var node: js.UndefOr[String] = js.native
}

object TokenConfig {
  @scala.inline
  def apply(): TokenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenConfig]
  }
  @scala.inline
  implicit class TokenConfigOps[Self <: TokenConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttrs(value: /* token */ typingsSlinky.markdownIt.tokenMod.^ => Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
  }
  
}

