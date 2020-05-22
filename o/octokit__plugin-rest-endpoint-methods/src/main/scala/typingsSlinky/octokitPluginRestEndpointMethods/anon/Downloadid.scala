package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadid extends js.Object {
  var download_id: Required
  var owner: Required
  var repo: Required
}

object Downloadid {
  @scala.inline
  def apply(download_id: Required, owner: Required, repo: Required): Downloadid = {
    val __obj = js.Dynamic.literal(download_id = download_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadid]
  }
}

