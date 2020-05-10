package typingsSlinky.googleapis.v41Mod.adsensehostV41

import typingsSlinky.googleapis.AnonBackground
import typingsSlinky.googleapis.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdStyle extends js.Object {
  /**
    * The colors included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[AnonBackground] = js.native
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.native
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[AnonSize] = js.native
  /**
    * Kind this is, in this case adsensehost#adStyle.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAdStyle {
  @scala.inline
  def apply(): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdStyle]
  }
  @scala.inline
  implicit class SchemaAdStyleOps[Self <: SchemaAdStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: AnonBackground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCorners(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: AnonSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

