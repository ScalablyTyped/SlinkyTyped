package typingsSlinky.amapJsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AMap {
  
  /**
    * 圆点标记
    */
  type CircleMarker[ExtraData] = typingsSlinky.amapJsApi.AMap.Circle[ExtraData]
  
  type Event_[N /* <: java.lang.String */, V] = typingsSlinky.amapJsApi.anon.Type[N] with (typingsSlinky.amapJsApi.anon.Value[V] | js.Object | V)
  
  type LocationValue = typingsSlinky.amapJsApi.AMap.LngLat | (js.Tuple2[scala.Double, scala.Double])
  
  type MapsEvent[N /* <: java.lang.String */, I] = typingsSlinky.amapJsApi.AMap.Event_[N, typingsSlinky.amapJsApi.anon.Lnglat[I]]
  
  type MarkerShape = typingsSlinky.amapJsApi.AMap.EventEmitter
  
  type Merge[O, T] = O with T
  
  type Omit[T, E /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
    */ typingsSlinky.amapJsApi.amapJsApiStrings.Omit with org.scalablytyped.runtime.TopLevel[T]
  
  type OptionalKey[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  type SizeValue = typingsSlinky.amapJsApi.AMap.Size | (js.Tuple2[scala.Double, scala.Double])
  
  type View2D = typingsSlinky.amapJsApi.AMap.EventEmitter
}
