package typingsSlinky.freedom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Views extends js.Object {
  var views: StringDictionary[js.Object] = js.native
}

object Views {
  @scala.inline
  def apply(views: StringDictionary[js.Object]): Views = {
    val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Views]
  }
  @scala.inline
  implicit class ViewsOps[Self <: Views] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViews(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

