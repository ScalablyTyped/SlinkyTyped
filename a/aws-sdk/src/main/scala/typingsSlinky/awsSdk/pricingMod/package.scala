package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pricingMod {
  
  type AttributeNameList = js.Array[typingsSlinky.awsSdk.pricingMod.String]
  
  type AttributeValueList = js.Array[typingsSlinky.awsSdk.pricingMod.AttributeValue]
  
  type BoxedInteger = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.pricingMod.ClientApiVersions
  
  type FilterType = typingsSlinky.awsSdk.awsSdkStrings.TERM_MATCH | java.lang.String
  
  type Filters = js.Array[typingsSlinky.awsSdk.pricingMod.Filter]
  
  type PriceList = js.Array[typingsSlinky.awsSdk.pricingMod.PriceListItemJSON]
  
  type PriceListItemJSON = java.lang.String
  
  type ServiceList = js.Array[typingsSlinky.awsSdk.pricingMod.Service]
  
  type String = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.pricingMod._apiVersion | java.lang.String
}
