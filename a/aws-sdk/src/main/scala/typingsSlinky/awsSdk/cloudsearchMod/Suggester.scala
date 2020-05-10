package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggester extends js.Object {
  var DocumentSuggesterOptions: typingsSlinky.awsSdk.cloudsearchMod.DocumentSuggesterOptions = js.native
  var SuggesterName: StandardName = js.native
}

object Suggester {
  @scala.inline
  def apply(DocumentSuggesterOptions: DocumentSuggesterOptions, SuggesterName: StandardName): Suggester = {
    val __obj = js.Dynamic.literal(DocumentSuggesterOptions = DocumentSuggesterOptions.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggester]
  }
  @scala.inline
  implicit class SuggesterOps[Self <: Suggester] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentSuggesterOptions(value: DocumentSuggesterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentSuggesterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggesterName(value: StandardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggesterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

