package typingsSlinky.azureSb.mod.Azure

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ServiceBus {
  
  type DateString = java.lang.String
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Duration = java.lang.String
  
  type MessageOrName = typingsSlinky.azureSb.mod.Azure.ServiceBus.Message | java.lang.String
  
  type ReceiveSubscriptionMessageOptions = typingsSlinky.azureSb.mod.Azure.ServiceBus.ReceiveQueueMessageOptions
  
  type ResponseCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* response */ typingsSlinky.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  
  type ResultAndResponseCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* result */ scala.Boolean | typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.Base | js.Array[typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.Base], 
    /* response */ typingsSlinky.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
  
  type TypedResultAndResponseCallback[T] = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* result */ T, 
    /* response */ typingsSlinky.azureSb.mod.Azure.ServiceBus.Response, 
    scala.Unit
  ]
}
