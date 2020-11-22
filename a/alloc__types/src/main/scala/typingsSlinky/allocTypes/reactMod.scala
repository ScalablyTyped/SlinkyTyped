package typingsSlinky.allocTypes

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.PropsWithRef
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@alloc/types/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  
  // Function component without children
  @js.native
  trait LeafFunctionComponent[P] extends js.Object {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type ComponentPropsWithRef[T /* <: ElementType[_] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[_] with RefAttributes[InstanceType[T]])
  
  type ComponentType[P] = ReactComponentClass[P] | LeafFunctionComponent[P]
  
  type ElementType[P] = ReactElement | LeafFunctionComponent[P]
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
}
