package typingsSlinky.luminoWidgets.widgetMod.Widget

import typingsSlinky.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message class for child related messages.
  */
@JSImport("@lumino/widgets/types/widget", "Widget.ChildMessage")
@js.native
class ChildMessage protected () extends Message {
  /**
    * Construct a new child message.
    *
    * @param type - The message type.
    *
    * @param child - The child widget for the message.
    */
  def this(`type`: String, child: typingsSlinky.luminoWidgets.widgetMod.Widget) = this()
  /**
    * The child widget for the message.
    */
  val child: typingsSlinky.luminoWidgets.widgetMod.Widget = js.native
}

