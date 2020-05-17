package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IModelMap
import typingsSlinky.makerJs.MakerJs.IPathMap
import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slot extends IModel {
  @JSName("models")
  var models_Slot: IModelMap = js.native
  @JSName("origin")
  var origin_Slot: IPoint = js.native
  @JSName("paths")
  var paths_Slot: IPathMap = js.native
}

object Slot {
  @scala.inline
  def apply(models: IModelMap, origin: IPoint, paths: IPathMap): Slot = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slot]
  }
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModels(value: IModelMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: IPathMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

