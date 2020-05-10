package typingsSlinky.pulumiKubernetes.outputMod.apps.v1

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
  val rollingUpdate: RollingUpdateStatefulSetStrategy = js.native
  /**
    * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
    */
  val `type`: String = js.native
}

object StatefulSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateStatefulSetStrategy, `type`: String): StatefulSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetUpdateStrategy]
  }
  @scala.inline
  implicit class StatefulSetUpdateStrategyOps[Self <: StatefulSetUpdateStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollingUpdate(value: RollingUpdateStatefulSetStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

