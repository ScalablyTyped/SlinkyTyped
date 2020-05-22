package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Installationid extends js.Object {
  var installation_id: Required
  var repository_id: Required
}

object Installationid {
  @scala.inline
  def apply(installation_id: Required, repository_id: Required): Installationid = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installationid]
  }
}

