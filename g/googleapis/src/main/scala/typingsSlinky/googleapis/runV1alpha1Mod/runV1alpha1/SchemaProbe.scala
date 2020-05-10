package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Probe describes a health check to be performed against a container to
  * determine whether it is alive or ready to receive traffic.
  */
@js.native
trait SchemaProbe extends js.Object {
  /**
    * Minimum consecutive failures for the probe to be considered failed after
    * having succeeded. Defaults to 3. Minimum value is 1. +optional
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * The action taken to determine the health of a container
    */
  var handler: js.UndefOr[SchemaHandler] = js.native
  /**
    * Number of seconds after the container has started before liveness probes
    * are initiated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var initialDelaySeconds: js.UndefOr[Double] = js.native
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds.
    * Minimum value is 1. +optional
    */
  var periodSeconds: js.UndefOr[Double] = js.native
  /**
    * Minimum consecutive successes for the probe to be considered successful
    * after having failed. Defaults to 1. Must be 1 for liveness. Minimum value
    * is 1. +optional
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second.
    * Minimum value is 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object SchemaProbe {
  @scala.inline
  def apply(): SchemaProbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProbe]
  }
  @scala.inline
  implicit class SchemaProbeOps[Self <: SchemaProbe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureThreshold(value: Double): Self = {
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
    def withHandler(value: SchemaHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDelaySeconds(value: Double): Self = {
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
    def withPeriodSeconds(value: Double): Self = {
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
    def withSuccessThreshold(value: Double): Self = {
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
    def withTimeoutSeconds(value: Double): Self = {
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

