package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object personalizeeventsMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.personalizeeventsMod.ClientApiVersions
  
  type Date = js.Date
  
  type EventList = js.Array[typingsSlinky.awsSdk.personalizeeventsMod.Event]
  
  type EventPropertiesJSON = java.lang.String
  
  type StringType = java.lang.String
  
  type UserId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-03-22`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.personalizeeventsMod._apiVersion | java.lang.String
}
