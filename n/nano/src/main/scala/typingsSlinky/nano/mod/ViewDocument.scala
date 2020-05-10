package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDocument[D] extends IdentifiedDocument {
  var views: StringDictionary[View[D]] = js.native
}

object ViewDocument {
  @scala.inline
  def apply[D](_id: String, views: StringDictionary[View[D]]): ViewDocument[D] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDocument[D]]
  }
  @scala.inline
  implicit class ViewDocumentOps[Self[d] <: ViewDocument[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withViews(value: StringDictionary[View[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

