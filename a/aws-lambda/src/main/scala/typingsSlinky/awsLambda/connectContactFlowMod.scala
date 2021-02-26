package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.anon.ContactData
import typingsSlinky.awsLambda.awsLambdaStrings.ContactFlowEvent
import typingsSlinky.awsLambda.awsLambdaStrings.TELEPHONE_NUMBER
import typingsSlinky.awsLambda.handlerMod.Callback
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectContactFlowMod {
  
  type ConnectContactFlowCallback = Callback[ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.VOICE
    - typingsSlinky.awsLambda.awsLambdaStrings.CHAT
  */
  trait ConnectContactFlowChannel extends StObject
  object ConnectContactFlowChannel {
    
    @scala.inline
    def CHAT: typingsSlinky.awsLambda.awsLambdaStrings.CHAT = "CHAT".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CHAT]
    
    @scala.inline
    def VOICE: typingsSlinky.awsLambda.awsLambdaStrings.VOICE = "VOICE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.VOICE]
  }
  
  @js.native
  trait ConnectContactFlowEndpoint extends StObject {
    
    var Address: String = js.native
    
    var Type: TELEPHONE_NUMBER = js.native
  }
  object ConnectContactFlowEndpoint {
    
    @scala.inline
    def apply(Address: String, Type: TELEPHONE_NUMBER): ConnectContactFlowEndpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContactFlowEndpoint]
    }
    
    @scala.inline
    implicit class ConnectContactFlowEndpointMutableBuilder[Self <: ConnectContactFlowEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TELEPHONE_NUMBER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectContactFlowEvent extends StObject {
    
    var Details: ContactData = js.native
    
    var Name: ContactFlowEvent = js.native
  }
  object ConnectContactFlowEvent {
    
    @scala.inline
    def apply(Details: ContactData, Name: ContactFlowEvent): ConnectContactFlowEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContactFlowEvent]
    }
    
    @scala.inline
    implicit class ConnectContactFlowEventMutableBuilder[Self <: ConnectContactFlowEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: ContactData): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: ContactFlowEvent): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectContactFlowHandler = Handler[ConnectContactFlowEvent, ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.INBOUND
    - typingsSlinky.awsLambda.awsLambdaStrings.OUTBOUND
    - typingsSlinky.awsLambda.awsLambdaStrings.TRANSFER
    - typingsSlinky.awsLambda.awsLambdaStrings.CALLBACK
    - typingsSlinky.awsLambda.awsLambdaStrings.API
  */
  trait ConnectContactFlowInitiationMethod extends StObject
  object ConnectContactFlowInitiationMethod {
    
    @scala.inline
    def API: typingsSlinky.awsLambda.awsLambdaStrings.API = "API".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.API]
    
    @scala.inline
    def CALLBACK: typingsSlinky.awsLambda.awsLambdaStrings.CALLBACK = "CALLBACK".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CALLBACK]
    
    @scala.inline
    def INBOUND: typingsSlinky.awsLambda.awsLambdaStrings.INBOUND = "INBOUND".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.INBOUND]
    
    @scala.inline
    def OUTBOUND: typingsSlinky.awsLambda.awsLambdaStrings.OUTBOUND = "OUTBOUND".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.OUTBOUND]
    
    @scala.inline
    def TRANSFER: typingsSlinky.awsLambda.awsLambdaStrings.TRANSFER = "TRANSFER".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.TRANSFER]
  }
  
  type ConnectContactFlowResult = StringDictionary[String | Null]
}
