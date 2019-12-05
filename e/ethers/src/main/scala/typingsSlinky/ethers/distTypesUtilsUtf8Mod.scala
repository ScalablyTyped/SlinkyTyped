package typingsSlinky.ethers

import typingsSlinky.ethers.distTypesUtilsTypesMod.Arrayish
import typingsSlinky.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/utf8", JSImport.Namespace)
@js.native
object distTypesUtilsUtf8Mod extends js.Object {
  @js.native
  sealed trait UnicodeNormalizationForm extends js.Object
  
  def toUtf8Bytes(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): scala.scalajs.js.typedarray.Uint8Array = js.native
  def toUtf8String(bytes: Arrayish): String = js.native
  @js.native
  object UnicodeNormalizationForm extends js.Object {
    @js.native
    sealed trait NFC extends UnicodeNormalizationForm
    
    @js.native
    sealed trait NFD extends UnicodeNormalizationForm
    
    @js.native
    sealed trait NFKC extends UnicodeNormalizationForm
    
    @js.native
    sealed trait NFKD extends UnicodeNormalizationForm
    
    @js.native
    sealed trait current extends UnicodeNormalizationForm
    
    /* "NFC" */ val NFC: typingsSlinky.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFC with String = js.native
    /* "NFD" */ val NFD: typingsSlinky.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFD with String = js.native
    /* "NFKC" */ val NFKC: typingsSlinky.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFKC with String = js.native
    /* "NFKD" */ val NFKD: typingsSlinky.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFKD with String = js.native
    /* "" */ val current: typingsSlinky.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.current with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm with String] = js.native
  }
  
}

