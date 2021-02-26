package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaps.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapCalloutProps extends ViewProps {
  
  var onPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, `0` with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  
  var tooltip: js.UndefOr[Boolean] = js.native
}
object MapCalloutProps {
  
  @scala.inline
  def apply(): MapCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutProps]
  }
  
  @scala.inline
  implicit class MapCalloutPropsMutableBuilder[Self <: MapCalloutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, `0` with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
