package typingsSlinky.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifier extends js.Object {
  var bold: CodePair = js.native
  var dim: CodePair = js.native
  var hidden: CodePair = js.native
  var inverse: CodePair = js.native
  /**
    * Not widely supported
    */
  var italic: CodePair = js.native
  var reset: CodePair = js.native
  /**
    * Not widely supported
    */
  var strikethrough: CodePair = js.native
  var underline: CodePair = js.native
}

object Modifier {
  @scala.inline
  def apply(
    bold: CodePair,
    dim: CodePair,
    hidden: CodePair,
    inverse: CodePair,
    italic: CodePair,
    reset: CodePair,
    strikethrough: CodePair,
    underline: CodePair
  ): Modifier = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], dim = dim.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifier]
  }
  @scala.inline
  implicit class ModifierOps[Self <: Modifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDim(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikethrough(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

