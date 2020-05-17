package typingsSlinky.antd.mod

import slinky.core.TagMod
import typingsSlinky.antd.anon.Spinning
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.antd.spinMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Spin")
@js.native
class Spin protected () extends default {
  def this(props: SpinProps) = this()
}

/* static members */
@JSImport("antd", "Spin")
@js.native
object Spin extends js.Object {
  var defaultProps: Spinning = js.native
  def setDefaultIndicator(indicator: TagMod[Any]): Unit = js.native
}

