package typingsSlinky.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentNotFoundError
  extends typingsSlinky.mongoose.mod.Error {
  var filter: js.Any = js.native
  @JSName("name")
  var name_DocumentNotFoundError: typingsSlinky.mongoose.mongooseStrings.DocumentNotFoundError = js.native
  var query: js.Any = js.native
}

object DocumentNotFoundError {
  @scala.inline
  def apply(filter: js.Any, name: typingsSlinky.mongoose.mongooseStrings.DocumentNotFoundError, query: js.Any): DocumentNotFoundError = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentNotFoundError]
  }
  @scala.inline
  implicit class DocumentNotFoundErrorOps[Self <: DocumentNotFoundError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: typingsSlinky.mongoose.mongooseStrings.DocumentNotFoundError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

