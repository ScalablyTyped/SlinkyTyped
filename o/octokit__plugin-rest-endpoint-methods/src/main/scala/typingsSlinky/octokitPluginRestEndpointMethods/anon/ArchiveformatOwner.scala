package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveformatOwner extends js.Object {
  var archive_format: Required
  var owner: Required
  var ref: Required
  var repo: Required
}

object ArchiveformatOwner {
  @scala.inline
  def apply(archive_format: Required, owner: Required, ref: Required, repo: Required): ArchiveformatOwner = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveformatOwner]
  }
}

