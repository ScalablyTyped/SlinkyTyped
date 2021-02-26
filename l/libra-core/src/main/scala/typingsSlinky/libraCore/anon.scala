package typingsSlinky.libraCore

import typingsSlinky.grpc.mod.Call
import typingsSlinky.grpc.mod.CallCredentials
import typingsSlinky.grpc.mod.Deadline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<grpc.grpc.CallOptions> */
  @js.native
  trait PartialCallOptions extends StObject {
    
    var credentials: js.UndefOr[CallCredentials] = js.native
    
    var deadline: js.UndefOr[Deadline] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var parent: js.UndefOr[Call] = js.native
    
    var propagate_flags: js.UndefOr[Double] = js.native
  }
  object PartialCallOptions {
    
    @scala.inline
    def apply(): PartialCallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCallOptions]
    }
    
    @scala.inline
    implicit class PartialCallOptionsMutableBuilder[Self <: PartialCallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: CallCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineDate(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setParent(value: Call): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPropagate_flags(value: Double): Self = StObject.set(x, "propagate_flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagate_flagsUndefined: Self = StObject.set(x, "propagate_flags", js.undefined)
    }
  }
}
