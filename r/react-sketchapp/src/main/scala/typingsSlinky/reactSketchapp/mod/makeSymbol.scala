package typingsSlinky.reactSketchapp.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod._Global_.JSX.Element
import typingsSlinky.reactSketchapp.AnonOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "makeSymbol")
@js.native
object makeSymbol extends js.Object {
  def apply[P](node: js.Function1[/* props */ P, Element]): ReactComponentClass[P with AnonOverrides] = js.native
  def apply[P](node: js.Function1[/* props */ P, Element], name: String): ReactComponentClass[P with AnonOverrides] = js.native
  def apply[P](node: ComponentClass[P, ComponentState]): ReactComponentClass[P with AnonOverrides] = js.native
  def apply[P](node: ComponentClass[P, ComponentState], name: String): ReactComponentClass[P with AnonOverrides] = js.native
}

