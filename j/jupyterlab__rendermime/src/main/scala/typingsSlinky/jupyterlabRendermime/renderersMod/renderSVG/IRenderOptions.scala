package typingsSlinky.jupyterlabRendermime.renderersMod.renderSVG

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderSVG` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  /**
    * The host node for the rendered SVG.
    */
  var host: HTMLElement = js.native
  /**
    * The SVG source.
    */
  var source: String = js.native
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean = js.native
  /**
    * Whether the svg should be unconfined.
    */
  var unconfined: js.UndefOr[Boolean] = js.native
}

object IRenderOptions {
  @scala.inline
  def apply(host: HTMLElement, source: String, trusted: Boolean): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
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
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
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
  }
  
}

