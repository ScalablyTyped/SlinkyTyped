package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTextSnippet extends js.Object {
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.native
}

object AnonTextSnippet {
  @scala.inline
  def apply(): AnonTextSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTextSnippet]
  }
  @scala.inline
  implicit class AnonTextSnippetOps[Self <: AnonTextSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextSnippet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSnippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSnippet")(js.undefined)
        ret
    }
  }
  
}

