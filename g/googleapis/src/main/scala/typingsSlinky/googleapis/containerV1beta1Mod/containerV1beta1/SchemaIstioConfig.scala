package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for Istio addon.
  */
@js.native
trait SchemaIstioConfig extends js.Object {
  /**
    * The specified Istio auth mode, either none, or mutual TLS.
    */
  var auth: js.UndefOr[String] = js.native
  /**
    * Whether Istio is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaIstioConfig {
  @scala.inline
  def apply(): SchemaIstioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIstioConfig]
  }
  @scala.inline
  implicit class SchemaIstioConfigOps[Self <: SchemaIstioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

