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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableBorder object, for use in `tableBorder.set({ ... })`. */
@js.native
trait TableBorderUpdateData extends StObject {
  
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
object TableBorderUpdateData {
  
  @scala.inline
  def apply(): TableBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderUpdateData]
  }
  
  @scala.inline
  implicit class TableBorderUpdateDataMutableBuilder[Self <: TableBorderUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: scala.Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
