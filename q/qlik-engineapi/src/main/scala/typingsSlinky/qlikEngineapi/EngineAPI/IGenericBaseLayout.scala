package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBaseLayout...
  */
@js.native
trait IGenericBaseLayout extends js.Object {
  var qInfo: INxInfo = js.native
  var qMeta: INxMeta = js.native
}

object IGenericBaseLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeta: INxMeta): IGenericBaseLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBaseLayout]
  }
  @scala.inline
  implicit class IGenericBaseLayoutOps[Self <: IGenericBaseLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQInfo(value: INxInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeta(value: INxMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

