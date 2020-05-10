package typingsSlinky.officeUiFabricReact.dragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropContext extends js.Object {
  /**
    * Data associated with drag & drop action.
    */
  var data: js.Any = js.native
  /**
    * Index of drag & drop action.
    */
  var index: Double = js.native
  /**
    * Whether or not drag & drop region is indivual or group of content.
    */
  var isGroup: js.UndefOr[Boolean] = js.native
}

object IDragDropContext {
  @scala.inline
  def apply(data: js.Any, index: Double): IDragDropContext = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropContext]
  }
  @scala.inline
  implicit class IDragDropContextOps[Self <: IDragDropContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(js.undefined)
        ret
    }
  }
  
}

