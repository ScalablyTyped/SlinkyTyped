package typingsSlinky.extjs.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlWriter
  extends typingsSlinky.extjs.Ext.data.writer.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
}

object IXmlWriter {
  @scala.inline
  def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  @scala.inline
  implicit class IXmlWriterOps[Self <: IXmlWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDocumentRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDocumentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDocumentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
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
  }
  
}

