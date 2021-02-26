package typingsSlinky.reactNativeMaps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // =======================================================================
  //  Overlay
  // =======================================================================
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  
  type KmlMapEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNativeMaps.anon.Markers
  ]
  
  type MapEvent[T] = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    T with typingsSlinky.reactNativeMaps.anon.Coordinate
  ]
  
  @scala.inline
  def PROVIDER_DEFAULT: scala.Null = typingsSlinky.reactNativeMaps.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PROVIDER_DEFAULT").asInstanceOf[scala.Null]
  
  @scala.inline
  def PROVIDER_GOOGLE: typingsSlinky.reactNativeMaps.reactNativeMapsStrings.google = typingsSlinky.reactNativeMaps.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PROVIDER_GOOGLE").asInstanceOf[typingsSlinky.reactNativeMaps.reactNativeMapsStrings.google]
}
