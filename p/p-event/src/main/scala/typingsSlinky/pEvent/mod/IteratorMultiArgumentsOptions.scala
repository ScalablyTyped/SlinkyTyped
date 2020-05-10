package typingsSlinky.pEvent.mod

import typingsSlinky.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends IteratorOptions[EmittedType] {
  @JSName("multiArgs")
  var multiArgs_IteratorMultiArgumentsOptions: `true` = js.native
}

object IteratorMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType](multiArgs: `true`): IteratorMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
  }
  @scala.inline
  implicit class IteratorMultiArgumentsOptionsOps[Self[emittedtype] <: IteratorMultiArgumentsOptions[emittedtype], EmittedType] (val x: Self[EmittedType]) extends AnyVal {
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

