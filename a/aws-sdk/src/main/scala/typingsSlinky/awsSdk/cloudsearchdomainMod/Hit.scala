package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hit extends js.Object {
  /**
    * The expressions returned from a document that matches the search request.
    */
  var exprs: js.UndefOr[Exprs] = js.native
  /**
    * The fields returned from a document that matches the search request.
    */
  var fields: js.UndefOr[Fields] = js.native
  /**
    * The highlights returned from a document that matches the search request.
    */
  var highlights: js.UndefOr[Highlights] = js.native
  /**
    * The document ID of a document that matches the search request.
    */
  var id: js.UndefOr[String] = js.native
}

object Hit {
  @scala.inline
  def apply(): Hit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hit]
  }
  @scala.inline
  implicit class HitOps[Self <: Hit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExprs(value: Exprs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExprs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprs")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlights(value: Highlights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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

