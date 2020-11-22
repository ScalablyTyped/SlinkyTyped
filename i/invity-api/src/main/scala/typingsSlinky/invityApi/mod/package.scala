package typingsSlinky.invityApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BuyTradeQuoteResponse = js.Array[typingsSlinky.invityApi.mod.BuyTrade]
  
  type ExchangeCoinListResponse = js.Array[typingsSlinky.invityApi.mod.ExchangeCoinInfo]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.invityApi.invityApiStrings.INCLUDED
    - typingsSlinky.invityApi.invityApiStrings.UNKNOWN
  */
  type ExchangeFee = typingsSlinky.invityApi.mod._ExchangeFee | scala.Double
  
  type ExchangeListResponse = js.Array[typingsSlinky.invityApi.mod.ExchangeProviderInfo]
  
  type ExchangeMaximum = scala.Double | typingsSlinky.invityApi.invityApiStrings.NONE
  
  type ExchangeTradeQuoteResponse = js.Array[typingsSlinky.invityApi.mod.ExchangeTrade]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
