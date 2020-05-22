package typingsSlinky.figma.anon

import typingsSlinky.figma.figmaStrings.URL
import typingsSlinky.figma.mod.global.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends Action {
  val `type`: URL
  var url: String
}

object Url {
  @scala.inline
  def apply(`type`: URL, url: String): Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

