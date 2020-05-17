package typingsSlinky.devextreme.mod.DevExpress.data

import typingsSlinky.devextreme.anon.Async
import typingsSlinky.devextreme.anon.ErrorDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataContextOptions extends js.Object {
  /** Specifies a function that customizes the request before it is sent to the server. */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Async, _]] = js.native
  /** Specifies whether stores in the ODataContext serialize/parse date-time values. */
  var deserializeDates: js.UndefOr[Boolean] = js.native
  /** Specifies entity collections to be accessed. */
  var entities: js.UndefOr[js.Any] = js.native
  /** Specifies a function that is executed when the ODataContext throws an error. */
  var errorHandler: js.UndefOr[js.Function1[/* e */ ErrorDetails, _]] = js.native
  /** Specifies whether to convert string values to lowercase in filter and search requests. Applies to the following operations: "startswith", "endswith", "contains", and "notcontains". */
  var filterToLower: js.UndefOr[Boolean] = js.native
  /** Specifies whether data should be sent using JSONP. */
  var jsonp: js.UndefOr[Boolean] = js.native
  /** Specifies the URL of an OData service. */
  var url: js.UndefOr[String] = js.native
  /** Specifies the OData version. */
  var version: js.UndefOr[Double] = js.native
  /** Specifies whether to send cookies, authorization headers, and client certificates in a cross-origin request. */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ODataContextOptions {
  @scala.inline
  def apply(): ODataContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ODataContextOptions]
  }
  @scala.inline
  implicit class ODataContextOptionsOps[Self <: ODataContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeSend(value: /* options */ Async => _): Self = {
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
    def withEntities(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: /* e */ ErrorDetails => _): Self = {
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
    def withUrl(value: String): Self = {
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

