package typingsSlinky.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceArguments extends Container {
  /**
    * A collection of containers that will be deployed as part of this Service, if there are multiple.
    */
  var containers: js.UndefOr[Containers] = js.native
  /**
    * The properties of the host where this service can run.
    */
  var host: js.UndefOr[HostProperties] = js.native
  /**
    * The number of copies of this Service's containers to deploy and maintain
    * as part of the running service.  Defaults to `1`.
    */
  var replicas: js.UndefOr[Double] = js.native
  /**
    *
    * Determines whether the service should wait to fully transition to a new steady state on creation and updates. If
    * set to false, the service may complete its deployment before it is fully ready to be used. Defaults to 'true'.
    */
  var waitForSteadyState: js.UndefOr[Boolean] = js.native
}

object ServiceArguments {
  @scala.inline
  def apply(): ServiceArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceArguments]
  }
  @scala.inline
  implicit class ServiceArgumentsOps[Self <: ServiceArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainers(value: Containers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: HostProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSteadyState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSteadyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSteadyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSteadyState")(js.undefined)
        ret
    }
  }
  
}

