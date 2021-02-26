package typingsSlinky.ethereumBloomFilters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereum-bloom-filters/dist", "isAddress")
  @js.native
  def isAddress(address: String): Boolean = js.native
  
  @JSImport("ethereum-bloom-filters/dist", "isBloom")
  @js.native
  def isBloom(bloom: String): Boolean = js.native
  
  @JSImport("ethereum-bloom-filters/dist", "isContractAddressInBloom")
  @js.native
  def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = js.native
  
  @JSImport("ethereum-bloom-filters/dist", "isInBloom")
  @js.native
  def isInBloom(bloom: String, value: String): Boolean = js.native
  @JSImport("ethereum-bloom-filters/dist", "isInBloom")
  @js.native
  def isInBloom(bloom: String, value: js.typedarray.Uint8Array): Boolean = js.native
  
  @JSImport("ethereum-bloom-filters/dist", "isTopic")
  @js.native
  def isTopic(topic: String): Boolean = js.native
  
  @JSImport("ethereum-bloom-filters/dist", "isTopicInBloom")
  @js.native
  def isTopicInBloom(bloom: String, topic: String): Boolean = js.native
  
  @JSImport("ethereum-bloom-filters/dist", "isUserEthereumAddressInBloom")
  @js.native
  def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = js.native
}
