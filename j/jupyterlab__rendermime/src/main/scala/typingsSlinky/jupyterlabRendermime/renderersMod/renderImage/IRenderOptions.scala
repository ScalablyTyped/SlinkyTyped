package typingsSlinky.jupyterlabRendermime.renderersMod.renderImage

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderImage` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  /**
    * The optional height for the image.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The image node to update with the content.
    */
  var host: HTMLElement = js.native
  /**
    * The mime type for the image.
    */
  var mimeType: String = js.native
  /**
    * Whether an image requires a background for legibility.
    */
  var needsBackground: js.UndefOr[String] = js.native
  /**
    * The base64 encoded source for the image.
    */
  var source: String = js.native
  /**
    * Whether the image should be unconfined.
    */
  var unconfined: js.UndefOr[Boolean] = js.native
  /**
    * The optional width for the image.
    */
  var width: js.UndefOr[Double] = js.native
}

object IRenderOptions {
  @scala.inline
  def apply(host: HTMLElement, mimeType: String, source: String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
  @scala.inline
  implicit class IRenderOptionsOps[Self <: IRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withUnconfined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unconfined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnconfined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unconfined")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

