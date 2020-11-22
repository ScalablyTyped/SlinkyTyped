package typingsSlinky.playable.tooltipContainerMod

import typingsSlinky.playable.anon.Bottom
import typingsSlinky.playable.anon.Left
import typingsSlinky.playable.coreTypesMod.IStyles
import typingsSlinky.playable.tooltipTypesMod.ITooltipPositionFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipContainer
  extends typingsSlinky.playable.stylableMod.default[IStyles]
     with ITooltipContainer {
  
  @JSName("_$rootElement")
  var _$rootElement: js.Any = js.native
  
  var _getTooltipLeftX: js.Any = js.native
  
  var _initDOM: js.Any = js.native
  
  var _tooltip: js.Any = js.native
  
  def getTooltipPositionStyles(position: ITooltipPositionFunction): Bottom | Left = js.native
}
