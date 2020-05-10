package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * A range of values within which the parameter can be set.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The conditions under which changes to this parameter can be applied. For example, requires-reboot indicates that a new value for this parameter will only take effect if a node is rebooted.
    */
  var ChangeType: js.UndefOr[typingsSlinky.awsSdk.daxMod.ChangeType] = js.native
  /**
    * The data type of the parameter. For example, integer:
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * A description of the parameter
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Whether the customer is allowed to modify the parameter.
    */
  var IsModifiable: js.UndefOr[typingsSlinky.awsSdk.daxMod.IsModifiable] = js.native
  /**
    * A list of node types, and specific parameter values for each node.
    */
  var NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList] = js.native
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
    */
  var ParameterType: js.UndefOr[typingsSlinky.awsSdk.daxMod.ParameterType] = js.native
  /**
    * The value for the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  /**
    * How the parameter is defined. For example, system denotes a system-defined parameter.
    */
  var Source: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeType(value: ChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataType")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIsModifiable(value: IsModifiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsModifiable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsModifiable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsModifiable")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTypeSpecificValues(value: NodeTypeSpecificValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeTypeSpecificValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTypeSpecificValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeTypeSpecificValues")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterType(value: ParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterType")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
  }
  
}

