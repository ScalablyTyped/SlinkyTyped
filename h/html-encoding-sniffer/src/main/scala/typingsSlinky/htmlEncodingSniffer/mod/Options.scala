package typingsSlinky.htmlEncodingSniffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		 * The ultimate fallback encoding used if no valid encoding is supplied
  		 * by the transport layer, and no encoding is sniffed from the bytes.
  		 *
  		 * @default
  		 * ```js
  		 * 'windows-1252'
  		 * ```
  		 *
  		 * Which is recommended by the algorithm's table of suggested
  		 * defaults for "All other locales" (including the `en` locale).
  		 */
  var defaultEncoding: js.UndefOr[String] = js.native
  /**
  		 * An encoding label that is obtained from the "transport layer"
  		 * (probably an HTTP `Content-Type` header), which overrides
  		 * everything but a BOM.
  		 */
  var transportLayerEncodingLabel: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportLayerEncodingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportLayerEncodingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportLayerEncodingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportLayerEncodingLabel")(js.undefined)
        ret
    }
  }
  
}

