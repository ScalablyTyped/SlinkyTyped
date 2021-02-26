package typingsSlinky.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventStreamMod {
  
  type EventStreamPayloadHandlerProvider = js.Function1[
    /* options */ js.Any, 
    typingsSlinky.awsSdkTypes.eventStreamMod.EventStreamPayloadHandler
  ]
  
  type EventStreamSerdeProvider = js.Function1[
    /* options */ js.Any, 
    typingsSlinky.awsSdkTypes.eventStreamMod.EventStreamMarshaller
  ]
  
  type EventStreamSignerProvider = js.Function1[
    /* options */ js.Any, 
    typingsSlinky.awsSdkTypes.eventStreamMod.EventStreamRequestSigner
  ]
  
  type MessageHeaders = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdkTypes.eventStreamMod.MessageHeaderValue]
}
