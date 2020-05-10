package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelOutputConfiguration extends js.Object {
  /**
    * A map of CSV index values in the SageMaker response to the Amazon Fraud Detector variables. 
    */
  var csvIndexToVariableMap: js.UndefOr[CsvIndexToVariableMap] = js.native
  /**
    * The format of the model output configuration.
    */
  var format: ModelOutputDataFormat = js.native
  /**
    * A map of JSON keys in response from SageMaker to the Amazon Fraud Detector variables. 
    */
  var jsonKeyToVariableMap: js.UndefOr[JsonKeyToVariableMap] = js.native
}

object ModelOutputConfiguration {
  @scala.inline
  def apply(format: ModelOutputDataFormat): ModelOutputConfiguration = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelOutputConfiguration]
  }
  @scala.inline
  implicit class ModelOutputConfigurationOps[Self <: ModelOutputConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: ModelOutputDataFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsvIndexToVariableMap(value: CsvIndexToVariableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvIndexToVariableMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvIndexToVariableMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvIndexToVariableMap")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonKeyToVariableMap(value: JsonKeyToVariableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonKeyToVariableMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonKeyToVariableMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonKeyToVariableMap")(js.undefined)
        ret
    }
  }
  
}

