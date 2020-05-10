package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers>> */
@js.native
trait DeepPartialPartialHeaders extends js.Object {
  var Authorization: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
  var `Content-Type`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
  var `Idempotency-Key`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
  var `User-Agent`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.native
}

object DeepPartialPartialHeaders {
  @scala.inline
  def apply(): DeepPartialPartialHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialPartialHeaders]
  }
  @scala.inline
  implicit class DeepPartialPartialHeadersOps[Self <: DeepPartialPartialHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: DeepPartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(js.undefined)
        ret
    }
    @scala.inline
    def `withContent-Type`(value: DeepPartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutContent-Type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(js.undefined)
        ret
    }
    @scala.inline
    def `withIdempotency-Key`(value: DeepPartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Idempotency-Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIdempotency-Key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Idempotency-Key")(js.undefined)
        ret
    }
    @scala.inline
    def `withUser-Agent`(value: DeepPartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUser-Agent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User-Agent")(js.undefined)
        ret
    }
  }
  
}

