package typingsSlinky.phosphorWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette empty message.
  */
@js.native
trait IEmptyMessageRenderData extends js.Object {
  /**
    * The query which failed to match any commands.
    */
  var query: String = js.native
}

object IEmptyMessageRenderData {
  @scala.inline
  def apply(query: String): IEmptyMessageRenderData = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmptyMessageRenderData]
  }
  @scala.inline
  implicit class IEmptyMessageRenderDataOps[Self <: IEmptyMessageRenderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

