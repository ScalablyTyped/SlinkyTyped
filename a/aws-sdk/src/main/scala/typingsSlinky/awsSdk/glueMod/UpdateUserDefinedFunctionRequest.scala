package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserDefinedFunctionRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the function to be updated is located. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the catalog database where the function to be updated is located.
    */
  var DatabaseName: NameString = js.native
  /**
    * A FunctionInput object that redefines the function in the Data Catalog.
    */
  var FunctionInput: UserDefinedFunctionInput = js.native
  /**
    * The name of the function.
    */
  var FunctionName: NameString = js.native
}

object UpdateUserDefinedFunctionRequest {
  @scala.inline
  def apply(DatabaseName: NameString, FunctionInput: UserDefinedFunctionInput, FunctionName: NameString): UpdateUserDefinedFunctionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], FunctionInput = FunctionInput.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserDefinedFunctionRequest]
  }
  @scala.inline
  implicit class UpdateUserDefinedFunctionRequestOps[Self <: UpdateUserDefinedFunctionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionInput(value: UserDefinedFunctionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogId(value: CatalogIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalogId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CatalogId")(js.undefined)
        ret
    }
  }
  
}

