package typingsSlinky.reactMosaicComponent.internalTypesMod

import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicDropData extends js.Object {
  var path: js.UndefOr[MosaicPath] = js.native
  var position: js.UndefOr[MosaicDropTargetPosition] = js.native
}

object MosaicDropData {
  @scala.inline
  def apply(): MosaicDropData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MosaicDropData]
  }
  @scala.inline
  implicit class MosaicDropDataOps[Self <: MosaicDropData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: MosaicPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: MosaicDropTargetPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

