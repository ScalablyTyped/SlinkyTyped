package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFullTracesReport extends js.Object {
  /** FullTracesReport header */
  var header: js.UndefOr[IReportHeader | Null] = js.native
  /** FullTracesReport tracesPerQuery */
  var tracesPerQuery: js.UndefOr[StringDictionary[ITraces] | Null] = js.native
}

object IFullTracesReport {
  @scala.inline
  def apply(): IFullTracesReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullTracesReport]
  }
  @scala.inline
  implicit class IFullTracesReportOps[Self <: IFullTracesReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: IReportHeader): Self = {
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
    def withHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(null)
        ret
    }
    @scala.inline
    def withTracesPerQuery(value: StringDictionary[ITraces]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracesPerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracesPerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracesPerQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withTracesPerQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracesPerQuery")(null)
        ret
    }
  }
  
}

