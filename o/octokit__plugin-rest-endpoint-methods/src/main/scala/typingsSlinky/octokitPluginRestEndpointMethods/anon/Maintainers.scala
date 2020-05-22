package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maintainers extends js.Object {
  var description: Type
  var maintainers: Type
  var name: Required
  @JSName("org")
  var org_ : Required
  var parent_team_id: Type
  var permission: Enum
  var privacy: Enum
  var repo_names: Type
}

object Maintainers {
  @scala.inline
  def apply(
    description: Type,
    maintainers: Type,
    name: Required,
    org_ : Required,
    parent_team_id: Type,
    permission: Enum,
    privacy: Enum,
    repo_names: Type
  ): Maintainers = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repo_names = repo_names.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintainers]
  }
}

