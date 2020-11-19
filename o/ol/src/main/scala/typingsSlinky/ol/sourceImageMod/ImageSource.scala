package typingsSlinky.ol.sourceImageMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olStrings.imageloadend
import typingsSlinky.ol.olStrings.imageloaderror
import typingsSlinky.ol.olStrings.imageloadstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSource
  extends typingsSlinky.ol.sourceSourceMod.default {
  
  /* protected */ def findNearestResolution(resolution: Double): Double = js.native
  
  def getImage(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projectionMod.default
  ): typingsSlinky.ol.imageBaseMod.default = js.native
  
  /* protected */ def getImageInternal(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projectionMod.default
  ): typingsSlinky.ol.imageBaseMod.default = js.native
  
  /* protected */ def handleImageChange(event: typingsSlinky.ol.eventMod.default): Unit = js.native
  
  @JSName("on")
  def on_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  
  @JSName("un")
  def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
}
