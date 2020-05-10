package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetTopPathsResponseItem extends js.Object {
  var count: Double = js.native
  var path: String = js.native
  var title: String = js.native
  var uniques: Double = js.native
}

object ReposGetTopPathsResponseItem {
  @scala.inline
  def apply(count: Double, path: String, title: String, uniques: Double): ReposGetTopPathsResponseItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetTopPathsResponseItem]
  }
  @scala.inline
  implicit class ReposGetTopPathsResponseItemOps[Self <: ReposGetTopPathsResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniques(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniques")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

