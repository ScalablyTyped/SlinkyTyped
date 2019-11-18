package typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import org.scalajs.dom.raw.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends FontawesomeObject {
  val `type`: typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.counter
}

object Counter {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.counter
  ): Counter = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "counter")
@js.native
object counter extends js.Object {
  def apply(content: String): Counter = js.native
  def apply(content: String, params: CounterParams): Counter = js.native
  def apply(content: Double): Counter = js.native
  def apply(content: Double, params: CounterParams): Counter = js.native
}

