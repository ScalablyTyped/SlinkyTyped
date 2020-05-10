package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportingDescriptorReference extends js.Object {
  /**
    * A guid that uniquely identifies the descriptor.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * The id of the descriptor.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors,
    * or toolComponent.taxonomyDescriptors, depending on context.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A reference used to locate the toolComponent associated with the descriptor.
    */
  var toolComponent: js.UndefOr[ToolComponentReference] = js.native
}

object ReportingDescriptorReference {
  @scala.inline
  def apply(): ReportingDescriptorReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingDescriptorReference]
  }
  @scala.inline
  implicit class ReportingDescriptorReferenceOps[Self <: ReportingDescriptorReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withToolComponent(value: ToolComponentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolComponent")(js.undefined)
        ret
    }
  }
  
}

