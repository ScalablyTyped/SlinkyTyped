package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P](`type`: ReactComponentClass[_]): ReactElement = js.native
  def apply[P](`type`: ReactComponentClass[_], props: P, children: TagMod[Any]*): ReactElement = js.native
}

