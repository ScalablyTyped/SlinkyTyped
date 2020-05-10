package typingsSlinky.extjs.Ext.data.writer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJson extends IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var expandData: js.UndefOr[Boolean] = js.native
  /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
  		* @param data Object
  		*/
  var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
}

object IJson {
  @scala.inline
  def apply(): IJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJson]
  }
  @scala.inline
  implicit class IJsonOps[Self <: IJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingle")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetExpandedData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExpandedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetExpandedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExpandedData")(js.undefined)
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
  }
  
}

