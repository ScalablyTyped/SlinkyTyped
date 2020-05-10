package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGenericMeasureListLayout
  */
@js.native
trait IGenericMeasureListLayout extends IGenericBaseLayout {
  var qMeassureListObject: IMeassureList = js.native
}

object IGenericMeasureListLayout {
  @scala.inline
  def apply(qInfo: INxInfo, qMeassureListObject: IMeassureList, qMeta: INxMeta): IGenericMeasureListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeassureListObject = qMeassureListObject.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListLayout]
  }
  @scala.inline
  implicit class IGenericMeasureListLayoutOps[Self <: IGenericMeasureListLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQMeassureListObject(value: IMeassureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeassureListObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

