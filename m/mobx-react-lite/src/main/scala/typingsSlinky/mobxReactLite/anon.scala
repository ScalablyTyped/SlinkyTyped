package typingsSlinky.mobxReactLite

import typingsSlinky.mobxReactLite.mobxReactLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DisplayName extends StObject {
    
    var displayName: String = js.native
  }
  object DisplayName {
    
    @scala.inline
    def apply(displayName: String): DisplayName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ForwardRef extends StObject {
    
    var forwardRef: `true` = js.native
  }
  object ForwardRef {
    
    @scala.inline
    def apply(forwardRef: `true`): ForwardRef = {
      val __obj = js.Dynamic.literal(forwardRef = forwardRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForwardRef]
    }
    
    @scala.inline
    implicit class ForwardRefMutableBuilder[Self <: ForwardRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardRef(value: `true`): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef :true} */
  @js.native
  trait IObserverOptionsforwardRe extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] with `true` = js.native
  }
  object IObserverOptionsforwardRe {
    
    @scala.inline
    def apply(forwardRef: js.UndefOr[Boolean] with `true`): IObserverOptionsforwardRe = {
      val __obj = js.Dynamic.literal(forwardRef = forwardRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObserverOptionsforwardRe]
    }
    
    @scala.inline
    implicit class IObserverOptionsforwardReMutableBuilder[Self <: IObserverOptionsforwardRe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardRef(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
    }
  }
}
