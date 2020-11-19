package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object forecastqueryserviceMod {
  
  type Arn = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.forecastqueryserviceMod.ClientApiVersions
  
  type DateTime = java.lang.String
  
  type Double = scala.Double
  
  type Filters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastqueryserviceMod.AttributeValue]
  
  type NextToken = java.lang.String
  
  type Predictions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.forecastqueryserviceMod.TimeSeries]
  
  type Statistic = java.lang.String
  
  type TimeSeries = js.Array[typingsSlinky.awsSdk.forecastqueryserviceMod.DataPoint]
  
  type Timestamp = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-06-26`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.forecastqueryserviceMod._apiVersion | java.lang.String
}
