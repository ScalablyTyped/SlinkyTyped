package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionInsertOneOptions extends CommonOptions {
  //Allow driver to bypass schema validation in MongoDB 3.2 or higher.
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.native
  //Force server to assign _id values instead of driver.
  var forceServerObjectId: js.UndefOr[Boolean] = js.native
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
}

object CollectionInsertOneOptions {
  @scala.inline
  def apply(): CollectionInsertOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionInsertOneOptions]
  }
  @scala.inline
  implicit class CollectionInsertOneOptionsOps[Self <: CollectionInsertOneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBypassDocumentValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDocumentValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassDocumentValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDocumentValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withForceServerObjectId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceServerObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceServerObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceServerObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(js.undefined)
        ret
    }
  }
  
}

