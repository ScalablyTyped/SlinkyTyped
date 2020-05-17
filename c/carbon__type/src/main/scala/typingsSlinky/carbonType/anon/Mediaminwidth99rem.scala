package typingsSlinky.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mediaminwidth99rem extends js.Object {
  @JSName("@media (min-width: 82rem)")
  var `@media Leftparenthesismin-widthColon 82remRightparenthesis`: LineHeight = js.native
  @JSName("@media (min-width: 99rem)")
  var `@media Leftparenthesismin-widthColon 99remRightparenthesis`: FontSize = js.native
  var fontFamily: String = js.native
  var fontSize: String = js.native
  var fontWeight: Double = js.native
  var letterSpacing: Double = js.native
  var lineHeight: String = js.native
}

object Mediaminwidth99rem {
  @scala.inline
  def apply(
    `@media Leftparenthesismin-widthColon 82remRightparenthesis`: LineHeight,
    `@media Leftparenthesismin-widthColon 99remRightparenthesis`: FontSize,
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lineHeight: String
  ): Mediaminwidth99rem = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 82rem)")((`@media Leftparenthesismin-widthColon 82remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 99rem)")((`@media Leftparenthesismin-widthColon 99remRightparenthesis`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Mediaminwidth99rem]
  }
  @scala.inline
  implicit class Mediaminwidth99remOps[Self <: Mediaminwidth99rem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@media Leftparenthesismin-widthColon 82remRightparenthesis`(value: LineHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@media (min-width: 82rem)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `with@media Leftparenthesismin-widthColon 99remRightparenthesis`(value: FontSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@media (min-width: 99rem)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

