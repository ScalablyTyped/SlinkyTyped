package typingsSlinky.officeJsPreview.Word.Interfaces

import typingsSlinky.officeJsPreview.Word.BorderType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dashed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DotDashed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Single
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Triple
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableBorder.toJSON()". */
@js.native
trait TableBorderData extends js.Object {
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.native
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.native
}

object TableBorderData {
  @scala.inline
  def apply(): TableBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderData]
  }
  @scala.inline
  implicit class TableBorderDataOps[Self <: TableBorderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = {
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
    @scala.inline
    def withWidth(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

