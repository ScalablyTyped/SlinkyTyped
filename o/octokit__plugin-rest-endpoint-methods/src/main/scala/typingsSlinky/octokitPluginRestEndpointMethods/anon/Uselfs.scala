package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uselfs extends js.Object {
  var owner: Required
  var repo: Required
  var use_lfs: EnumRequired
}

object Uselfs {
  @scala.inline
  def apply(owner: Required, repo: Required, use_lfs: EnumRequired): Uselfs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uselfs]
  }
}

