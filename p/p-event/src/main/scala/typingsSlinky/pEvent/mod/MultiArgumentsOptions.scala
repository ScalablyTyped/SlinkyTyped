package typingsSlinky.pEvent.mod

import typingsSlinky.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultiArgumentsOptions: `true` = js.native
}

object MultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType](multiArgs: `true`): MultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiArgumentsOptions[EmittedType]]
  }
  @scala.inline
  implicit class MultiArgumentsOptionsOps[Self[emittedtype] <: MultiArgumentsOptions[emittedtype], EmittedType] (val x: Self[EmittedType]) extends AnyVal {
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

