package typingsSlinky.hapi

import typingsSlinky.hapi.hapiStrings.`private`
import typingsSlinky.hapi.hapiStrings.default
import typingsSlinky.hapi.hapiStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOtherwise extends js.Object {
  var otherwise: js.UndefOr[String] = js.native
  var privacy: js.UndefOr[default | public | `private`] = js.native
  var statuses: js.UndefOr[js.Array[Double]] = js.native
}

object AnonOtherwise {
  @scala.inline
  def apply(): AnonOtherwise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOtherwise]
  }
  @scala.inline
  implicit class AnonOtherwiseOps[Self <: AnonOtherwise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtherwise(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacy(value: default | public | `private`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(js.undefined)
        ret
    }
    @scala.inline
    def withStatuses(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(js.undefined)
        ret
    }
  }
  
}

