package typingsSlinky.officeDashJsDashPreview.Word.Interfaces

import typingsSlinky.officeDashJsDashPreview.Word.BorderType
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotStroked
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dashed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashedSmall
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot2Dashed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DotDashed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dotted
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DoubleWave
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mixed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Single
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThinLarge
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThinMed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThickThinSmall
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickLarge
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickMed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickSmall
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickThinLarge
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickThinMed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThinThickThinSmall
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeDEmboss
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeDEngrave
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Triple
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableBorder.toJSON()". */
trait TableBorderData extends js.Object {
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.undefined
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TableBorderData {
  @scala.inline
  def apply(
    color: String = null,
    `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = null,
    width: Int | scala.Double = null
  ): TableBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderData]
  }
}

