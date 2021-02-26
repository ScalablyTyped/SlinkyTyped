package typingsSlinky.escPosEncoder

import typingsSlinky.escPosEncoder.escPosEncoderNumbers.`1`
import typingsSlinky.escPosEncoder.escPosEncoderNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esc-pos-encoder", JSImport.Namespace)
  @js.native
  class ^ () extends EscPosEncoder
  
  @js.native
  trait EscPosEncoder extends StObject {
    
    def align(value: alignType): EscPosEncoder = js.native
    
    def barcode(value: String, symbology: symbologyType, height: Double): EscPosEncoder = js.native
    
    def bold(): EscPosEncoder = js.native
    def bold(value: Boolean): EscPosEncoder = js.native
    
    def codepage(value: codepageType): EscPosEncoder = js.native
    
    def cut(): EscPosEncoder = js.native
    def cut(value: cutType): EscPosEncoder = js.native
    
    def encode(): js.typedarray.Uint8Array = js.native
    
    def image(element: js.Any, width: Double, height: Double): EscPosEncoder = js.native
    def image(
      element: js.Any,
      width: Double,
      height: Double,
      algorithm: js.UndefOr[scala.Nothing],
      threshold: Double
    ): EscPosEncoder = js.native
    def image(element: js.Any, width: Double, height: Double, algorithm: imgAlgType): EscPosEncoder = js.native
    def image(element: js.Any, width: Double, height: Double, algorithm: imgAlgType, threshold: Double): EscPosEncoder = js.native
    
    def initialize(): EscPosEncoder = js.native
    
    def italic(): EscPosEncoder = js.native
    def italic(value: Boolean): EscPosEncoder = js.native
    
    def line(value: String): EscPosEncoder = js.native
    def line(value: String, wrap: Double): EscPosEncoder = js.native
    
    def newline(): EscPosEncoder = js.native
    
    def qrcode(value: String): EscPosEncoder = js.native
    def qrcode(
      value: String,
      model: js.UndefOr[scala.Nothing],
      size: js.UndefOr[scala.Nothing],
      errorLevel: qrErrorLevelType
    ): EscPosEncoder = js.native
    def qrcode(value: String, model: js.UndefOr[scala.Nothing], size: qrSizeType): EscPosEncoder = js.native
    def qrcode(value: String, model: js.UndefOr[scala.Nothing], size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`, size: js.UndefOr[scala.Nothing], errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`, size: qrSizeType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_1(value: String, model: `1`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`, size: js.UndefOr[scala.Nothing], errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`, size: qrSizeType): EscPosEncoder = js.native
    @JSName("qrcode")
    def qrcode_2(value: String, model: `2`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    
    def raw(data: js.Array[Double]): EscPosEncoder = js.native
    def raw(data: js.typedarray.Uint8Array): EscPosEncoder = js.native
    
    def size(value: sizeType): EscPosEncoder = js.native
    
    def text(value: String): EscPosEncoder = js.native
    def text(value: String, wrap: Double): EscPosEncoder = js.native
    
    def underline(): EscPosEncoder = js.native
    def underline(value: Boolean): EscPosEncoder = js.native
    @JSName("underline")
    def underline_2(value: `2`): EscPosEncoder = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.left
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.center
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.right
  */
  trait alignType extends StObject
  object alignType {
    
    @scala.inline
    def center: typingsSlinky.escPosEncoder.escPosEncoderStrings.center = "center".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.center]
    
    @scala.inline
    def left: typingsSlinky.escPosEncoder.escPosEncoderStrings.left = "left".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.left]
    
    @scala.inline
    def right: typingsSlinky.escPosEncoder.escPosEncoderStrings.right = "right".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp437
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp737
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp850
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp775
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp852
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp855
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp857
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp858
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp860
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp861
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp862
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp863
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp864
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp865
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp866
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp869
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp936
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp949
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp950
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.cp1252
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.iso88596
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.shiftjis
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1250
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1251
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1252
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1253
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1254
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1255
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1256
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1257
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1258
  */
  trait codepageType extends StObject
  object codepageType {
    
    @scala.inline
    def cp1252: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp1252 = "cp1252".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp1252]
    
    @scala.inline
    def cp437: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp437 = "cp437".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp437]
    
    @scala.inline
    def cp737: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp737 = "cp737".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp737]
    
    @scala.inline
    def cp775: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp775 = "cp775".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp775]
    
    @scala.inline
    def cp850: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp850 = "cp850".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp850]
    
    @scala.inline
    def cp852: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp852 = "cp852".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp852]
    
    @scala.inline
    def cp855: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp855 = "cp855".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp855]
    
    @scala.inline
    def cp857: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp857 = "cp857".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp857]
    
    @scala.inline
    def cp858: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp858 = "cp858".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp858]
    
    @scala.inline
    def cp860: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp860 = "cp860".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp860]
    
    @scala.inline
    def cp861: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp861 = "cp861".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp861]
    
    @scala.inline
    def cp862: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp862 = "cp862".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp862]
    
    @scala.inline
    def cp863: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp863 = "cp863".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp863]
    
    @scala.inline
    def cp864: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp864 = "cp864".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp864]
    
    @scala.inline
    def cp865: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp865 = "cp865".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp865]
    
    @scala.inline
    def cp866: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp866 = "cp866".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp866]
    
    @scala.inline
    def cp869: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp869 = "cp869".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp869]
    
    @scala.inline
    def cp936: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp936 = "cp936".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp936]
    
    @scala.inline
    def cp949: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp949 = "cp949".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp949]
    
    @scala.inline
    def cp950: typingsSlinky.escPosEncoder.escPosEncoderStrings.cp950 = "cp950".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.cp950]
    
    @scala.inline
    def iso88596: typingsSlinky.escPosEncoder.escPosEncoderStrings.iso88596 = "iso88596".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.iso88596]
    
    @scala.inline
    def shiftjis: typingsSlinky.escPosEncoder.escPosEncoderStrings.shiftjis = "shiftjis".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.shiftjis]
    
    @scala.inline
    def windows1250: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1250 = "windows1250".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1250]
    
    @scala.inline
    def windows1251: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1251 = "windows1251".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1251]
    
    @scala.inline
    def windows1252: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1252 = "windows1252".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1252]
    
    @scala.inline
    def windows1253: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1253 = "windows1253".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1253]
    
    @scala.inline
    def windows1254: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1254 = "windows1254".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1254]
    
    @scala.inline
    def windows1255: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1255 = "windows1255".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1255]
    
    @scala.inline
    def windows1256: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1256 = "windows1256".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1256]
    
    @scala.inline
    def windows1257: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1257 = "windows1257".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1257]
    
    @scala.inline
    def windows1258: typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1258 = "windows1258".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.windows1258]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.full
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.partial
  */
  trait cutType extends StObject
  object cutType {
    
    @scala.inline
    def full: typingsSlinky.escPosEncoder.escPosEncoderStrings.full = "full".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.full]
    
    @scala.inline
    def partial: typingsSlinky.escPosEncoder.escPosEncoderStrings.partial = "partial".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.partial]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.threshold
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.bayer
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.floydsteinberg
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.atkinson
  */
  trait imgAlgType extends StObject
  object imgAlgType {
    
    @scala.inline
    def atkinson: typingsSlinky.escPosEncoder.escPosEncoderStrings.atkinson = "atkinson".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.atkinson]
    
    @scala.inline
    def bayer: typingsSlinky.escPosEncoder.escPosEncoderStrings.bayer = "bayer".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.bayer]
    
    @scala.inline
    def floydsteinberg: typingsSlinky.escPosEncoder.escPosEncoderStrings.floydsteinberg = "floydsteinberg".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.floydsteinberg]
    
    @scala.inline
    def threshold: typingsSlinky.escPosEncoder.escPosEncoderStrings.threshold = "threshold".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.threshold]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.l
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.m
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.q
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.h
  */
  trait qrErrorLevelType extends StObject
  object qrErrorLevelType {
    
    @scala.inline
    def h: typingsSlinky.escPosEncoder.escPosEncoderStrings.h = "h".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.h]
    
    @scala.inline
    def l: typingsSlinky.escPosEncoder.escPosEncoderStrings.l = "l".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.l]
    
    @scala.inline
    def m: typingsSlinky.escPosEncoder.escPosEncoderStrings.m = "m".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.m]
    
    @scala.inline
    def q: typingsSlinky.escPosEncoder.escPosEncoderStrings.q = "q".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.q]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`1`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`2`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`3`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`4`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`5`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`6`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`7`
    - typingsSlinky.escPosEncoder.escPosEncoderNumbers.`8`
  */
  trait qrSizeType extends StObject
  object qrSizeType {
    
    @scala.inline
    def `1`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`1` = 1.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`2` = 2.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`3` = 3.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`4` = 4.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`5` = 5.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`5`]
    
    @scala.inline
    def `6`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`6` = 6.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`6`]
    
    @scala.inline
    def `7`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`7` = 7.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`7`]
    
    @scala.inline
    def `8`: typingsSlinky.escPosEncoder.escPosEncoderNumbers.`8` = 8.asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderNumbers.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.small
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.normal
  */
  trait sizeType extends StObject
  object sizeType {
    
    @scala.inline
    def normal: typingsSlinky.escPosEncoder.escPosEncoderStrings.normal = "normal".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.normal]
    
    @scala.inline
    def small: typingsSlinky.escPosEncoder.escPosEncoderStrings.small = "small".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.upca
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.upce
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.ean13
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.ean8
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.coda39
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.itf
    - typingsSlinky.escPosEncoder.escPosEncoderStrings.codabar
  */
  trait symbologyType extends StObject
  object symbologyType {
    
    @scala.inline
    def coda39: typingsSlinky.escPosEncoder.escPosEncoderStrings.coda39 = "coda39".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.coda39]
    
    @scala.inline
    def codabar: typingsSlinky.escPosEncoder.escPosEncoderStrings.codabar = "codabar".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.codabar]
    
    @scala.inline
    def ean13: typingsSlinky.escPosEncoder.escPosEncoderStrings.ean13 = "ean13".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.ean13]
    
    @scala.inline
    def ean8: typingsSlinky.escPosEncoder.escPosEncoderStrings.ean8 = "ean8".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.ean8]
    
    @scala.inline
    def itf: typingsSlinky.escPosEncoder.escPosEncoderStrings.itf = "itf".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.itf]
    
    @scala.inline
    def upca: typingsSlinky.escPosEncoder.escPosEncoderStrings.upca = "upca".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.upca]
    
    @scala.inline
    def upce: typingsSlinky.escPosEncoder.escPosEncoderStrings.upce = "upce".asInstanceOf[typingsSlinky.escPosEncoder.escPosEncoderStrings.upce]
  }
}
