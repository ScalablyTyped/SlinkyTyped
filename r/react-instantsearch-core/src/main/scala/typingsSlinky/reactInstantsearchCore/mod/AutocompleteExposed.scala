package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteExposed extends js.Object {
  var defaultRefinement: js.UndefOr[String] = js.native
}

object AutocompleteExposed {
  @scala.inline
  def apply(): AutocompleteExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteExposed]
  }
  @scala.inline
  implicit class AutocompleteExposedOps[Self <: AutocompleteExposed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRefinement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRefinement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(js.undefined)
        ret
    }
  }
  
}

