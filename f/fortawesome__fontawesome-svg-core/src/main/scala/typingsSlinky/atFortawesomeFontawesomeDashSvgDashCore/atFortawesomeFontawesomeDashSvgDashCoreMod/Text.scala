package typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import org.scalajs.dom.raw.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends FontawesomeObject
     with IconOrText {
  val `type`: typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.text
}

object Text {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.text
  ): Text = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "text")
@js.native
object text extends js.Object {
  def apply(content: String): Text = js.native
  def apply(content: String, params: TextParams): Text = js.native
}

