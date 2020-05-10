package typingsSlinky.pEvent.mod

import typingsSlinky.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends MultipleOptions[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultipleMultiArgumentsOptions: `true` = js.native
}

object MultipleMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType](count: Double, multiArgs: `true`): MultipleMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], multiArgs = multiArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
  }
  @scala.inline
  implicit class MultipleMultiArgumentsOptionsOps[Self[emittedtype] <: MultipleMultiArgumentsOptions[emittedtype], EmittedType] (val x: Self[EmittedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EmittedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EmittedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EmittedType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EmittedType] with Other]
    @scala.inline
    def withMultiArgs(value: `true`): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

