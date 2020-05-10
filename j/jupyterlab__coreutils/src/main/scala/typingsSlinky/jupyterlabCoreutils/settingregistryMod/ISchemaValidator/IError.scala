package typingsSlinky.jupyterlabCoreutils.settingregistryMod.ISchemaValidator

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schema validation error definition.
  */
@js.native
trait IError extends js.Object {
  /**
    * The path in the data where the error occurred.
    */
  var dataPath: String = js.native
  /**
    * The keyword whose validation failed.
    */
  var keyword: String = js.native
  /**
    * The error message.
    */
  var message: String = js.native
  /**
    * Optional parameter metadata that might be included in an error.
    */
  var params: js.UndefOr[ReadonlyJSONObject] = js.native
  /**
    * The path in the schema where the error occurred.
    */
  var schemaPath: String = js.native
}

object IError {
  @scala.inline
  def apply(dataPath: String, keyword: String, message: String, schemaPath: String): IError = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

