package typingsSlinky.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context
  extends /* prop */ StringDictionary[js.Any] {
  /* Ancestor tags */
  var parentTags: js.UndefOr[Hash[Tag]] = js.native
  /* ctx object */
  /* Root data object or array */
  var root: js.Any = js.native
  /* This tag */
  var tag: js.UndefOr[Tag] = js.native
  /* tagCtx object */
  var tagCtx: js.UndefOr[js.Any] = js.native
}

object Context {
  @scala.inline
  def apply(root: js.Any): Context = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentTags(value: Hash[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentTags")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTagCtx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCtx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagCtx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCtx")(js.undefined)
        ret
    }
  }
  
}

