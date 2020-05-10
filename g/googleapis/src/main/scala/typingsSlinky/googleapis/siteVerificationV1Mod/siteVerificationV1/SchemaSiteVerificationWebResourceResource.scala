package typingsSlinky.googleapis.siteVerificationV1Mod.siteVerificationV1

import typingsSlinky.googleapis.AnonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceResource extends js.Object {
  /**
    * The string used to identify this site. This value should be used in the
    * &quot;id&quot; portion of the REST URL for the Get, Update, and Delete
    * operations.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The email addresses of all verified owners.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * The address and type of a site that is verified or will be verified.
    */
  var site: js.UndefOr[AnonIdentifier] = js.native
}

object SchemaSiteVerificationWebResourceResource {
  @scala.inline
  def apply(): SchemaSiteVerificationWebResourceResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceResource]
  }
  @scala.inline
  implicit class SchemaSiteVerificationWebResourceResourceOps[Self <: SchemaSiteVerificationWebResourceResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: AnonIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
  }
  
}

