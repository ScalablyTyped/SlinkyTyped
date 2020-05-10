package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for html properties.
  */
@js.native
trait SchemaHtmlPropertyOptions extends js.Object {
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaHtmlOperatorOptions] = js.native
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval. Can only be set to DEFAULT or NONE.
    */
  var retrievalImportance: js.UndefOr[SchemaRetrievalImportance] = js.native
}

object SchemaHtmlPropertyOptions {
  @scala.inline
  def apply(): SchemaHtmlPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHtmlPropertyOptions]
  }
  @scala.inline
  implicit class SchemaHtmlPropertyOptionsOps[Self <: SchemaHtmlPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatorOptions(value: SchemaHtmlOperatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrievalImportance(value: SchemaRetrievalImportance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievalImportance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrievalImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievalImportance")(js.undefined)
        ret
    }
  }
  
}

