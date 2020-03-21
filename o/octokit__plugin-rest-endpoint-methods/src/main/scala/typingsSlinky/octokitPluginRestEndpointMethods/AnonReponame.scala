package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReponame extends js.Object {
  var migration_id: AnonRequired
  var repo_name: AnonRequired
}

object AnonReponame {
  @scala.inline
  def apply(migration_id: AnonRequired, repo_name: AnonRequired): AnonReponame = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReponame]
  }
}

