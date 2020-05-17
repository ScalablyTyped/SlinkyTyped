package typingsSlinky.makerJs.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModel
import typingsSlinky.makerJs.MakerJs.IModelMap
import typingsSlinky.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OvalArc extends IModel {
  @JSName("models")
  var models_OvalArc: IModelMap = js.native
  @JSName("paths")
  var paths_OvalArc: IPathMap = js.native
}

object OvalArc {
  @scala.inline
  def apply(models: IModelMap, paths: IPathMap): OvalArc = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OvalArc]
  }
  @scala.inline
  implicit class OvalArcOps[Self <: OvalArc] (val x: Self) extends AnyVal {
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
    def withPaths(value: IPathMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

