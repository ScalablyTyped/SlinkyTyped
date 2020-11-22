package typingsSlinky.cadesplugin.CAPICOM

import typingsSlinky.cadesplugin.cadespluginNumbers.`0`
import typingsSlinky.cadesplugin.cadespluginNumbers.`1`
import typingsSlinky.cadesplugin.cadespluginNumbers.`2`
import typingsSlinky.cadesplugin.cadespluginNumbers.`3`
import typingsSlinky.cadesplugin.cadespluginNumbers.`4`
import typingsSlinky.cadesplugin.cadespluginNumbers.`5`
import typingsSlinky.cadesplugin.cadespluginNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_HASH_ALGORITHM extends js.Object {
  
  val CAPICOM_HASH_ALGORITHM_MD2: `1` = js.native
  
  val CAPICOM_HASH_ALGORITHM_MD4: `2` = js.native
  
  val CAPICOM_HASH_ALGORITHM_MD5: `3` = js.native
  
  val CAPICOM_HASH_ALGORITHM_SHA1: `0` = js.native
  
  val CAPICOM_HASH_ALGORITHM_SHA_256: `4` = js.native
  
  val CAPICOM_HASH_ALGORITHM_SHA_384: `5` = js.native
  
  val CAPICOM_HASH_ALGORITHM_SHA_512: `6` = js.native
}
object CAPICOM_HASH_ALGORITHM {
  
  @scala.inline
  def apply(
    CAPICOM_HASH_ALGORITHM_MD2: `1`,
    CAPICOM_HASH_ALGORITHM_MD4: `2`,
    CAPICOM_HASH_ALGORITHM_MD5: `3`,
    CAPICOM_HASH_ALGORITHM_SHA1: `0`,
    CAPICOM_HASH_ALGORITHM_SHA_256: `4`,
    CAPICOM_HASH_ALGORITHM_SHA_384: `5`,
    CAPICOM_HASH_ALGORITHM_SHA_512: `6`
  ): CAPICOM_HASH_ALGORITHM = {
    val __obj = js.Dynamic.literal(CAPICOM_HASH_ALGORITHM_MD2 = CAPICOM_HASH_ALGORITHM_MD2.asInstanceOf[js.Any], CAPICOM_HASH_ALGORITHM_MD4 = CAPICOM_HASH_ALGORITHM_MD4.asInstanceOf[js.Any], CAPICOM_HASH_ALGORITHM_MD5 = CAPICOM_HASH_ALGORITHM_MD5.asInstanceOf[js.Any], CAPICOM_HASH_ALGORITHM_SHA1 = CAPICOM_HASH_ALGORITHM_SHA1.asInstanceOf[js.Any], CAPICOM_HASH_ALGORITHM_SHA_256 = CAPICOM_HASH_ALGORITHM_SHA_256.asInstanceOf[js.Any], CAPICOM_HASH_ALGORITHM_SHA_384 = CAPICOM_HASH_ALGORITHM_SHA_384.asInstanceOf[js.Any], CAPICOM_HASH_ALGORITHM_SHA_512 = CAPICOM_HASH_ALGORITHM_SHA_512.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_HASH_ALGORITHM]
  }
  
  @scala.inline
  implicit class CAPICOM_HASH_ALGORITHMOps[Self <: CAPICOM_HASH_ALGORITHM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_MD2(value: `1`): Self = this.set("CAPICOM_HASH_ALGORITHM_MD2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_MD4(value: `2`): Self = this.set("CAPICOM_HASH_ALGORITHM_MD4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_MD5(value: `3`): Self = this.set("CAPICOM_HASH_ALGORITHM_MD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_SHA1(value: `0`): Self = this.set("CAPICOM_HASH_ALGORITHM_SHA1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_SHA_256(value: `4`): Self = this.set("CAPICOM_HASH_ALGORITHM_SHA_256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_SHA_384(value: `5`): Self = this.set("CAPICOM_HASH_ALGORITHM_SHA_384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_HASH_ALGORITHM_SHA_512(value: `6`): Self = this.set("CAPICOM_HASH_ALGORITHM_SHA_512", value.asInstanceOf[js.Any])
  }
}
