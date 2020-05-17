package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateURL extends js.Object {
  def createURL(args: js.Any*): String = js.native
  def refine(args: js.Any*): js.Any = js.native
  def searchForItems(args: js.Any*): js.Any = js.native
}

object CreateURL {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => String,
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): CreateURL = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[CreateURL]
  }
  @scala.inline
  implicit class CreateURLOps[Self <: CreateURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateURL(value: /* repeated */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefine(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearchForItems(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchForItems")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

