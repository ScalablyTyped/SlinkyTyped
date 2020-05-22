package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Archiveformat extends js.Object {
  var archive_format: Required
  var artifact_id: Required
  var owner: Required
  var repo: Required
}

object Archiveformat {
  @scala.inline
  def apply(archive_format: Required, artifact_id: Required, owner: Required, repo: Required): Archiveformat = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archiveformat]
  }
}

