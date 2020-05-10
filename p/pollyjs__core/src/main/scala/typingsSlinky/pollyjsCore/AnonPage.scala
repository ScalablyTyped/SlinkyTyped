package typingsSlinky.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPage extends js.Object {
  var page: js.UndefOr[js.Any] = js.native
  var requestResourceTypes: js.UndefOr[js.Array[String]] = js.native
}

object AnonPage {
  @scala.inline
  def apply(): AnonPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPage]
  }
  @scala.inline
  implicit class AnonPageOps[Self <: AnonPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestResourceTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestResourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestResourceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestResourceTypes")(js.undefined)
        ret
    }
  }
  
}

