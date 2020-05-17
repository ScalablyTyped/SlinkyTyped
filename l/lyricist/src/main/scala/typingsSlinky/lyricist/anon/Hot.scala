package typingsSlinky.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hot extends js.Object {
  var hot: Boolean = js.native
  var pageviews: Double = js.native
  var unreviewed_annotations: Double = js.native
}

object Hot {
  @scala.inline
  def apply(hot: Boolean, pageviews: Double, unreviewed_annotations: Double): Hot = {
    val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hot]
  }
  @scala.inline
  implicit class HotOps[Self <: Hot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageviews(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnreviewed_annotations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreviewed_annotations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

