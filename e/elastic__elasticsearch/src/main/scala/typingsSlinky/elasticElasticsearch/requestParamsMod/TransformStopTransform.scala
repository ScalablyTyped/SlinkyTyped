package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformStopTransform extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[String] = js.native
  var transform_id: String = js.native
  var wait_for_checkpoint: js.UndefOr[Boolean] = js.native
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}

object TransformStopTransform {
  @scala.inline
  def apply(transform_id: String): TransformStopTransform = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStopTransform]
  }
  @scala.inline
  implicit class TransformStopTransformOps[Self <: TransformStopTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransform_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_no_match(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_no_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_no_match")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_checkpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_checkpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_checkpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_checkpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withWait_for_completion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_completion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait_for_completion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait_for_completion")(js.undefined)
        ret
    }
  }
  
}

