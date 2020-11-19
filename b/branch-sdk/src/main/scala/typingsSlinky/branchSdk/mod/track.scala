package typingsSlinky.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("branch-sdk", "track")
@js.native
object track extends js.Object {
  
  def apply(event: String): Unit = js.native
  def apply(
    event: String,
    metadata: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
  def apply(event: String, metadata: js.Object): Unit = js.native
  def apply(event: String, metadata: js.Object, callback: js.Function1[/* err */ BranchError, Unit]): Unit = js.native
}
