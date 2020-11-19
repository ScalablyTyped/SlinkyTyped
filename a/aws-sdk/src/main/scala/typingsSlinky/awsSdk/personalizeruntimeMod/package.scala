package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object personalizeruntimeMod {
  
  type Arn = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.personalizeruntimeMod.ClientApiVersions
  
  type Context = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.personalizeruntimeMod.AttributeValue]
  
  type InputList = js.Array[typingsSlinky.awsSdk.personalizeruntimeMod.ItemID]
  
  type ItemID = java.lang.String
  
  type ItemList = js.Array[typingsSlinky.awsSdk.personalizeruntimeMod.PredictedItem]
  
  type NumResults = scala.Double
  
  type Score = scala.Double
  
  type UserID = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-05-22`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.personalizeruntimeMod._apiVersion | java.lang.String
}
