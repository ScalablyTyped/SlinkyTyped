package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.worldMapMod.WorldMapProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6", "WorldMap")
@js.native
class WorldMap protected ()
  extends Component[WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), js.Object, js.Any] {
  def this(props: WorldMapProps with (Omit[SVGProps[SVGSVGElement], color])) = this()
  def this(props: WorldMapProps with (Omit[SVGProps[SVGSVGElement], color]), context: js.Any) = this()
}
@JSImport("grommet/es6", "WorldMap")
@js.native
object WorldMap extends TopLevel[ReactComponentClass[WorldMapProps with (Omit[SVGProps[SVGSVGElement], color])]]
