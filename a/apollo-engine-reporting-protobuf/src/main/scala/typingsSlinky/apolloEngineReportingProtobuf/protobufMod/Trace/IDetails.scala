package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Details. */
@js.native
trait IDetails extends js.Object {
  /** Details operationName */
  var operationName: js.UndefOr[String | Null] = js.native
  /** Details rawQuery */
  var rawQuery: js.UndefOr[String | Null] = js.native
  /** Details variables */
  var variables: js.UndefOr[StringDictionary[js.typedarray.Uint8Array] | Null] = js.native
  /** Details variablesJson */
  var variablesJson: js.UndefOr[StringDictionary[String] | Null] = js.native
}

object IDetails {
  @scala.inline
  def apply(): IDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetails]
  }
  @scala.inline
  implicit class IDetailsOps[Self <: IDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(null)
        ret
    }
    @scala.inline
    def withRawQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withRawQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawQuery")(null)
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
    @scala.inline
    def withVariablesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(null)
        ret
    }
    @scala.inline
    def withVariablesJson(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variablesJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariablesJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variablesJson")(js.undefined)
        ret
    }
    @scala.inline
    def withVariablesJsonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variablesJson")(null)
        ret
    }
  }
  
}

