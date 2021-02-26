package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
  */
@js.native
trait Probe extends StObject {
  
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  var exec: ExecAction = js.native
  
  /**
    * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
    */
  var failureThreshold: Double = js.native
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: HTTPGetAction = js.native
  
  /**
    * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: Double = js.native
  
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
    */
  var periodSeconds: Double = js.native
  
  /**
    * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
    */
  var successThreshold: Double = js.native
  
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: TCPSocketAction = js.native
  
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: Double = js.native
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
  implicit class ProbeMutableBuilder[Self <: Probe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: ExecAction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGet(value: HTTPGetAction): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelaySeconds(value: Double): Self = StObject.set(x, "initialDelaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSeconds(value: Double): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpSocket(value: TCPSocketAction): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
  }
}
