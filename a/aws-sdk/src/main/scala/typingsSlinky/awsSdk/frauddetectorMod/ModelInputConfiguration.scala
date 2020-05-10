package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelInputConfiguration extends js.Object {
  /**
    *  Template for constructing the CSV input-data sent to SageMaker. At event-evaluation, the placeholders for variable-names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var csvInputTemplate: js.UndefOr[String] = js.native
  /**
    *  The format of the model input configuration. The format differs depending on if it is passed through to SageMaker or constructed by Amazon Fraud Detector.
    */
  var format: js.UndefOr[ModelInputDataFormat] = js.native
  /**
    *  For an opaque-model, the input to the model will be a ByteBuffer blob provided in the getPrediction request, and will be passed to SageMaker as-is. For non-opaque models, the input will be constructed by Amazon Fraud Detector based on the model-configuration. 
    */
  var isOpaque: IsOpaque = js.native
  /**
    *  Template for constructing the JSON input-data sent to SageMaker. At event-evaluation, the placeholders for variable names in the template will be replaced with the variable values before being sent to SageMaker. 
    */
  var jsonInputTemplate: js.UndefOr[String] = js.native
}

object ModelInputConfiguration {
  @scala.inline
  def apply(isOpaque: IsOpaque): ModelInputConfiguration = {
    val __obj = js.Dynamic.literal(isOpaque = isOpaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInputConfiguration]
  }
  @scala.inline
  implicit class ModelInputConfigurationOps[Self <: ModelInputConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpaque(value: IsOpaque): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpaque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsvInputTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvInputTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvInputTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvInputTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ModelInputDataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonInputTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonInputTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonInputTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonInputTemplate")(js.undefined)
        ret
    }
  }
  
}

