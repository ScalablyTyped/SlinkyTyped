package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaps.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapCalloutSubviewProps extends ViewProps {
  
  var onPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, `1` with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
}
object MapCalloutSubviewProps {
  
  @scala.inline
  def apply(): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
  
  @scala.inline
  implicit class MapCalloutSubviewPropsMutableBuilder[Self <: MapCalloutSubviewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, `1` with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
  }
}
