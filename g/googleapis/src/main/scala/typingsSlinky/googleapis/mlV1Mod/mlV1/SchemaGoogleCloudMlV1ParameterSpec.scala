package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single hyperparameter to optimize.
  */
@js.native
trait SchemaGoogleCloudMlV1ParameterSpec extends js.Object {
  /**
    * Required if type is `CATEGORICAL`. The list of possible categories.
    */
  var categoricalValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required if type is `DISCRETE`. A list of feasible points. The list
    * should be in strictly increasing order. For instance, this parameter
    * might have possible settings of 1.5, 2.5, and 4.0. This list should not
    * contain more than 1,000 values.
    */
  var discreteValues: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if
    * type is `CATEGORICAL`. This value should be integers if type is
    * `INTEGER`.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if
    * type is `CATEGORICAL`. This value should be integers if type is INTEGER.
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Required. The parameter name must be unique amongst all ParameterConfigs
    * in a HyperparameterSpec message. E.g., &quot;learning_rate&quot;.
    */
  var parameterName: js.UndefOr[String] = js.native
  /**
    * Optional. How the parameter should be scaled to the hypercube. Leave
    * unset for categorical parameters. Some kind of scaling is strongly
    * recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
    */
  var scaleType: js.UndefOr[String] = js.native
  /**
    * Required. The type of the parameter.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1ParameterSpec {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ParameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ParameterSpec]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ParameterSpecOps[Self <: SchemaGoogleCloudMlV1ParameterSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscreteValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discreteValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscreteValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discreteValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

