package typingsSlinky.eslint.anon

import typingsSlinky.eslint.mod.AST.Token
import typingsSlinky.eslint.mod.SourceCode.CursorWithCountOptions
import typingsSlinky.eslint.mod.SourceCode.FilterPredicate
import typingsSlinky.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends CursorWithCountOptions {
  var count: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[FilterPredicate] = js.native
  var includeComments: js.UndefOr[Boolean] = js.native
}

object Count {
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* tokenOrComment */ Token | Comment => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeComments")(js.undefined)
        ret
    }
  }
  
}

