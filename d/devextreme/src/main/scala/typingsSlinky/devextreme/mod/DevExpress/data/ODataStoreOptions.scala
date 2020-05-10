package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.AnonAsync
import typingsSlinky.devextreme.AnonErrorDetails
import typingsSlinky.devextreme.devextremeStrings.Decimal
import typingsSlinky.devextreme.devextremeStrings.Int32
import typingsSlinky.devextreme.devextremeStrings.Int64
import typingsSlinky.devextreme.devextremeStrings.Single
import typingsSlinky.devextreme.devextremeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataStoreOptions extends StoreOptions[ODataStore] {
  /** Specifies a function that customizes the request before it is sent to the server. */
  var beforeSend: js.UndefOr[js.Function1[/* options */ AnonAsync, _]] = js.native
  /** Specifies whether the store serializes/parses date-time values. */
  var deserializeDates: js.UndefOr[Boolean] = js.native
  /** Specifies a function that is executed when the ODataStore throws an error. */
  @JSName("errorHandler")
  var errorHandler_ODataStoreOptions: js.UndefOr[js.Function1[/* e */ AnonErrorDetails, _]] = js.native
  /** Specifies the data field types. Accepts the following types: "String", "Int32", "Int64", "Boolean", "Single", "Decimal" and "Guid". */
  var fieldTypes: js.UndefOr[js.Any] = js.native
  /** Specifies whether to convert string values to lowercase in filter and search requests. Applies to the following operations: "startswith", "endswith", "contains", and "notcontains". */
  var filterToLower: js.UndefOr[Boolean] = js.native
  /** Specifies whether data should be sent using JSONP. */
  var jsonp: js.UndefOr[Boolean] = js.native
  /** Specifies the type of the key property or properties. */
  var keyType: js.UndefOr[
    String | Int32 | Int64 | typingsSlinky.devextreme.devextremeStrings.Guid | typingsSlinky.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
  ] = js.native
  /** Specifies the URL of an OData entity collection. */
  var url: js.UndefOr[java.lang.String] = js.native
  /** Specifies the OData version. */
  var version: js.UndefOr[Double] = js.native
  /** Specifies whether to send cookies, authorization headers, and client certificates in a cross-origin request. */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ODataStoreOptions {
  @scala.inline
  def apply(): ODataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataStoreOptions]
  }
  @scala.inline
  implicit class ODataStoreOptionsOps[Self <: ODataStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeSend(value: /* options */ AnonAsync => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserializeDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializeDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserializeDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializeDates")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: /* e */ AnonErrorDetails => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterToLower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterToLower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterToLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterToLower")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(
      value: String | Int32 | Int64 | typingsSlinky.devextreme.devextremeStrings.Guid | typingsSlinky.devextreme.devextremeStrings.Boolean | Single | Decimal | js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

