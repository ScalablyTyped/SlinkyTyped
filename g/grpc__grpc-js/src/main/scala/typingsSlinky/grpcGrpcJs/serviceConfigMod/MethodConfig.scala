package typingsSlinky.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodConfig extends js.Object {
  var maxRequestBytes: js.UndefOr[Double] = js.native
  var maxResponseBytes: js.UndefOr[Double] = js.native
  var name: js.Array[MethodConfigName] = js.native
  var timeout: js.UndefOr[String] = js.native
  var waitForReady: js.UndefOr[Boolean] = js.native
}

object MethodConfig {
  @scala.inline
  def apply(name: js.Array[MethodConfigName]): MethodConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfig]
  }
  @scala.inline
  implicit class MethodConfigOps[Self <: MethodConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: js.Array[MethodConfigName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRequestBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequestBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequestBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResponseBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResponseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResponseBytes")(js.undefined)
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
    def withWaitForReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForReady")(js.undefined)
        ret
    }
  }
  
}

