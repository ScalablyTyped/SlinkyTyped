package typingsSlinky.amapJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AMap {
  
  type EventCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type GenericEventCallback[T] = js.Function1[/* res */ T, scala.Unit]
  
  type TileLayer = typingsSlinky.amapJsSdk.AMap.Layer
}
