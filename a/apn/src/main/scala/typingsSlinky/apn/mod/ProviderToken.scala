package typingsSlinky.apn.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderToken extends js.Object {
  /**
    * The filename of the provider token key (as supplied by Apple) to load from disk, or a Buffer/String containing the key data.
    */
  var key: Buffer | String = js.native
  /**
    * The ID of the key issued by Apple
    */
  var keyId: String = js.native
  /**
    * ID of the team associated with the provider token key
    */
  var teamId: String = js.native
}

object ProviderToken {
  @scala.inline
  def apply(key: Buffer | String, keyId: String, teamId: String): ProviderToken = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderToken]
  }
  @scala.inline
  implicit class ProviderTokenOps[Self <: ProviderToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

