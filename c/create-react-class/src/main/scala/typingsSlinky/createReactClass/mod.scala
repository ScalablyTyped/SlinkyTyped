package typingsSlinky.createReactClass

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-react-class", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[P, S](spec: ComponentSpec[P, S]): ReactComponentClass[P] = js.native
}

