package typingsSlinky.extjs.Ext.data.writer

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.IOperation
import typingsSlinky.extjs.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWriter extends IBase {
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Ext.data.Model The record that we are writing to the server.
  		* @param operation Ext.data.Operation An operation object.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], _]
  ] = js.native
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.native
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns Ext.data.Request The modified request object
  		*/
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var writeRecordId: js.UndefOr[Boolean] = js.native
}

object IWriter {
  @scala.inline
  def apply(): IWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriter]
  }
  @scala.inline
  implicit class IWriterOps[Self <: IWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecordData(value: (/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetRecordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordData")(js.undefined)
        ret
    }
    @scala.inline
    def withNameProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteAllFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAllFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAllFields")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteRecordId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRecordId")(js.undefined)
        ret
    }
  }
  
}

