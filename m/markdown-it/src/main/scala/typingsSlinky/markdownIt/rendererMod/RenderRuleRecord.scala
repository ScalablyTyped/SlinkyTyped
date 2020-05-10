package typingsSlinky.markdownIt.rendererMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.markdownIt.libMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderRuleRecord
  extends /* type */ StringDictionary[js.UndefOr[RenderRule]] {
  var code_block: js.UndefOr[RenderRule] = js.native
  var code_inline: js.UndefOr[RenderRule] = js.native
  var fence: js.UndefOr[RenderRule] = js.native
  var hardbreak: js.UndefOr[RenderRule] = js.native
  var html_block: js.UndefOr[RenderRule] = js.native
  var html_inline: js.UndefOr[RenderRule] = js.native
  var image: js.UndefOr[RenderRule] = js.native
  var softbreak: js.UndefOr[RenderRule] = js.native
  var text: js.UndefOr[RenderRule] = js.native
}

object RenderRuleRecord {
  @scala.inline
  def apply(): RenderRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderRuleRecord]
  }
  @scala.inline
  implicit class RenderRuleRecordOps[Self <: RenderRuleRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode_block(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_block")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCode_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_block")(js.undefined)
        ret
    }
    @scala.inline
    def withCode_inline(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_inline")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCode_inline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_inline")(js.undefined)
        ret
    }
    @scala.inline
    def withFence(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fence")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fence")(js.undefined)
        ret
    }
    @scala.inline
    def withHardbreak(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardbreak")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutHardbreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardbreak")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_block(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_block")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutHtml_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_block")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_inline(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_inline")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutHtml_inline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_inline")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftbreak(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softbreak")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSoftbreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softbreak")(js.undefined)
        ret
    }
    @scala.inline
    def withText(
      value: (/* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

