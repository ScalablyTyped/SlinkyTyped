package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericProperties
  */
@js.native
trait IGenericProperties
  extends // ?Dynamic properties?
/* qMetaDef */ StringDictionary[js.Any] {
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo = js.native
}

object IGenericProperties {
  @scala.inline
  def apply(qInfo: INxInfo): IGenericProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericProperties]
  }
  @scala.inline
  implicit class IGenericPropertiesOps[Self <: IGenericProperties] (val x: Self) extends AnyVal {
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
  }
  
}

