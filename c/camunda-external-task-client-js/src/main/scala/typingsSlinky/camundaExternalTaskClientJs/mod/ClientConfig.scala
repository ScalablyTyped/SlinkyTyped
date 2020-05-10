package typingsSlinky.camundaExternalTaskClientJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConfig extends js.Object {
  var asyncResponseTimeout: js.UndefOr[Double] = js.native
  var autoPoll: js.UndefOr[Boolean] = js.native
  var baseUrl: String = js.native
  var interceptors: js.UndefOr[Interceptor | js.Array[Interceptor]] = js.native
  var interval: js.UndefOr[Double] = js.native
  var lockDuration: js.UndefOr[Double] = js.native
  var maxParallelExecutions: js.UndefOr[Double] = js.native
  var maxTasks: js.UndefOr[Double] = js.native
  var use: js.UndefOr[Middleware | js.Array[Middleware]] = js.native
  var workerId: js.UndefOr[String] = js.native
}

object ClientConfig {
  @scala.inline
  def apply(baseUrl: String): ClientConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncResponseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncResponseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncResponseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncResponseTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPoll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPoll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPoll")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptorsFunction1(value: /* config */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInterceptors(value: Interceptor | js.Array[Interceptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptors")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLockDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParallelExecutions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParallelExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTasks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTasks")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFunction1(value: /* client */ Client => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUse(value: Middleware | js.Array[Middleware]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(js.undefined)
        ret
    }
  }
  
}

