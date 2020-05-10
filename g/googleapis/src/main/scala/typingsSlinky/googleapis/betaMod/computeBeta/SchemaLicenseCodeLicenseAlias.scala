package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLicenseCodeLicenseAlias extends js.Object {
  /**
    * [Output Only] Description of this License Code.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of license corresponding to this License Code.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaLicenseCodeLicenseAlias {
  @scala.inline
  def apply(): SchemaLicenseCodeLicenseAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseCodeLicenseAlias]
  }
  @scala.inline
  implicit class SchemaLicenseCodeLicenseAliasOps[Self <: SchemaLicenseCodeLicenseAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
  }
  
}

