package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesIdentityDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledIdentityDescription extends IdentityDescription {
  /**
    * <p>Date on which the identity was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.native
  /**
    * <p>Date on which the identity was last modified.</p>
    */
  @JSName("LastModifiedDate")
  var LastModifiedDate_UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.native
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  @JSName("Logins")
  var Logins_UnmarshalledIdentityDescription: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledIdentityDescription {
  @scala.inline
  def apply(): UnmarshalledIdentityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledIdentityDescription]
  }
  @scala.inline
  implicit class UnmarshalledIdentityDescriptionOps[Self <: UnmarshalledIdentityDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLogins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logins")(js.undefined)
        ret
    }
  }
  
}

