package typingsSlinky.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "createIamRole")
@js.native
object createIamRole extends js.Object {
  def apply(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    includeDefaultPolicies: Boolean,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ js.Any, Unit]
  ): Unit = js.native
}

