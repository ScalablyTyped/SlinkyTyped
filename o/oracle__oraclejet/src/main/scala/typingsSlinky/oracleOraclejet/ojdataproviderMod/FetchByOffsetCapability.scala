package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.iteration
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.randomAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByOffsetCapability[D] extends js.Object {
  var implementation: iteration | randomAccess = js.native
}

object FetchByOffsetCapability {
  @scala.inline
  def apply[D](implementation: iteration | randomAccess): FetchByOffsetCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetCapability[D]]
  }
  @scala.inline
  implicit class FetchByOffsetCapabilityOps[Self[d] <: FetchByOffsetCapability[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withImplementation(value: iteration | randomAccess): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

