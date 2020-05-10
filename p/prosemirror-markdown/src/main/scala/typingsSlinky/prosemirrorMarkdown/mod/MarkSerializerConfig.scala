package typingsSlinky.prosemirrorMarkdown.mod

import typingsSlinky.prosemirrorModel.mod.Fragment
import typingsSlinky.prosemirrorModel.mod.Mark
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkSerializerConfig[S /* <: Schema[_, _] */] extends js.Object {
  var close: String | MarkSerializerMethod[S] = js.native
  var escape: js.UndefOr[Boolean] = js.native
  var expelEnclosingWhitespace: js.UndefOr[Boolean] = js.native
  var mixable: js.UndefOr[Boolean] = js.native
  var open: String | MarkSerializerMethod[S] = js.native
}

object MarkSerializerConfig {
  @scala.inline
  def apply[S](close: String | MarkSerializerMethod[S], open: String | MarkSerializerMethod[S]): MarkSerializerConfig[S] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkSerializerConfig[S]]
  }
  @scala.inline
  implicit class MarkSerializerConfigOps[Self[s] <: MarkSerializerConfig[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withCloseFunction4(
      value: (/* state */ MarkdownSerializerState[S], /* mark */ Mark[S], /* parent */ Fragment[S], /* index */ Double) => Unit
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withClose(value: String | MarkSerializerMethod[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenFunction4(
      value: (/* state */ MarkdownSerializerState[S], /* mark */ Mark[S], /* parent */ Fragment[S], /* index */ Double) => Unit
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOpen(value: String | MarkSerializerMethod[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscape(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withExpelEnclosingWhitespace(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expelEnclosingWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpelEnclosingWhitespace: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expelEnclosingWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withMixable(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixable")(js.undefined)
        ret
    }
  }
  
}

