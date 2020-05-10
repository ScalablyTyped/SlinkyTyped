package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlReader
  extends typingsSlinky.extjs.Ext.data.reader.IReader {
  /** [Method] Normalizes the data object
  		* @param data Object The raw data object
  		* @returns Object The documentElement property of the data object if present, or the same object if not.
  		*/
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String) */
  var namespace: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.native
}

object IXmlReader {
  @scala.inline
  def apply(): IXmlReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlReader]
  }
  @scala.inline
  implicit class IXmlReaderOps[Self <: IXmlReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: /* data */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlData")(js.undefined)
        ret
    }
  }
  
}

