package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about operation (or operation stage) progress.
  */
@js.native
trait SchemaOperationProgress extends js.Object {
  /**
    * Progress metric bundle, for example:   metrics: [{name: &quot;nodes
    * done&quot;,     int_value: 15},             {name: &quot;nodes
    * total&quot;,    int_value: 32}] or   metrics: [{name:
    * &quot;progress&quot;,       double_value: 0.56},             {name:
    * &quot;progress scale&quot;, double_value: 1.0}]
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * A non-parameterized string describing an operation stage. Unset for
    * single-stage operations.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Substages of an operation or a stage.
    */
  var stages: js.UndefOr[js.Array[SchemaOperationProgress]] = js.native
  /**
    * Status of an operation stage. Unset for single-stage operations.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaOperationProgress {
  @scala.inline
  def apply(): SchemaOperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationProgress]
  }
  @scala.inline
  implicit class SchemaOperationProgressOps[Self <: SchemaOperationProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetrics(value: js.Array[SchemaMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStages(value: js.Array[SchemaOperationProgress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stages")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

