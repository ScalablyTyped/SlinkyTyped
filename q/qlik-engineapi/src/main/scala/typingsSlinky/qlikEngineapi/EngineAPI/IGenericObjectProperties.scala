package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericObjectProperties width extend GenericProperties
  */
@js.native
trait IGenericObjectProperties extends IGenericProperties {
  var qExtendsId: js.UndefOr[String] = js.native
}

object IGenericObjectProperties {
  @scala.inline
  def apply(qInfo: INxInfo): IGenericObjectProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectProperties]
  }
  @scala.inline
  implicit class IGenericObjectPropertiesOps[Self <: IGenericObjectProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExtendsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExtendsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQExtendsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExtendsId")(js.undefined)
        ret
    }
  }
  
}

