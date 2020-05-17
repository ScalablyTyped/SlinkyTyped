package typingsSlinky.reactMosaicComponent.mosaicDropTargetMod

import typingsSlinky.reactMosaicComponent.internalTypesMod.MosaicDropTargetPosition
import typingsSlinky.reactMosaicComponent.typesMod.MosaicPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicDropTargetProps extends js.Object {
  var path: MosaicPath = js.native
  var position: MosaicDropTargetPosition = js.native
}

object MosaicDropTargetProps {
  @scala.inline
  def apply(path: MosaicPath, position: MosaicDropTargetPosition): MosaicDropTargetProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicDropTargetProps]
  }
  @scala.inline
  implicit class MosaicDropTargetPropsOps[Self <: MosaicDropTargetProps] (val x: Self) extends AnyVal {
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
    def withPosition(value: MosaicDropTargetPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

