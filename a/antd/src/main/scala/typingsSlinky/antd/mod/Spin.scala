package typingsSlinky.antd.mod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Spinning
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.antd.spinMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def setDefaultIndicator(indicator: ReactElement): Unit = js.native
}
