package typingsSlinky.asymmetrikLeafletD3.mod.HexbinHoverHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundOptions extends js.Object {
  var handlers: js.Array[typingsSlinky.asymmetrikLeafletD3.mod.HexbinHoverHandler] = js.native
}

object CompoundOptions {
  @scala.inline
  def apply(handlers: js.Array[typingsSlinky.asymmetrikLeafletD3.mod.HexbinHoverHandler]): CompoundOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundOptions]
  }
  @scala.inline
  implicit class CompoundOptionsOps[Self <: CompoundOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: js.Array[typingsSlinky.asymmetrikLeafletD3.mod.HexbinHoverHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

