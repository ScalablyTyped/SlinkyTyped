package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.crosshairBaseMod.CrosshairBase
import typingsSlinky.antvComponent.crosshairCircleMod.LineCrosshair
import typingsSlinky.antvComponent.crosshairHtmlMod.HtmlCrosshair
import typingsSlinky.antvComponent.typesMod.CrosshairBaseCfg
import typingsSlinky.antvComponent.typesMod.HtmlCrossHairCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/crosshair", JSImport.Namespace)
@js.native
object crosshairMod extends js.Object {
  
  @js.native
  abstract class Base[T /* <: CrosshairBaseCfg */] () extends CrosshairBase[T]
  
  @js.native
  class Circle () extends LineCrosshair
  
  @js.native
  class Html[T /* <: HtmlCrossHairCfg */] () extends HtmlCrosshair[T]
  
  @js.native
  class Line ()
    extends typingsSlinky.antvComponent.crosshairLineMod.LineCrosshair
}
