package typingsSlinky.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongooseDocumentOptionals extends js.Object {
  /**
    * Virtual getter that by default returns the document's _id field cast to a string,
    * or in the case of ObjectIds, its hexString. This id getter may be disabled by
    * passing the option { id: false } at schema construction time. If disabled, id
    * behaves like any other field on a document and can be assigned any value.
    */
  var id: js.UndefOr[js.Any] = js.native
}

object MongooseDocumentOptionals {
  @scala.inline
  def apply(): MongooseDocumentOptionals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongooseDocumentOptionals]
  }
  @scala.inline
  implicit class MongooseDocumentOptionalsOps[Self <: MongooseDocumentOptionals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

