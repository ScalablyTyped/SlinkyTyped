package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.asc
import typingsSlinky.grommet.grommetStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: asc | desc
  var property: String
}

object Direction {
  @scala.inline
  def apply(direction: asc | desc, property: String): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

