package typingsSlinky.reactNative.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P](`type`: ReactType[_]): ReactElement = js.native
  def apply[P](`type`: ReactType[_], props: P, children: ReactElement*): ReactElement = js.native
}

