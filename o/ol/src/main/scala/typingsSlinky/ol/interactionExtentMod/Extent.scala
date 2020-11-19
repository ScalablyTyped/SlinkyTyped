package typingsSlinky.ol.interactionExtentMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.extentchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extent
  extends typingsSlinky.ol.pointerMod.default {
  
  def getExtent(): typingsSlinky.ol.extentMod.Extent = js.native
  
  def getExtentInternal(): typingsSlinky.ol.extentMod.Extent = js.native
  
  @JSName("on")
  def on_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
  
  def setExtent(extent: typingsSlinky.ol.extentMod.Extent): Unit = js.native
  
  @JSName("un")
  def un_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): Unit = js.native
}
