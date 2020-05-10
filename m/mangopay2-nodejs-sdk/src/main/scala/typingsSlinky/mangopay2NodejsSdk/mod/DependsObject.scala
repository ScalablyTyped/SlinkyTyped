package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.models.Model
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependsObject extends js.Object {
  var dependsPropertyName: String = js.native
  var propertyName: String = js.native
  var propertyValueMapping: Record[String, Model[_]] = js.native
}

object DependsObject {
  @scala.inline
  def apply(dependsPropertyName: String, propertyName: String, propertyValueMapping: Record[String, Model[_]]): DependsObject = {
    val __obj = js.Dynamic.literal(dependsPropertyName = dependsPropertyName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValueMapping = propertyValueMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependsObject]
  }
  @scala.inline
  implicit class DependsObjectOps[Self <: DependsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependsPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependsPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyValueMapping(value: Record[String, Model[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyValueMapping")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

