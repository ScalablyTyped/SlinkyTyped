package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grantee extends js.Object {
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DisplayName] = js.native
  /**
    * Email address of the grantee.
    */
  var EmailAddress: js.UndefOr[typingsSlinky.awsSdk.s3Mod.EmailAddress] = js.native
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ID] = js.native
  /**
    * Type of grantee
    */
  var Type: typingsSlinky.awsSdk.s3Mod.Type = js.native
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[typingsSlinky.awsSdk.s3Mod.URI] = js.native
}

object Grantee {
  @scala.inline
  def apply(Type: Type): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  @scala.inline
  implicit class GranteeOps[Self <: Grantee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withID(value: ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(js.undefined)
        ret
    }
    @scala.inline
    def withURI(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(js.undefined)
        ret
    }
  }
  
}

