package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonIdName
import typingsSlinky.ionic.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterList extends js.Object {
  var integrations: js.Array[AnonIdName]
  var starters: js.Array[AnonType]
}

object StarterList {
  @scala.inline
  def apply(integrations: js.Array[AnonIdName], starters: js.Array[AnonType]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StarterList]
  }
}

