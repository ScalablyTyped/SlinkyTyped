package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.crosshairBaseMod.CrosshairBase
import typingsSlinky.antvComponent.typesMod.CircleCrosshairCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/crosshair/circle", JSImport.Namespace)
@js.native
object crosshairCircleMod extends js.Object {
  
  @js.native
  trait LineCrosshair extends CrosshairBase[CircleCrosshairCfg]
  
  @js.native
  class default () extends LineCrosshair
}
