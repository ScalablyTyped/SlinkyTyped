package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Grantee extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var Identifier: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var TypeIdentifier: js.UndefOr[S3GranteeTypeIdentifier] = js.native
}

object S3Grantee {
  @scala.inline
  def apply(): S3Grantee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Grantee]
  }
  @scala.inline
  implicit class S3GranteeOps[Self <: S3Grantee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: NonEmptyMaxLength1024String): Self = {
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
    def withIdentifier(value: NonEmptyMaxLength1024String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeIdentifier(value: S3GranteeTypeIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeIdentifier")(js.undefined)
        ret
    }
  }
  
}

