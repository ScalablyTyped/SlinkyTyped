package typingsSlinky.reactSketchapp.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactSketchapp.anon.Overrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "makeSymbol")
@js.native
object makeSymbol extends js.Object {
  def apply[P](node: js.Function1[/* props */ P, ReactElement]): ReactComponentClass[P with Overrides] = js.native
  def apply[P](node: js.Function1[/* props */ P, ReactElement], name: String): ReactComponentClass[P with Overrides] = js.native
  def apply[P](node: ReactComponentClass[P]): ReactComponentClass[P with Overrides] = js.native
  def apply[P](node: ReactComponentClass[P], name: String): ReactComponentClass[P with Overrides] = js.native
}

