package typingsSlinky.grommetIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.grommetIcons.iconsMod.IconProps
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Emoji {
  @JSImport("grommet-icons", "Emoji")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps with SVGProps[SVGSVGElement]): SharedBuilder_IconPropsSVGProps_1575655765[typingsSlinky.grommetIcons.mod.Emoji] = new SharedBuilder_IconPropsSVGProps_1575655765[typingsSlinky.grommetIcons.mod.Emoji](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Emoji.type): SharedBuilder_IconPropsSVGProps_1575655765[typingsSlinky.grommetIcons.mod.Emoji] = new SharedBuilder_IconPropsSVGProps_1575655765[typingsSlinky.grommetIcons.mod.Emoji](js.Array(this.component, js.Dictionary.empty))()
}

