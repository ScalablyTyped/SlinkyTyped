package typingsSlinky.cadesplugin.CAPICOM

import typingsSlinky.cadesplugin.cadespluginNumbers.`128`
import typingsSlinky.cadesplugin.cadespluginNumbers.`16`
import typingsSlinky.cadesplugin.cadespluginNumbers.`1`
import typingsSlinky.cadesplugin.cadespluginNumbers.`2`
import typingsSlinky.cadesplugin.cadespluginNumbers.`32768`
import typingsSlinky.cadesplugin.cadespluginNumbers.`32`
import typingsSlinky.cadesplugin.cadespluginNumbers.`4`
import typingsSlinky.cadesplugin.cadespluginNumbers.`64`
import typingsSlinky.cadesplugin.cadespluginNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_KEY_USAGE extends KeyUsagePlugin {
  
  val CAPICOM_CRL_SIGN_KEY_USAGE: `2` = js.native
  
  val CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE: `16` = js.native
  
  val CAPICOM_DECIPHER_ONLY_KEY_USAGE: `32768` = js.native
  
  val CAPICOM_ENCIPHER_ONLY_KEY_USAGE: `1` = js.native
  
  val CAPICOM_KEY_AGREEMENT_KEY_USAGE: `8` = js.native
  
  val CAPICOM_KEY_CERT_SIGN_KEY_USAGE: `4` = js.native
  
  val CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE: `32` = js.native
  
  val CAPICOM_NON_REPUDIATION_KEY_USAGE: `64` = js.native
  
  val CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE: `2` = js.native
}
object CAPICOM_KEY_USAGE {
  
  @scala.inline
  def apply(
    CAPICOM_CRL_SIGN_KEY_USAGE: `2`,
    CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE: `16`,
    CAPICOM_DECIPHER_ONLY_KEY_USAGE: `32768`,
    CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128`,
    CAPICOM_ENCIPHER_ONLY_KEY_USAGE: `1`,
    CAPICOM_KEY_AGREEMENT_KEY_USAGE: `8`,
    CAPICOM_KEY_CERT_SIGN_KEY_USAGE: `4`,
    CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE: `32`,
    CAPICOM_NON_REPUDIATION_KEY_USAGE: `64`,
    CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE: `2`
  ): CAPICOM_KEY_USAGE = {
    val __obj = js.Dynamic.literal(CAPICOM_CRL_SIGN_KEY_USAGE = CAPICOM_CRL_SIGN_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE = CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_DECIPHER_ONLY_KEY_USAGE = CAPICOM_DECIPHER_ONLY_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE = CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_ENCIPHER_ONLY_KEY_USAGE = CAPICOM_ENCIPHER_ONLY_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_KEY_AGREEMENT_KEY_USAGE = CAPICOM_KEY_AGREEMENT_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_KEY_CERT_SIGN_KEY_USAGE = CAPICOM_KEY_CERT_SIGN_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE = CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_NON_REPUDIATION_KEY_USAGE = CAPICOM_NON_REPUDIATION_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE = CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_KEY_USAGE]
  }
  
  @scala.inline
  implicit class CAPICOM_KEY_USAGEMutableBuilder[Self <: CAPICOM_KEY_USAGE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_CRL_SIGN_KEY_USAGE(value: `2`): Self = StObject.set(x, "CAPICOM_CRL_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_DATA_ENCIPHERMENT_KEY_USAGE(value: `16`): Self = StObject.set(x, "CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_DECIPHER_ONLY_KEY_USAGE(value: `32768`): Self = StObject.set(x, "CAPICOM_DECIPHER_ONLY_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ENCIPHER_ONLY_KEY_USAGE(value: `1`): Self = StObject.set(x, "CAPICOM_ENCIPHER_ONLY_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_KEY_AGREEMENT_KEY_USAGE(value: `8`): Self = StObject.set(x, "CAPICOM_KEY_AGREEMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_KEY_CERT_SIGN_KEY_USAGE(value: `4`): Self = StObject.set(x, "CAPICOM_KEY_CERT_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_KEY_ENCIPHERMENT_KEY_USAGE(value: `32`): Self = StObject.set(x, "CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_NON_REPUDIATION_KEY_USAGE(value: `64`): Self = StObject.set(x, "CAPICOM_NON_REPUDIATION_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE(value: `2`): Self = StObject.set(x, "CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
  }
}
