package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Probe describes a health check to be performed against a container to determine whether it is
  * alive or ready to receive traffic.
  */
@js.native
trait Probe extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  var exec: js.UndefOr[Input[ExecAction]] = js.native
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded.
    * Defaults to 3. Minimum value is 1.
    */
  var failureThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetAction]] = js.native
  /**
    * Number of seconds after the container has started before liveness probes are initiated.
    * More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  var periodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Minimum consecutive successes for the probe to be considered successful after having
    * failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  var successThreshold: js.UndefOr[Input[Double]] = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketAction]] = js.native
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is
    * 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: js.UndefOr[Input[Double]] = js.native
}

object Probe {
  @scala.inline
  def apply(): Probe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Probe]
  }
  @scala.inline
  implicit class ProbeOps[Self <: Probe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: Input[ExecAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureThreshold(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpGet(value: Input[HTTPGetAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDelaySeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelaySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDelaySeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelaySeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessThreshold(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpSocket(value: Input[TCPSocketAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpSocket")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(js.undefined)
        ret
    }
  }
  
}

