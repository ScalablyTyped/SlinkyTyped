package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantProperty extends js.Object {
  /**
    * The type of variant property. The supported values are:    DesiredInstanceCount: Overrides the existing variant instance counts using the InitialInstanceCount values in the ProductionVariants.    DesiredWeight: Overrides the existing variant weights using the InitialVariantWeight values in the ProductionVariants.    DataCaptureConfig: (Not currently supported.)  
    */
  var VariantPropertyType: typingsSlinky.awsSdk.sagemakerMod.VariantPropertyType = js.native
}

object VariantProperty {
  @scala.inline
  def apply(VariantPropertyType: VariantPropertyType): VariantProperty = {
    val __obj = js.Dynamic.literal(VariantPropertyType = VariantPropertyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantProperty]
  }
  @scala.inline
  implicit class VariantPropertyOps[Self <: VariantProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariantPropertyType(value: VariantPropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VariantPropertyType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

