package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementsListResponse extends js.Object {
  /**
    * An entitlement of a user to a product (e.g. an app). For example, a free app that they have installed, or a paid app that they have been allocated a
    * license to.
    */
  var entitlement: js.UndefOr[js.Array[Entitlement]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#entitlementsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object EntitlementsListResponse {
  @scala.inline
  def apply(): EntitlementsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementsListResponse]
  }
  @scala.inline
  implicit class EntitlementsListResponseOps[Self <: EntitlementsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlement(value: js.Array[Entitlement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlement")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

