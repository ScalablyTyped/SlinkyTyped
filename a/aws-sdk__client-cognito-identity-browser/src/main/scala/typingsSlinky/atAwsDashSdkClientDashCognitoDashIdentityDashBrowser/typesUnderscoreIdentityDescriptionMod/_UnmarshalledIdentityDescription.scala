package typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreIdentityDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledIdentityDescription extends _IdentityDescription {
  /**
    * <p>Date on which the identity was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate__UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  @JSName("LastModifiedDate")
  var LastModifiedDate__UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  @JSName("Logins")
  var Logins__UnmarshalledIdentityDescription: js.UndefOr[js.Array[String]] = js.undefined
}

object _UnmarshalledIdentityDescription {
  @scala.inline
  def apply(
    CreationDate: js.Date = null,
    IdentityId: String = null,
    LastModifiedDate: js.Date = null,
    Logins: js.Array[String] = null
  ): _UnmarshalledIdentityDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Logins != null) __obj.updateDynamic("Logins")(Logins.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledIdentityDescription]
  }
}

