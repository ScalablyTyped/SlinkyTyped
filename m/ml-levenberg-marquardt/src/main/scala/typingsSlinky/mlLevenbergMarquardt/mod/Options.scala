package typingsSlinky.mlLevenbergMarquardt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The Levenberg-Marquardt lambda parameter.
    * Default value: 0
    */
  var damping: Double = js.native
  /**
    * Minimum uncertainty allowed for each point.
    * Default value: 10e-3
    */
  var errorTolerance: Double = js.native
  /**
    * Adjustment for decrease the damping parameter.
    * Default value: 10e-2
    */
  var gradientDifference: Double = js.native
  /**
    * Initial guesses for the parameters.
    * Default value: Array(parameters.lengh).fill(1)
    */
  var initialValues: js.Array[Double] = js.native
  /**
    * The maximum number of iterations before halting.
    * Default value: 100
    */
  var maxIterations: Double = js.native
  /**
    * Maximum values for the parameters.
    * Default value: Array(data.x.length).fill(MAX_SAFE_INTEGER)
    */
  var maxValue: js.Array[Double] = js.native
  /**
    * Minimum values for the parameters.
    * Default value: Array(data.x.length).fill(MIN_SAFE_INTEGER)
    */
  var minValue: js.Array[Double] = js.native
}

object Options {
  @scala.inline
  def apply(
    damping: Double,
    errorTolerance: Double,
    gradientDifference: Double,
    initialValues: js.Array[Double],
    maxIterations: Double,
    maxValue: js.Array[Double],
    minValue: js.Array[Double]
  ): Options = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], errorTolerance = errorTolerance.asInstanceOf[js.Any], gradientDifference = gradientDifference.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientDifference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

