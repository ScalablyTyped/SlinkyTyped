package typingsSlinky.contentDisposition.mod

import typingsSlinky.contentDisposition.contentDispositionStrings.`inline`
import typingsSlinky.contentDisposition.contentDispositionStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If the filename option is outside ISO-8859-1,
    * then the file name is actually stored in a supplemental field for clients
    * that support Unicode file names and a ISO-8859-1 version of the file name is automatically generated
    * @default true
    */
  var fallback: js.UndefOr[String | Boolean] = js.native
  /**
    * Specifies the disposition type.
    * This can also be "inline", or any other value (all values except `inline` are treated like attachment,
    * but can convey additional information if both parties agree to it).
    * The `type` is normalized to lower-case.
    * @default 'attachment'
    */
  var `type`: js.UndefOr[attachment | `inline` | String] = js.native
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
    def withFallback(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: attachment | `inline` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

