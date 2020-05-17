package typingsSlinky.reactQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exact extends js.Object {
  var exact: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var throwOnError: js.UndefOr[Boolean] = js.native
}

object Exact {
  @scala.inline
  def apply(): Exact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exact]
  }
  @scala.inline
  implicit class ExactOps[Self <: Exact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnError")(js.undefined)
        ret
    }
  }
  
}

