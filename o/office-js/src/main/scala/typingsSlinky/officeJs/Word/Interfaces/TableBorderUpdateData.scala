package typingsSlinky.officeJs.Word.Interfaces

import typingsSlinky.officeJs.Word.BorderType
import typingsSlinky.officeJs.officeJsStrings.DashDotStroked
import typingsSlinky.officeJs.officeJsStrings.Dashed
import typingsSlinky.officeJs.officeJsStrings.DashedSmall
import typingsSlinky.officeJs.officeJsStrings.Dot2Dashed
import typingsSlinky.officeJs.officeJsStrings.DotDashed
import typingsSlinky.officeJs.officeJsStrings.Dotted
import typingsSlinky.officeJs.officeJsStrings.Double
import typingsSlinky.officeJs.officeJsStrings.DoubleWave
import typingsSlinky.officeJs.officeJsStrings.Mixed
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Single
import typingsSlinky.officeJs.officeJsStrings.ThickThinLarge
import typingsSlinky.officeJs.officeJsStrings.ThickThinMed
import typingsSlinky.officeJs.officeJsStrings.ThickThinSmall
import typingsSlinky.officeJs.officeJsStrings.ThinThickLarge
import typingsSlinky.officeJs.officeJsStrings.ThinThickMed
import typingsSlinky.officeJs.officeJsStrings.ThinThickSmall
import typingsSlinky.officeJs.officeJsStrings.ThinThickThinLarge
import typingsSlinky.officeJs.officeJsStrings.ThinThickThinMed
import typingsSlinky.officeJs.officeJsStrings.ThinThickThinSmall
import typingsSlinky.officeJs.officeJsStrings.ThreeDEmboss
import typingsSlinky.officeJs.officeJsStrings.ThreeDEngrave
import typingsSlinky.officeJs.officeJsStrings.Triple
import typingsSlinky.officeJs.officeJsStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableBorder object, for use in "tableBorder.set({ ... })". */
trait TableBorderUpdateData extends js.Object {
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

object TableBorderUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = null,
    width: Int | scala.Double = null
  ): TableBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderUpdateData]
  }
}

