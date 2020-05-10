package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Facet extends js.Object {
  /**
    * The unique key for the document attribute.
    */
  var DocumentAttributeKey: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DocumentAttributeKey] = js.native
}

object Facet {
  @scala.inline
  def apply(): Facet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facet]
  }
  @scala.inline
  implicit class FacetOps[Self <: Facet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentAttributeKey(value: DocumentAttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAttributeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeKey")(js.undefined)
        ret
    }
  }
  
}

