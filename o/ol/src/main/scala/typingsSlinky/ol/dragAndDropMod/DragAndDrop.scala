package typingsSlinky.ol.dragAndDropMod

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olStrings.addfeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndDrop
  extends typingsSlinky.ol.interactionInteractionMod.default {
  
  @JSName("on")
  def on_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
  
  @JSName("un")
  def un_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): Unit = js.native
}
