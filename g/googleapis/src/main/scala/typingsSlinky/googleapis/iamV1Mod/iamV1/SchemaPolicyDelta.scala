package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The difference delta between two policies.
  */
@js.native
trait SchemaPolicyDelta extends js.Object {
  /**
    * The delta for Bindings between two policies.
    */
  var bindingDeltas: js.UndefOr[js.Array[SchemaBindingDelta]] = js.native
}

object SchemaPolicyDelta {
  @scala.inline
  def apply(): SchemaPolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyDelta]
  }
  @scala.inline
  implicit class SchemaPolicyDeltaOps[Self <: SchemaPolicyDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingDeltas(value: js.Array[SchemaBindingDelta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingDeltas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingDeltas")(js.undefined)
        ret
    }
  }
  
}

