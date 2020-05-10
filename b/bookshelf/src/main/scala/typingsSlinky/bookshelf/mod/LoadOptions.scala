package typingsSlinky.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadOptions extends SyncOptions {
  var withRelated: js.Array[String | WithRelatedQuery] = js.native
}

object LoadOptions {
  @scala.inline
  def apply(withRelated: js.Array[String | WithRelatedQuery]): LoadOptions = {
    val __obj = js.Dynamic.literal(withRelated = withRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithRelated(value: js.Array[String | WithRelatedQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRelated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

