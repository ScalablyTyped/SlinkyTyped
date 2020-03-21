package typingsSlinky.natsHemera.mod

import typingsSlinky.natsHemera.natsHemeraStrings.pubsub
import typingsSlinky.natsHemera.natsHemeraStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request$ extends js.Object {
  var id: String
  var `type`: pubsub | request
}

object Request$ {
  @scala.inline
  def apply(id: String, `type`: pubsub | request): Request$ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request$]
  }
}

