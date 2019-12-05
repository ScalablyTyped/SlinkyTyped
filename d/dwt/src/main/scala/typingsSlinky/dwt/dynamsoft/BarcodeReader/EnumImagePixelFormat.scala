package typingsSlinky.dwt.dynamsoft.BarcodeReader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumImagePixelFormat extends js.Object

@JSGlobal("dynamsoft.BarcodeReader.EnumImagePixelFormat")
@js.native
object EnumImagePixelFormat extends js.Object {
  @js.native
  sealed trait IPF_ARGB_8888 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_Binary extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_BinaryInverted extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_GrayScaled extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_NV21 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_555 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_565 extends EnumImagePixelFormat
  
  @js.native
  sealed trait IPF_RGB_888 extends EnumImagePixelFormat
  
  /* 7 */ val IPF_ARGB_8888: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_ARGB_8888 with Double = js.native
  /* 0 */ val IPF_Binary: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_Binary with Double = js.native
  /* 1 */ val IPF_BinaryInverted: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_BinaryInverted with Double = js.native
  /* 2 */ val IPF_GrayScaled: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_GrayScaled with Double = js.native
  /* 3 */ val IPF_NV21: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_NV21 with Double = js.native
  /* 5 */ val IPF_RGB_555: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_RGB_555 with Double = js.native
  /* 4 */ val IPF_RGB_565: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_RGB_565 with Double = js.native
  /* 6 */ val IPF_RGB_888: typingsSlinky.dwt.dynamsoft.BarcodeReader.EnumImagePixelFormat.IPF_RGB_888 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePixelFormat with Double] = js.native
}

