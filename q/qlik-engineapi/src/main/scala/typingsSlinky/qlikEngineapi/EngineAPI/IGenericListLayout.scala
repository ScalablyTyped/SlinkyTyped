package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericListLayout...
  */
@js.native
trait IGenericListLayout extends IGenericBaseLayout {
  var qListObject: IListObject = js.native
}

object IGenericListLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qListObject: IListObject, qMeta: INxMeta): IGenericListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qListObject = qListObject.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericListLayout]
  }
  @scala.inline
  implicit class IGenericListLayoutOps[Self <: IGenericListLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQListObject(value: IListObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qListObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

