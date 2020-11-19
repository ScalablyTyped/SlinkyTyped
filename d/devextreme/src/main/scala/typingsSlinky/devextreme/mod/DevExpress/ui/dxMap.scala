package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMap extends Widget {
  
  /** @name dxMap.addMarker(markerOptions) */
  def addMarker(markerOptions: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def addMarker(markerOptions: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  
  /** @name dxMap.addRoute(routeOptions) */
  def addRoute(options: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def addRoute(options: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  
  /** @name dxMap.removeMarker(marker) */
  def removeMarker(marker: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeMarker(marker: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeMarker(marker: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxMap.removeRoute(route) */
  def removeRoute(route: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeRoute(route: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeRoute(route: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
}
