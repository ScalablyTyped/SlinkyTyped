package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libConfigDashProviderMod {
  import typingsSlinky.react.reactMod.ClassicComponentClass
  import typingsSlinky.react.reactMod.ComponentClass
  import typingsSlinky.react.reactMod.ComponentState
  import typingsSlinky.react.reactMod.StatelessComponent

  type IReactComponent[P] = StatelessComponent[P] | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
}
