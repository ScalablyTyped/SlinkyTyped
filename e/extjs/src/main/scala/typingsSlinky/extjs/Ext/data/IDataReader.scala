package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataReader extends IObservable {
  /** [Method] Takes a raw response object as passed to the read method and returns the useful data segment from it
  		* @param response Object The response object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.native
  /** [Method] Reads the given response object
  		* @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
  		* @returns Ext.data.ResultSet The parsed or default ResultSet object
  		*/
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Method] Abstracts common functionality used by all Reader subclasses
  		* @param data Object The raw data object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.native
  /** [Config Option] (Boolean) */
  var readRecordsOnFailure: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[String] = js.native
}

object IDataReader {
  @scala.inline
  def apply(): IDataReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataReader]
  }
  @scala.inline
  implicit class IDataReaderOps[Self <: IDataReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetResponseData(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetResponseData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseData")(js.undefined)
        ret
    }
    @scala.inline
    def withIdProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitIncludes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitIncludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitIncludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitIncludes")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(js.undefined)
        ret
    }
    @scala.inline
    def withRawData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRecords(value: /* data */ js.UndefOr[js.Any] => IResultSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withReadRecordsOnFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecordsOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadRecordsOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readRecordsOnFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalProperty")(js.undefined)
        ret
    }
  }
  
}

