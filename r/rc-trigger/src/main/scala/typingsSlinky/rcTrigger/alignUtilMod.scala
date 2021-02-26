package typingsSlinky.rcTrigger

import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignUtilMod {
  
  @JSImport("rc-trigger/es/utils/alignUtil", "getAlignFromPlacement")
  @js.native
  def getAlignFromPlacement(builtinPlacements: BuildInPlacements, placementStr: String, align: AlignType): AlignType = js.native
  
  @JSImport("rc-trigger/es/utils/alignUtil", "getAlignPopupClassName")
  @js.native
  def getAlignPopupClassName(builtinPlacements: BuildInPlacements, prefixCls: String, align: AlignType, isAlignPoint: Boolean): String = js.native
}
