package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Square extends IModel {
  @JSName("paths")
  var paths_Square: IPathMap = js.native
}

object Square {
  @scala.inline
  def apply(paths: IPathMap): Square = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Square]
  }
  @scala.inline
  implicit class SquareOps[Self <: Square] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaths(value: IPathMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

