package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PictureFormat extends js.Object

/**
  *
  * The format of the image.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PictureFormat")
@js.native
object PictureFormat extends js.Object {
  /**
    *
    * Bitmap image.
    *
    */
  @js.native
  sealed trait bmp extends PictureFormat
  
  /**
    *
    * Graphics Interchange Format.
    *
    */
  @js.native
  sealed trait gif extends PictureFormat
  
  /**
    *
    * Joint Photographic Experts Group.
    *
    */
  @js.native
  sealed trait jpeg extends PictureFormat
  
  /**
    *
    * Portable Network Graphics.
    *
    */
  @js.native
  sealed trait png extends PictureFormat
  
  /**
    *
    * Scalable Vector Graphic.
    *
    */
  @js.native
  sealed trait svg extends PictureFormat
  
  @js.native
  sealed trait unknown extends PictureFormat
  
  /* "BMP" */ val bmp: typingsSlinky.officeDashJsDashPreview.Excel.PictureFormat.bmp with String = js.native
  /* "GIF" */ val gif: typingsSlinky.officeDashJsDashPreview.Excel.PictureFormat.gif with String = js.native
  /* "JPEG" */ val jpeg: typingsSlinky.officeDashJsDashPreview.Excel.PictureFormat.jpeg with String = js.native
  /* "PNG" */ val png: typingsSlinky.officeDashJsDashPreview.Excel.PictureFormat.png with String = js.native
  /* "SVG" */ val svg: typingsSlinky.officeDashJsDashPreview.Excel.PictureFormat.svg with String = js.native
  /* "UNKNOWN" */ val unknown: typingsSlinky.officeDashJsDashPreview.Excel.PictureFormat.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PictureFormat with String] = js.native
}

