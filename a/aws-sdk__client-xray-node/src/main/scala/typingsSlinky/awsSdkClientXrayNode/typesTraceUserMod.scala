package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTraceUserMod {
  
  @js.native
  trait TraceUser extends StObject {
    
    /**
      * <p>Services that the user's request hit.</p>
      */
    var ServiceIds: js.UndefOr[js.Array[ServiceId] | js.Iterable[ServiceId]] = js.native
    
    /**
      * <p>The user's name.</p>
      */
    var UserName: js.UndefOr[String] = js.native
  }
  object TraceUser {
    
    @scala.inline
    def apply(): TraceUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceUser]
    }
    
    @scala.inline
    implicit class TraceUserMutableBuilder[Self <: TraceUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServiceIds(value: js.Array[ServiceId] | js.Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsIterable(value: js.Iterable[ServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      @scala.inline
      def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledTraceUser extends TraceUser {
    
    /**
      * <p>Services that the user's request hit.</p>
      */
    @JSName("ServiceIds")
    var ServiceIds_UnmarshalledTraceUser: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
  }
  object UnmarshalledTraceUser {
    
    @scala.inline
    def apply(): UnmarshalledTraceUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTraceUser]
    }
    
    @scala.inline
    implicit class UnmarshalledTraceUserMutableBuilder[Self <: UnmarshalledTraceUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
      
      @scala.inline
      def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
    }
  }
}
