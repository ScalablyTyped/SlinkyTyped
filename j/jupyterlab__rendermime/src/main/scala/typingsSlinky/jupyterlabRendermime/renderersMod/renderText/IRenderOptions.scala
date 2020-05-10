package typingsSlinky.jupyterlabRendermime.renderersMod.renderText

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.sanitizerMod.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderText` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  /**
    * The host node for the text content.
    */
  var host: HTMLElement = js.native
  /**
    * The html sanitizer for untrusted source.
    */
  var sanitizer: ISanitizer = js.native
  /**
    * The source text to render.
    */
  var source: String = js.native
}

object IRenderOptions {
  @scala.inline
  def apply(host: HTMLElement, sanitizer: ISanitizer, source: String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
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
    def withSanitizer(value: ISanitizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

