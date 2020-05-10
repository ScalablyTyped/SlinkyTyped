package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val exec: ExecAction = js.native
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded.
    * Defaults to 3. Minimum value is 1.
    */
  val failureThreshold: Double = js.native
  /**
    * HTTPGet specifies the http request to perform.
    */
  val httpGet: HTTPGetAction = js.native
  /**
    * Number of seconds after the container has started before liveness probes are initiated.
    * More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val initialDelaySeconds: Double = js.native
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  val periodSeconds: Double = js.native
  /**
    * Minimum consecutive successes for the probe to be considered successful after having
    * failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  val successThreshold: Double = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  val tcpSocket: TCPSocketAction = js.native
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is
    * 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val timeoutSeconds: Double = js.native
}

object Probe {
  @scala.inline
  def apply(
    exec: ExecAction,
    failureThreshold: Double,
    httpGet: HTTPGetAction,
    initialDelaySeconds: Double,
    periodSeconds: Double,
    successThreshold: Double,
    tcpSocket: TCPSocketAction,
    timeoutSeconds: Double
  ): Probe = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], failureThreshold = failureThreshold.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], initialDelaySeconds = initialDelaySeconds.asInstanceOf[js.Any], periodSeconds = periodSeconds.asInstanceOf[js.Any], successThreshold = successThreshold.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any], timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Probe]
  }
  @scala.inline
  implicit class ProbeOps[Self <: Probe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: ExecAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpGet(value: HTTPGetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialDelaySeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelaySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriodSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcpSocket(value: TCPSocketAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

