package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends TypeDerived {
  var isBold: Boolean = js.native
  var isItalic: Boolean = js.native
  var isStrikeThrough: Boolean = js.native
  var isUnderline: Boolean = js.native
  var name: String = js.native
  var size: Double = js.native
}

object Font {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    isBold: Boolean,
    isItalic: Boolean,
    isStrikeThrough: Boolean,
    isUnderline: Boolean,
    name: String,
    size: Double
  ): Font = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isBold = isBold.asInstanceOf[js.Any], isItalic = isItalic.asInstanceOf[js.Any], isStrikeThrough = isStrikeThrough.asInstanceOf[js.Any], isUnderline = isUnderline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStrikeThrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrikeThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUnderline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnderline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

