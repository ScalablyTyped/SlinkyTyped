package typingsSlinky.grommetIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.grommetIcons.iconsMod.IconProps
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grommet {
  @JSImport("grommet-icons", "Grommet")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps with SVGProps[SVGSVGElement]): `SharedBuilder_<intersection>_1575655765`[typingsSlinky.grommetIcons.mod.Grommet] = new `SharedBuilder_<intersection>_1575655765`[typingsSlinky.grommetIcons.mod.Grommet](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Grommet.type): `SharedBuilder_<intersection>_1575655765`[typingsSlinky.grommetIcons.mod.Grommet] = new `SharedBuilder_<intersection>_1575655765`[typingsSlinky.grommetIcons.mod.Grommet](js.Array(this.component, js.Dictionary.empty))()
}

