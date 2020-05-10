package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.iteration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByKeysCapability[D] extends js.Object {
  var implementation: iteration | lookup = js.native
}

object FetchByKeysCapability {
  @scala.inline
  def apply[D](implementation: iteration | lookup): FetchByKeysCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysCapability[D]]
  }
  @scala.inline
  implicit class FetchByKeysCapabilityOps[Self[d] <: FetchByKeysCapability[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withImplementation(value: iteration | lookup): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

