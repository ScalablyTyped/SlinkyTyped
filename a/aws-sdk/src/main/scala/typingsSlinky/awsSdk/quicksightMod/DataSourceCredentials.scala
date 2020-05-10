package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceCredentials extends js.Object {
  /**
    * Credential pair.
    */
  var CredentialPair: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CredentialPair] = js.native
}

object DataSourceCredentials {
  @scala.inline
  def apply(): DataSourceCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceCredentials]
  }
  @scala.inline
  implicit class DataSourceCredentialsOps[Self <: DataSourceCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentialPair(value: CredentialPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CredentialPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CredentialPair")(js.undefined)
        ret
    }
  }
  
}

