package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterSpecification extends js.Object {
  /**
    * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  /**
    * A brief description of the hyperparameter.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * Indicates whether this hyperparameter is required.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
    */
  var IsTunable: js.UndefOr[Boolean] = js.native
  /**
    * The name of this hyperparameter. The name must be unique.
    */
  var Name: ParameterName = js.native
  /**
    * The allowed range for this hyperparameter.
    */
  var Range: js.UndefOr[ParameterRange] = js.native
  /**
    * The type of this hyperparameter. The valid types are Integer, Continuous, Categorical, and FreeText.
    */
  var Type: ParameterType = js.native
}

object HyperParameterSpecification {
  @scala.inline
  def apply(Name: ParameterName, Type: ParameterType): HyperParameterSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterSpecification]
  }
  @scala.inline
  implicit class HyperParameterSpecificationOps[Self <: HyperParameterSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ParameterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: ParameterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: EntityDescription): Self = {
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
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTunable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTunable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTunable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTunable")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: ParameterRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(js.undefined)
        ret
    }
  }
  
}

