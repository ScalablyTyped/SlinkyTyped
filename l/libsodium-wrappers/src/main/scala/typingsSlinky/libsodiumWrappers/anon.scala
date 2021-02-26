package typingsSlinky.libsodiumWrappers

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Header extends StObject {
    
    var header: js.typedarray.Uint8Array = js.native
    
    var state: StateAddress = js.native
  }
  object Header {
    
    @scala.inline
    def apply(header: js.typedarray.Uint8Array, state: StateAddress): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.typedarray.Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: StateAddress): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var header: String = js.native
    
    var state: StateAddress = js.native
  }
  object State {
    
    @scala.inline
    def apply(header: String, state: StateAddress): State = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: StateAddress): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
