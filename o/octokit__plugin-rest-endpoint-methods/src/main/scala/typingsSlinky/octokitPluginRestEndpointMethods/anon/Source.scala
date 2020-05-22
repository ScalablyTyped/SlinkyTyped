package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var owner: Required
  var repo: Required
  var source: Type
  @JSName("source.branch")
  var sourceDotbranch: Enum
  @JSName("source.path")
  var sourceDotpath: Type
}

object Source {
  @scala.inline
  def apply(owner: Required, repo: Required, source: Type, sourceDotbranch: Enum, sourceDotpath: Type): Source = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("source.branch")(sourceDotbranch.asInstanceOf[js.Any])
    __obj.updateDynamic("source.path")(sourceDotpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

