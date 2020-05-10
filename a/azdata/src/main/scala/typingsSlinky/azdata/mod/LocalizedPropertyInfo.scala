package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedPropertyInfo extends js.Object {
  var propertyDisplayName: String = js.native
  var propertyName: String = js.native
  var propertyValue: String = js.native
  var propertyValueDisplayName: String = js.native
}

object LocalizedPropertyInfo {
  @scala.inline
  def apply(
    propertyDisplayName: String,
    propertyName: String,
    propertyValue: String,
    propertyValueDisplayName: String
  ): LocalizedPropertyInfo = {
    val __obj = js.Dynamic.literal(propertyDisplayName = propertyDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValue = propertyValue.asInstanceOf[js.Any], propertyValueDisplayName = propertyValueDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedPropertyInfo]
  }
  @scala.inline
  implicit class LocalizedPropertyInfoOps[Self <: LocalizedPropertyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValueDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyValueDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

