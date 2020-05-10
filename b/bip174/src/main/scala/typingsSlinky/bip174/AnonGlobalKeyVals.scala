package typingsSlinky.bip174

import typingsSlinky.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlobalKeyVals extends js.Object {
  var globalKeyVals: js.Array[KeyValue] = js.native
  var inputKeyVals: js.Array[js.Array[KeyValue]] = js.native
  var outputKeyVals: js.Array[js.Array[KeyValue]] = js.native
}

object AnonGlobalKeyVals {
  @scala.inline
  def apply(
    globalKeyVals: js.Array[KeyValue],
    inputKeyVals: js.Array[js.Array[KeyValue]],
    outputKeyVals: js.Array[js.Array[KeyValue]]
  ): AnonGlobalKeyVals = {
    val __obj = js.Dynamic.literal(globalKeyVals = globalKeyVals.asInstanceOf[js.Any], inputKeyVals = inputKeyVals.asInstanceOf[js.Any], outputKeyVals = outputKeyVals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalKeyVals]
  }
  @scala.inline
  implicit class AnonGlobalKeyValsOps[Self <: AnonGlobalKeyVals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalKeyVals(value: js.Array[KeyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalKeyVals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputKeyVals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputKeyVals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

