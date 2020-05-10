package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for WorkerPool autoscaling.
  */
@js.native
trait SchemaAutoscalingSettings extends js.Object {
  /**
    * The algorithm to use for autoscaling.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * The maximum number of workers to cap scaling at.
    */
  var maxNumWorkers: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingSettings {
  @scala.inline
  def apply(): SchemaAutoscalingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingSettings]
  }
  @scala.inline
  implicit class SchemaAutoscalingSettingsOps[Self <: SchemaAutoscalingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumWorkers")(js.undefined)
        ret
    }
  }
  
}

