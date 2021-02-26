package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactInstantsearchDom.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HitsProps[T] extends StObject {
  
  var hitComponent: js.UndefOr[ReactComponentClass[Hit[T]]] = js.native
}
object HitsProps {
  
  @scala.inline
  def apply[T](): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitsProps[T]]
  }
  
  @scala.inline
  implicit class HitsPropsMutableBuilder[Self <: HitsProps[_], T] (val x: Self with HitsProps[T]) extends AnyVal {
    
    @scala.inline
    def setHitComponent(value: ReactComponentClass[Hit[T]]): Self = StObject.set(x, "hitComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitComponentComponentClass(value: ReactComponentClass[Hit[T]]): Self = StObject.set(x, "hitComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitComponentFunctionComponent(value: ReactComponentClass[Hit[T]]): Self = StObject.set(x, "hitComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitComponentUndefined: Self = StObject.set(x, "hitComponent", js.undefined)
  }
}
