package typingsSlinky.bodyParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsText extends Options {
  /**
    * Specify the default character set for the text content if the charset
    * is not specified in the Content-Type header of the request.
    * Defaults to `utf-8`.
    */
  var defaultCharset: js.UndefOr[String] = js.native
}

object OptionsText {
  @scala.inline
  def apply(): OptionsText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsText]
  }
  @scala.inline
  implicit class OptionsTextOps[Self <: OptionsText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCharset")(js.undefined)
        ret
    }
  }
  
}

