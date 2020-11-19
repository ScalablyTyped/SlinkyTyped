package typingsSlinky.bchaddrjs

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bchaddrjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def detectAddressFormat(address: String): String = js.native
  
  def detectAddressNetwork(address: String): String = js.native
  
  def detectAddressType(address: String): String = js.native
  
  def isBitpayAddress(address: String): Boolean = js.native
  
  def isCashAddress(address: String): Boolean = js.native
  
  def isLegacyAddress(address: String): Boolean = js.native
  
  def isMainnetAddress(address: String): Boolean = js.native
  
  def isP2PKHAddress(address: String): Boolean = js.native
  
  def isP2SHAddress(address: String): Boolean = js.native
  
  def isTestnetAddress(address: String): Boolean = js.native
  
  def isValidAddress(input: js.Any): Boolean = js.native
  
  def toBitpayAddress(address: String): String = js.native
  
  def toCashAddress(address: String): String = js.native
  
  def toLegacyAddress(address: String): String = js.native
  
  @js.native
  object Format extends js.Object {
    
    val Bitpay: String = js.native
    
    val Cashaddr: String = js.native
    
    val Legacy: String = js.native
  }
  
  @js.native
  class InvalidAddressError () extends Error
  
  @js.native
  object Network extends js.Object {
    
    val Mainnet: String = js.native
    
    val Testnet: String = js.native
  }
  
  @js.native
  object Type extends js.Object {
    
    val P2PKH: String = js.native
    
    val P2SH: String = js.native
  }
}
