package typingsSlinky.octokitRest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  /**
    * `json` by default. Can be `raw`, `text`, `html`, `full`, `diff`, `patch`, `sha`, `base64`. Depending on endpoint
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Custom media type names of {@link https://developer.github.com/v3/media/|API Previews} without the `-preview` suffix.
    * Example for single preview: `['squirrel-girl']`.
    * Example for multiple previews: `['squirrel-girl', 'mister-fantastic']`.
    */
  var previews: js.UndefOr[js.Array[String]] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviews(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previews")(js.undefined)
        ret
    }
  }
  
}

