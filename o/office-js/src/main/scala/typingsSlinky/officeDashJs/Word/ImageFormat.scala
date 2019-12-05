package typingsSlinky.officeDashJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageFormat extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ImageFormat")
@js.native
object ImageFormat extends js.Object {
  @js.native
  sealed trait bmp extends ImageFormat
  
  @js.native
  sealed trait emf extends ImageFormat
  
  @js.native
  sealed trait exif extends ImageFormat
  
  @js.native
  sealed trait gif extends ImageFormat
  
  @js.native
  sealed trait icon extends ImageFormat
  
  @js.native
  sealed trait jpeg extends ImageFormat
  
  @js.native
  sealed trait pdf extends ImageFormat
  
  @js.native
  sealed trait pict extends ImageFormat
  
  @js.native
  sealed trait png extends ImageFormat
  
  @js.native
  sealed trait svg extends ImageFormat
  
  @js.native
  sealed trait tiff extends ImageFormat
  
  @js.native
  sealed trait undefined extends ImageFormat
  
  @js.native
  sealed trait unsupported extends ImageFormat
  
  @js.native
  sealed trait wmf extends ImageFormat
  
  /* "Bmp" */ val bmp: typingsSlinky.officeDashJs.Word.ImageFormat.bmp with String = js.native
  /* "Emf" */ val emf: typingsSlinky.officeDashJs.Word.ImageFormat.emf with String = js.native
  /* "Exif" */ val exif: typingsSlinky.officeDashJs.Word.ImageFormat.exif with String = js.native
  /* "Gif" */ val gif: typingsSlinky.officeDashJs.Word.ImageFormat.gif with String = js.native
  /* "Icon" */ val icon: typingsSlinky.officeDashJs.Word.ImageFormat.icon with String = js.native
  /* "Jpeg" */ val jpeg: typingsSlinky.officeDashJs.Word.ImageFormat.jpeg with String = js.native
  /* "Pdf" */ val pdf: typingsSlinky.officeDashJs.Word.ImageFormat.pdf with String = js.native
  /* "Pict" */ val pict: typingsSlinky.officeDashJs.Word.ImageFormat.pict with String = js.native
  /* "Png" */ val png: typingsSlinky.officeDashJs.Word.ImageFormat.png with String = js.native
  /* "Svg" */ val svg: typingsSlinky.officeDashJs.Word.ImageFormat.svg with String = js.native
  /* "Tiff" */ val tiff: typingsSlinky.officeDashJs.Word.ImageFormat.tiff with String = js.native
  /* "Undefined" */ val undefined: typingsSlinky.officeDashJs.Word.ImageFormat.undefined with String = js.native
  /* "Unsupported" */ val unsupported: typingsSlinky.officeDashJs.Word.ImageFormat.unsupported with String = js.native
  /* "Wmf" */ val wmf: typingsSlinky.officeDashJs.Word.ImageFormat.wmf with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageFormat with String] = js.native
}

