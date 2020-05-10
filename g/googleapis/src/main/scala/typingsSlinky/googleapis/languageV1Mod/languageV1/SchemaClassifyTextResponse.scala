package typingsSlinky.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document classification response message.
  */
@js.native
trait SchemaClassifyTextResponse extends js.Object {
  /**
    * Categories representing the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.native
}

object SchemaClassifyTextResponse {
  @scala.inline
  def apply(): SchemaClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextResponse]
  }
  @scala.inline
  implicit class SchemaClassifyTextResponseOps[Self <: SchemaClassifyTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: js.Array[SchemaClassificationCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
  }
  
}

