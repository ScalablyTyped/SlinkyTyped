package typingsSlinky.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiNamespace extends js.Object {
  var apiNamespace: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
}

object AnonApiNamespace {
  @scala.inline
  def apply(): AnonApiNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApiNamespace]
  }
  @scala.inline
  implicit class AnonApiNamespaceOps[Self <: AnonApiNamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
  }
  
}

