package typingsSlinky.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResponse[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
  ] = js.native
  var warning: js.UndefOr[String] = js.native
}

object FindResponse {
  @scala.inline
  def apply[Content](
    docs: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
    ]
  ): FindResponse[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResponse[Content]]
  }
  @scala.inline
  implicit class FindResponseOps[Self[content] <: FindResponse[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withDocs(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
        ]
    ): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: String): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

