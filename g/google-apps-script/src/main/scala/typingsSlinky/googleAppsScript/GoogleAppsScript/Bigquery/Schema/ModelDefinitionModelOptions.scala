package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelDefinitionModelOptions extends js.Object {
  var labels: js.UndefOr[js.Array[String]] = js.native
  var lossType: js.UndefOr[String] = js.native
  var modelType: js.UndefOr[String] = js.native
}

object ModelDefinitionModelOptions {
  @scala.inline
  def apply(): ModelDefinitionModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDefinitionModelOptions]
  }
  @scala.inline
  implicit class ModelDefinitionModelOptionsOps[Self <: ModelDefinitionModelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLossType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossType")(js.undefined)
        ret
    }
    @scala.inline
    def withModelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
  }
  
}

