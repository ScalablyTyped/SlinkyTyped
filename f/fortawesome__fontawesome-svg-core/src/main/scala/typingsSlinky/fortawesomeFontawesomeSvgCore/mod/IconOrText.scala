package typingsSlinky.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.raw.HTMLCollection
import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconName
import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconPathData
import typingsSlinky.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fortawesomeFontawesomeSvgCore.mod.Icon_
  - typingsSlinky.fortawesomeFontawesomeSvgCore.mod.Text_
*/
trait IconOrText extends js.Object

object IconOrText {
  @scala.inline
  def Icon_(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData],
    iconName: IconName,
    node: HTMLCollection,
    prefix: IconPrefix,
    `type`: typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.icon
  ): IconOrText = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOrText]
  }
  @scala.inline
  def Text_(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typingsSlinky.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.text
  ): IconOrText = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOrText]
  }
}

