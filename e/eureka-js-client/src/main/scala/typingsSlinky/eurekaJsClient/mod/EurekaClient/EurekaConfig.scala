package typingsSlinky.eurekaJsClient.mod.EurekaClient

import typingsSlinky.eurekaJsClient.anon.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EurekaConfig extends js.Object {
  var eureka: EurekaClientConfig = js.native
  var instance: EurekaInstanceConfig = js.native
  var logger: js.UndefOr[Debug] = js.native
  var requestMiddleware: js.UndefOr[
    js.Function2[/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit], Unit]
  ] = js.native
  var shouldUseDelta: js.UndefOr[Boolean] = js.native
}

object EurekaConfig {
  @scala.inline
  def apply(eureka: EurekaClientConfig, instance: EurekaInstanceConfig): EurekaConfig = {
    val __obj = js.Dynamic.literal(eureka = eureka.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaConfig]
  }
  @scala.inline
  implicit class EurekaConfigOps[Self <: EurekaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEureka(value: EurekaClientConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eureka")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: EurekaInstanceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: Debug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMiddleware(value: (/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMiddleware")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRequestMiddleware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMiddleware")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUseDelta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUseDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUseDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUseDelta")(js.undefined)
        ret
    }
  }
  
}

