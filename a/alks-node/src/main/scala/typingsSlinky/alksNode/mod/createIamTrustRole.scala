package typingsSlinky.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "createIamTrustRole")
@js.native
object createIamTrustRole extends js.Object {
  def apply(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    trustArn: String,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ js.Any, Unit]
  ): Unit = js.native
}

