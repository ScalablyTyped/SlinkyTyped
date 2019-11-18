package typingsSlinky.reactDashNative.reactDashNativeMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.ReactNode
import typingsSlinky.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P](`type`: ReactType[_]): ReactElement = js.native
  def apply[P](`type`: ReactType[_], props: P, children: ReactNode*): ReactElement = js.native
}

