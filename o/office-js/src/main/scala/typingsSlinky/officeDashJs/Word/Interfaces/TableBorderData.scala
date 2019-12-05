package typingsSlinky.officeDashJs.Word.Interfaces

import typingsSlinky.officeDashJs.Word.BorderType
import typingsSlinky.officeDashJs.officeDashJsStrings.DashDotStroked
import typingsSlinky.officeDashJs.officeDashJsStrings.Dashed
import typingsSlinky.officeDashJs.officeDashJsStrings.DashedSmall
import typingsSlinky.officeDashJs.officeDashJsStrings.Dot2Dashed
import typingsSlinky.officeDashJs.officeDashJsStrings.DotDashed
import typingsSlinky.officeDashJs.officeDashJsStrings.Dotted
import typingsSlinky.officeDashJs.officeDashJsStrings.Double
import typingsSlinky.officeDashJs.officeDashJsStrings.DoubleWave
import typingsSlinky.officeDashJs.officeDashJsStrings.Mixed
import typingsSlinky.officeDashJs.officeDashJsStrings.None
import typingsSlinky.officeDashJs.officeDashJsStrings.Single
import typingsSlinky.officeDashJs.officeDashJsStrings.ThickThinLarge
import typingsSlinky.officeDashJs.officeDashJsStrings.ThickThinMed
import typingsSlinky.officeDashJs.officeDashJsStrings.ThickThinSmall
import typingsSlinky.officeDashJs.officeDashJsStrings.ThinThickLarge
import typingsSlinky.officeDashJs.officeDashJsStrings.ThinThickMed
import typingsSlinky.officeDashJs.officeDashJsStrings.ThinThickSmall
import typingsSlinky.officeDashJs.officeDashJsStrings.ThinThickThinLarge
import typingsSlinky.officeDashJs.officeDashJsStrings.ThinThickThinMed
import typingsSlinky.officeDashJs.officeDashJsStrings.ThinThickThinSmall
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeDEmboss
import typingsSlinky.officeDashJs.officeDashJsStrings.ThreeDEngrave
import typingsSlinky.officeDashJs.officeDashJsStrings.Triple
import typingsSlinky.officeDashJs.officeDashJsStrings.Wave
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

