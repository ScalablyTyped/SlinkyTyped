package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kubernetes taint is comprised of three fields: key, value, and effect.
  * Effect can only be one of three types:  NoSchedule, PreferNoSchedule or
  * NoExecute.  For more information, including usage and the valid values,
  * see:
  * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
  */
@js.native
trait SchemaNodeTaint extends js.Object {
  /**
    * Effect for taint.
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * Key for taint.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for taint.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaNodeTaint {
  @scala.inline
  def apply(): SchemaNodeTaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTaint]
  }
  @scala.inline
  implicit class SchemaNodeTaintOps[Self <: SchemaNodeTaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

