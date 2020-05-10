package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Icon for a web app.
  */
@js.native
trait SchemaWebAppIcon extends js.Object {
  /**
    * The actual bytes of the image in a base64url encoded string (c.f.
    * RFC4648, section 5 &quot;Base 64 Encoding with URL and Filename Safe
    * Alphabet&quot;).   - The image type can be png or jpg. - The image should
    * ideally be square. - The image should ideally have a size of 512x512.
    */
  var imageData: js.UndefOr[String] = js.native
}

object SchemaWebAppIcon {
  @scala.inline
  def apply(): SchemaWebAppIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppIcon]
  }
  @scala.inline
  implicit class SchemaWebAppIconOps[Self <: SchemaWebAppIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageData")(js.undefined)
        ret
    }
  }
  
}

