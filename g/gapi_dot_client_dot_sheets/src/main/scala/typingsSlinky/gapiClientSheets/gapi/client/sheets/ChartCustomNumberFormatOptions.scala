package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartCustomNumberFormatOptions extends js.Object {
  /**
    * Custom prefix to be prepended to the chart attribute.
    * This field is optional.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Custom suffix to be appended to the chart attribute.
    * This field is optional.
    */
  var suffix: js.UndefOr[String] = js.native
}

object ChartCustomNumberFormatOptions {
  @scala.inline
  def apply(): ChartCustomNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCustomNumberFormatOptions]
  }
  @scala.inline
  implicit class ChartCustomNumberFormatOptionsOps[Self <: ChartCustomNumberFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

