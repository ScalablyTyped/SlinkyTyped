package typingsSlinky.googleapis.kgsearchV1Mod.kgsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message includes the context and a list of matching results which
  * contain the detail of associated entities.
  */
@js.native
trait SchemaSearchResponse extends js.Object {
  /**
    * The local context applicable for the response. See more details at
    * http://www.w3.org/TR/json-ld/#context-definitions.
    */
  var `@context`: js.UndefOr[js.Any] = js.native
  /**
    * The schema type of top-level JSON-LD object, e.g. ItemList.
    */
  var `@type`: js.UndefOr[js.Any] = js.native
  /**
    * The item list of search results.
    */
  var itemListElement: js.UndefOr[js.Array[_]] = js.native
}

object SchemaSearchResponse {
  @scala.inline
  def apply(): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResponse]
  }
  @scala.inline
  implicit class SchemaSearchResponseOps[Self <: SchemaSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with@context`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without@context`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@context")(js.undefined)
        ret
    }
    @scala.inline
    def `with@type`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without@type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@type")(js.undefined)
        ret
    }
    @scala.inline
    def withItemListElement(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemListElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemListElement")(js.undefined)
        ret
    }
  }
  
}

