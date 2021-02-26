package typingsSlinky.allocTypes

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.PropsWithRef
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  type ComponentPropsWithRef[T /* <: ElementType[_] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[_] with RefAttributes[InstanceType[T]])
  
  type ComponentType[P] = ReactComponentClass[P] | LeafFunctionComponent[P]
  
  type ElementType[P] = ReactElement | LeafFunctionComponent[P]
  
  // Function component without children
  @js.native
  trait LeafFunctionComponent[P] extends StObject {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
}
