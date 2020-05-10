package typingsSlinky.awsSdkClientS3Node.typesGranteeMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AmazonCustomerByEmail
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.CanonicalUser
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grantee extends js.Object {
  /**
    * <p>Screen name of the grantee.</p>
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * <p>Email address of the grantee.</p>
    */
  var EmailAddress: js.UndefOr[String] = js.native
  /**
    * <p>The canonical user ID of the grantee.</p>
    */
  var ID: js.UndefOr[String] = js.native
  /**
    * <p>Type of grantee</p>
    */
  var Type: CanonicalUser | AmazonCustomerByEmail | Group | String = js.native
  /**
    * <p>URI of the grantee group.</p>
    */
  var URI: js.UndefOr[String] = js.native
}

object Grantee {
  @scala.inline
  def apply(Type: CanonicalUser | AmazonCustomerByEmail | Group | String): Grantee = {
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
    def withType(value: CanonicalUser | AmazonCustomerByEmail | Group | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
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
    def withEmailAddress(value: String): Self = {
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
    def withID(value: String): Self = {
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
    def withURI(value: String): Self = {
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

