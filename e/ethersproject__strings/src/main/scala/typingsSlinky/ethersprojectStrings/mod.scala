package typingsSlinky.ethersprojectStrings

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm
import typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/strings", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def formatBytes32String(text: String): String = js.native
  
  def nameprep(value: String): String = js.native
  
  def parseBytes32String(bytes: BytesLike): String = js.native
  
  @JSName("_toEscapedUtf8String")
  def toEscapedUtf8String(bytes: BytesLike): String = js.native
  @JSName("_toEscapedUtf8String")
  def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  def toUtf8Bytes(str: String): js.typedarray.Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = js.native
  
  def toUtf8CodePoints(str: String): js.Array[Double] = js.native
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = js.native
  
  def toUtf8String(bytes: BytesLike): String = js.native
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  @js.native
  object UnicodeNormalizationForm extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm with String] = js.native
    
    /* "NFC" */ val NFC: typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFC with String = js.native
    
    /* "NFD" */ val NFD: typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFD with String = js.native
    
    /* "NFKC" */ val NFKC: typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKC with String = js.native
    
    /* "NFKD" */ val NFKD: typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKD with String = js.native
    
    /* "" */ val current: typingsSlinky.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.current with String = js.native
  }
  
  @js.native
  object Utf8ErrorFuncs extends /* name */ StringDictionary[Utf8ErrorFunc]
  
  @js.native
  object Utf8ErrorReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason with String] = js.native
    
    /* "bad codepoint prefix" */ val BAD_PREFIX: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.BAD_PREFIX with String = js.native
    
    /* "missing continuation byte" */ val MISSING_CONTINUE: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.MISSING_CONTINUE with String = js.native
    
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OUT_OF_RANGE with String = js.native
    
    /* "overlong representation" */ val OVERLONG: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERLONG with String = js.native
    
    /* "string overrun" */ val OVERRUN: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERRUN with String = js.native
    
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE with String = js.native
    
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typingsSlinky.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UTF16_SURROGATE with String = js.native
  }
}
