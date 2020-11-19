package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterBackend_ extends js.Object {
  
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement,
    cacheKey: String
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement,
    cacheKey: String
  ): js.Any = js.native
  
  def clearWebGLCaches(): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def evictCachesForKey(cacheKey: String): Unit = js.native
  
  var resources: Resources = js.native
}
