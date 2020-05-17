package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationMetadata extends js.Object {
  var applicationId: String = js.native
  var images: js.Array[Image] = js.native
  var name: String = js.native
  var namespaces: js.Array[String] = js.native
}

object ApplicationMetadata {
  @scala.inline
  def apply(applicationId: String, images: js.Array[Image], name: String, namespaces: js.Array[String]): ApplicationMetadata = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadata]
  }
  @scala.inline
  implicit class ApplicationMetadataOps[Self <: ApplicationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

