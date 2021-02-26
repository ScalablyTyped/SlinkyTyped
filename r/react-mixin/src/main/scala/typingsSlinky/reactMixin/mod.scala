package typingsSlinky.reactMixin

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-mixin", JSImport.Namespace)
  @js.native
  val ^ : ReactMixin = js.native
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  
  @js.native
  trait ReactMixin extends StObject {
    
    def apply[S](clazz: js.Any, mixin: Mixin[_, _]): ReactComponentClass[S] = js.native
    
    def decorate(mixin: Mixin[_, _]): ClassDecorator = js.native
    
    def onClass[S](clazz: js.Any, mixin: Mixin[_, _]): ReactComponentClass[S] = js.native
  }
  
  type _To = ReactMixin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactMixin = ^
}
