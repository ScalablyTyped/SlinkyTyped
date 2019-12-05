package typingsSlinky.reactDashSketchapp.reactDashSketchappMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashSketchapp.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "makeSymbol")
@js.native
object makeSymbol extends js.Object {
  def apply[P](node: js.Function1[/* props */ P, Element]): ReactComponentClass[P with Anon_Key] = js.native
  def apply[P](node: js.Function1[/* props */ P, Element], name: String): ReactComponentClass[P with Anon_Key] = js.native
  def apply[P](node: ComponentClass[P, ComponentState]): ReactComponentClass[P with Anon_Key] = js.native
  def apply[P](node: ComponentClass[P, ComponentState], name: String): ReactComponentClass[P with Anon_Key] = js.native
}

