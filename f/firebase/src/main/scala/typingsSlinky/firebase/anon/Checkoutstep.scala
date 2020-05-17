package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkoutstep
  extends /* key */ StringDictionary[js.Any] {
  var checkout_option: js.UndefOr[String] = js.native
  var checkout_step: js.UndefOr[Double] = js.native
}

object Checkoutstep {
  @scala.inline
  def apply(): Checkoutstep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkoutstep]
  }
  @scala.inline
  implicit class CheckoutstepOps[Self <: Checkoutstep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckout_option(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckout_option: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_option")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckout_step(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckout_step: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkout_step")(js.undefined)
        ret
    }
  }
  
}

