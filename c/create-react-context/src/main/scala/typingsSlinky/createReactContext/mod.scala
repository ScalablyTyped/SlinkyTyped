package typingsSlinky.createReactContext

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-react-context", JSImport.Default)
  @js.native
  def default[T](defaultValue: T): Context[T] = js.native
  @JSImport("create-react-context", JSImport.Default)
  @js.native
  def default[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]): Context[T] = js.native
  
  @js.native
  trait ConsumerProps[T] extends StObject {
    
    var children: RenderFn[T] | js.Array[RenderFn[T]] = js.native
    
    var observedBits: js.UndefOr[Double] = js.native
  }
  object ConsumerProps {
    
    @scala.inline
    def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]]): ConsumerProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerProps[T]]
    }
    
    @scala.inline
    implicit class ConsumerPropsMutableBuilder[Self <: ConsumerProps[_], T] (val x: Self with ConsumerProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: RenderFn[T] | js.Array[RenderFn[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: T => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenVarargs(value: RenderFn[T]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setObservedBits(value: Double): Self = StObject.set(x, "observedBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservedBitsUndefined: Self = StObject.set(x, "observedBits", js.undefined)
    }
  }
  
  @js.native
  trait Context[T] extends StObject {
    
    var Consumer: ReactComponentClass[ConsumerProps[T]] = js.native
    
    var Provider: ReactComponentClass[ProviderProps[T]] = js.native
  }
  object Context {
    
    @scala.inline
    def apply[T](Consumer: ReactComponentClass[ConsumerProps[T]], Provider: ReactComponentClass[ProviderProps[T]]): Context[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context[_], T] (val x: Self with Context[T]) extends AnyVal {
      
      @scala.inline
      def setConsumer(value: ReactComponentClass[ConsumerProps[T]]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: ReactComponentClass[ProviderProps[T]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProviderProps[T] extends StObject {
    
    var children: ReactElement = js.native
    
    var value: T = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply[T](value: T): ProviderProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps[T]]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps[_], T] (val x: Self with ProviderProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderFn[T] = js.Function1[/* value */ T, ReactElement]
}
