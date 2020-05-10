package typingsSlinky.pulumiKubernetes.inputMod.apps.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to
  * perform updates. It includes any additional parameters necessary to perform the update for
  * the indicated strategy.
  */
@js.native
trait StatefulSetUpdateStrategy extends js.Object {
  /**
    * RollingUpdate is used to communicate parameters when Type is
    * RollingUpdateStatefulSetStrategyType.
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateStatefulSetStrategy]] = js.native
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object StatefulSetUpdateStrategy {
  @scala.inline
  def apply(): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
  @scala.inline
  implicit class StatefulSetUpdateStrategyOps[Self <: StatefulSetUpdateStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollingUpdate(value: Input[RollingUpdateStatefulSetStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
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

