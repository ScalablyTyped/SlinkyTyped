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
  def apply(
    Type: Type,
    DisplayName: DisplayName = null,
    EmailAddress: EmailAddress = null,
    ID: ID = null,
    URI: URI = null
  ): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    if (URI != null) __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
}

