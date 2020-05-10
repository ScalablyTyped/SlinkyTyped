package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAccess extends js.Object {
  var `access-oauth-token`: js.UndefOr[js.Array[String]] = js.native
  var `access-oauth-uri`: js.UndefOr[String] = js.native
  var `access-password`: js.UndefOr[String] = js.native
  var `access-pin`: js.UndefOr[String] = js.native
  var `access-user-name`: js.UndefOr[String] = js.native
}

object DocumentAccess {
  @scala.inline
  def apply(): DocumentAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccess]
  }
  @scala.inline
  implicit class DocumentAccessOps[Self <: DocumentAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAccess-oauth-token`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-oauth-token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-oauth-token`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-oauth-token")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-oauth-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-oauth-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-oauth-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-oauth-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-password`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-password`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-password")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-pin`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-pin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-pin")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccess-user-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-user-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccess-user-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access-user-name")(js.undefined)
        ret
    }
  }
  
}

