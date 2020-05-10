package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import org.scalajs.dom.raw.VisibilityState
import typingsSlinky.firebaseFirestore.firebaseFirestoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecClientState extends js.Object {
  /** Whether this tab should try to forcefully become primary. */
  var primary: js.UndefOr[`true`] = js.native
  /** The visibility state of the browser tab running the client. */
  var visibility: js.UndefOr[VisibilityState] = js.native
}

object SpecClientState {
  @scala.inline
  def apply(): SpecClientState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecClientState]
  }
  @scala.inline
  implicit class SpecClientStateOps[Self <: SpecClientState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimary(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: VisibilityState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

