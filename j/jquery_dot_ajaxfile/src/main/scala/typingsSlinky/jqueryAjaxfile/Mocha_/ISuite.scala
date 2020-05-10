package typingsSlinky.jqueryAjaxfile.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Suite` class. */
@js.native
trait ISuite extends js.Object {
  var parent: ISuite = js.native
  var title: String = js.native
  def fullTitle(): String = js.native
}

object ISuite {
  @scala.inline
  def apply(fullTitle: () => String, parent: ISuite, title: String): ISuite = {
    val __obj = js.Dynamic.literal(fullTitle = js.Any.fromFunction0(fullTitle), parent = parent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuite]
  }
  @scala.inline
  implicit class ISuiteOps[Self <: ISuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: ISuite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

