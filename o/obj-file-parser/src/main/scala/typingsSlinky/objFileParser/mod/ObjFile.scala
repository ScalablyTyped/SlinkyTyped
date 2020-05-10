package typingsSlinky.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjFile extends js.Object {
  var materialLibraries: js.Array[_] = js.native
  var models: js.Array[ObjModel] = js.native
}

object ObjFile {
  @scala.inline
  def apply(materialLibraries: js.Array[_], models: js.Array[ObjModel]): ObjFile = {
    val __obj = js.Dynamic.literal(materialLibraries = materialLibraries.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjFile]
  }
  @scala.inline
  implicit class ObjFileOps[Self <: ObjFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaterialLibraries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialLibraries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModels(value: js.Array[ObjModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

