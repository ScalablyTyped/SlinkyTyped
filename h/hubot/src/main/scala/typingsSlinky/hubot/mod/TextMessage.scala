package typingsSlinky.hubot.mod

import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "TextMessage")
@js.native
class TextMessage protected () extends Message {
  def this(user: User, text: String, id: String) = this()
  @JSName("text")
  var text_TextMessage: String = js.native
  def `match`(regex: js.RegExp): RegExpMatchArray = js.native
}

