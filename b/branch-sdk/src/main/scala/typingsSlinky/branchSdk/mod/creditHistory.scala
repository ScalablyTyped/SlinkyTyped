package typingsSlinky.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "creditHistory")
@js.native
object creditHistory extends js.Object {
  
  def apply(
    options: CreditHistoryOptions,
    callback: js.Function2[/* err */ BranchError, /* data */ CreditHistoryCallbackResponse, Unit]
  ): Unit = js.native
}
