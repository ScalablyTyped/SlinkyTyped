package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appid extends js.Object {
  var app_id: Type
  var check_name: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var ref: Required
  var repo: Required
}

object Appid {
  @scala.inline
  def apply(
    app_id: Type,
    check_name: Type,
    owner: Required,
    page: Type,
    per_page: Type,
    ref: Required,
    repo: Required
  ): Appid = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], check_name = check_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
}

