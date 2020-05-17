package typingsSlinky.mobxReact.ireactcomponentMod

import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ClassicComponentClass[P]
  - typingsSlinky.react.mod.ComponentClass[P, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.FunctionComponent[P]
  - typingsSlinky.react.mod.ForwardRefExoticComponent[P]
*/
trait IReactComponent[P] extends js.Object

object IReactComponent {
  @scala.inline
  implicit def apply[P](value: ClassicComponentClass[P]): IReactComponent[P] = value.asInstanceOf[IReactComponent[P]]
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): IReactComponent[P] = value.asInstanceOf[IReactComponent[P]]
  @scala.inline
  implicit def apply[P](value: ForwardRefExoticComponent[P]): IReactComponent[P] = value.asInstanceOf[IReactComponent[P]]
  @scala.inline
  implicit def apply[P](value: FunctionComponent[P]): IReactComponent[P] = value.asInstanceOf[IReactComponent[P]]
}

