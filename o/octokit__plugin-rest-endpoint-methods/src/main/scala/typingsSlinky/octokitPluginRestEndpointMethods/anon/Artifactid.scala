package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifactid extends js.Object {
  var artifact_id: Required
  var owner: Required
  var repo: Required
}

object Artifactid {
  @scala.inline
  def apply(artifact_id: Required, owner: Required, repo: Required): Artifactid = {
    val __obj = js.Dynamic.literal(artifact_id = artifact_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifactid]
  }
}

