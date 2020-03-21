package typingsSlinky.ol.modifyMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.modifyend
import typingsSlinky.ol.olStrings.modifystart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modify
  extends typingsSlinky.ol.pointerMod.default {
  def getOverlay(): typingsSlinky.ol.vectorMod.default = js.native
  @JSName("on")
  def on_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  def removePoint(): Boolean = js.native
  @JSName("un")
  def un_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): Unit = js.native
}

