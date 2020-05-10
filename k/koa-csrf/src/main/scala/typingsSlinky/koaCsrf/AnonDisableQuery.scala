package typingsSlinky.koaCsrf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisableQuery extends js.Object {
  var disableQuery: js.UndefOr[Boolean] = js.native
  var excludedMethods: js.UndefOr[js.Array[String]] = js.native
  var invalidSessionSecretMessage: js.UndefOr[String] = js.native
  var invalidSessionSecretStatusCode: js.UndefOr[Double] = js.native
  var invalidTokenMessage: js.UndefOr[String] = js.native
  var invalidTokenStatusCode: js.UndefOr[Double] = js.native
}

object AnonDisableQuery {
  @scala.inline
  def apply(): AnonDisableQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisableQuery]
  }
  @scala.inline
  implicit class AnonDisableQueryOps[Self <: AnonDisableQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidSessionSecretMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidSessionSecretMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidSessionSecretMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidSessionSecretMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidSessionSecretStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidSessionSecretStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidSessionSecretStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidSessionSecretStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidTokenMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTokenMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidTokenMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTokenMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidTokenStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTokenStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidTokenStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidTokenStatusCode")(js.undefined)
        ret
    }
  }
  
}

