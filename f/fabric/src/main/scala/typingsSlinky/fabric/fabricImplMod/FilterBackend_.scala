package typingsSlinky.fabric.fabricImplMod

import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterBackend_ extends js.Object {
  var resources: Resources = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement,
    cacheKey: String
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement
  ): js.Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: org.scalajs.dom.raw.HTMLCanvasElement,
    cacheKey: String
  ): js.Any = js.native
  def clearWebGLCaches(): Unit = js.native
  def dispose(): Unit = js.native
  def evictCachesForKey(cacheKey: String): Unit = js.native
}

