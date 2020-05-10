package typingsSlinky.extjs.Ext.data.proxy

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonP extends IServer {
  /** [Method] Aborts the current server request if one is currently running */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.native
  /** [Method] Encodes an array of records into a value suitable to be added to the request params as the recordParam parameter
  		* @param records Ext.data.Model[] The records array
  		* @returns Array An array of record data objects
  		*/
  var encodeRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Array]] = js.native
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[String] = js.native
}

object IJsonP {
  @scala.inline
  def apply(): IJsonP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonP]
  }
  @scala.inline
  implicit class IJsonPOps[Self <: IJsonP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAppendParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAppendParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAppendParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAppendParams")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeRecords(value: /* records */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordParam")(js.undefined)
        ret
    }
  }
  
}

