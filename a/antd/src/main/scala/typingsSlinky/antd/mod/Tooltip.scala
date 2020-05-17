package typingsSlinky.antd.mod

import typingsSlinky.antd.anon.ArrowPointAtCenter
import typingsSlinky.antd.anon.Visible
import typingsSlinky.antd.tooltipMod.TooltipProps
import typingsSlinky.antd.tooltipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Tooltip")
@js.native
class Tooltip protected () extends default {
  def this(props: TooltipProps) = this()
}

/* static members */
@JSImport("antd", "Tooltip")
@js.native
object Tooltip extends js.Object {
  var defaultProps: ArrowPointAtCenter = js.native
  def getDerivedStateFromProps(nextProps: TooltipProps): Visible | Null = js.native
}

