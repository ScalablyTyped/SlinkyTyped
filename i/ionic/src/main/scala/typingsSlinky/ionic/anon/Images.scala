package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.ResourcesImageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Images extends js.Object {
  var images: js.Array[ResourcesImageConfig] = js.native
  var nodeAttributes: js.Array[String] = js.native
  var nodeName: String = js.native
}

object Images {
  @scala.inline
  def apply(images: js.Array[ResourcesImageConfig], nodeAttributes: js.Array[String], nodeName: String): Images = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  @scala.inline
  implicit class ImagesOps[Self <: Images] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImages(value: js.Array[ResourcesImageConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

