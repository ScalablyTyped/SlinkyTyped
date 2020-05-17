package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentRefinementsExposed extends js.Object {
  /** Pass true to also clear the search query */
  var clearsQuery: js.UndefOr[Boolean] = js.native
  /**
    * Function to modify the items being displayed, e.g. for filtering or sorting them.
    * Takes an items as parameter and expects it back in return.
    */
  var transformItems: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object CurrentRefinementsExposed {
  @scala.inline
  def apply(): CurrentRefinementsExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentRefinementsExposed]
  }
  @scala.inline
  implicit class CurrentRefinementsExposedOps[Self <: CurrentRefinementsExposed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearsQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearsQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearsQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearsQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformItems(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformItems")(js.undefined)
        ret
    }
  }
  
}

