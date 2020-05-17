package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotNumber extends js.Object {
  var font: PartialFont = js.native
  var prefix: String = js.native
  var suffix: String = js.native
  var valueformat: String = js.native
}

object PlotNumber {
  @scala.inline
  def apply(font: PartialFont, prefix: String, suffix: String, valueformat: String): PlotNumber = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNumber]
  }
  @scala.inline
  implicit class PlotNumberOps[Self <: PlotNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueformat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

