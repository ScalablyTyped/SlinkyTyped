package typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import org.scalajs.dom.raw.HTMLCollection
import typingsSlinky.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconDefinition
import typingsSlinky.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconLookup
import typingsSlinky.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconName
import typingsSlinky.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconPathData
import typingsSlinky.atFortawesomeFontawesomeDashCommonDashTypes.atFortawesomeFontawesomeDashCommonDashTypesMod.IconPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon
  extends IconDefinition
     with FontawesomeObject
     with IconOrText {
  val `type`: typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.icon
}

object Icon {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData],
    iconName: IconName,
    node: HTMLCollection,
    prefix: IconPrefix,
    `type`: typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.icon
  ): Icon = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "icon")
@js.native
object icon extends js.Object {
  def apply(icon: IconLookup): Icon = js.native
  def apply(icon: IconLookup, params: IconParams): Icon = js.native
  def apply(icon: IconName): Icon = js.native
  def apply(icon: IconName, params: IconParams): Icon = js.native
}

