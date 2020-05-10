package typingsSlinky.googleapis.osloginV1Mod.osloginV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user profile information used for logging in to a virtual machine on
  * Google Compute Engine.
  */
@js.native
trait SchemaLoginProfile extends js.Object {
  /**
    * A unique user ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of POSIX accounts associated with the user.
    */
  var posixAccounts: js.UndefOr[js.Array[SchemaPosixAccount]] = js.native
  /**
    * A map from SSH public key fingerprint to the associated key object.
    */
  var sshPublicKeys: js.UndefOr[StringDictionary[SchemaSshPublicKey]] = js.native
}

object SchemaLoginProfile {
  @scala.inline
  def apply(): SchemaLoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginProfile]
  }
  @scala.inline
  implicit class SchemaLoginProfileOps[Self <: SchemaLoginProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPosixAccounts(value: js.Array[SchemaPosixAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posixAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosixAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posixAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKeys(value: StringDictionary[SchemaSshPublicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshPublicKeys")(js.undefined)
        ret
    }
  }
  
}

