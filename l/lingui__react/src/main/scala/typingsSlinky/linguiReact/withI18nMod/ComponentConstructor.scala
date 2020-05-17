package typingsSlinky.linguiReact.withI18nMod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ComponentClass[P, typingsSlinky.react.mod.ComponentState]
  - typingsSlinky.react.mod.StatelessComponent[P]
*/
trait ComponentConstructor[P] extends js.Object

object ComponentConstructor {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): ComponentConstructor[P] = value.asInstanceOf[ComponentConstructor[P]]
  @scala.inline
  implicit def apply[P](value: StatelessComponent[P]): ComponentConstructor[P] = value.asInstanceOf[ComponentConstructor[P]]
}

