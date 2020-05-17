package typingsSlinky.jimpPluginPrint.anon

import typingsSlinky.jimpPluginPrint.mod.PrintableText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignmentX extends PrintableText {
  var alignmentX: Double = js.native
  var alignmentY: Double = js.native
  var text: String = js.native
}

object AlignmentX {
  @scala.inline
  def apply(alignmentX: Double, alignmentY: Double, text: String): AlignmentX = {
    val __obj = js.Dynamic.literal(alignmentX = alignmentX.asInstanceOf[js.Any], alignmentY = alignmentY.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentX]
  }
  @scala.inline
  implicit class AlignmentXOps[Self <: AlignmentX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignmentY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

