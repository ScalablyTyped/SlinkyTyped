package typingsSlinky.pulumiKubernetes.inputMod.storage.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSIDriverSpec is the specification of a CSIDriver.
  */
@js.native
trait CSIDriverSpec extends js.Object {
  /**
    * attachRequired indicates this CSI volume driver requires an attach operation (because it
    * implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach
    * controller should call the attach volume interface which checks the volumeattachment status
    * and waits until the volume is attached before proceeding to mounting. The CSI
    * external-attacher coordinates with CSI volume driver and updates the volumeattachment
    * status when the attach operation is complete. If the CSIDriverRegistry feature gate is
    * enabled and the value is specified to false, the attach operation will be skipped.
    * Otherwise the attach operation will be called.
    */
  var attachRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod
    * information (like podName, podUID, etc.) during mount operations. If set to false, pod
    * information will not be passed on mount. Default is false. The CSI driver specifies
    * podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as
    * VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for
    * parsing and validating the information passed in as VolumeContext. The following
    * VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the
    * prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name
    * "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid":
    * string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral
    * inline volume
    *                                 defined by a CSIVolumeSource, otherwise "false"
    *
    * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for
    * drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other
    * drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't
    * support this field, drivers can only support one mode when deployed on such a cluster and
    * the deployment determines which mode that is, for example via a command line parameter of
    * the driver.
    */
  var podInfoOnMount: js.UndefOr[Input[Boolean]] = js.native
  /**
    * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The
    * default if the list is empty is "Persistent", which is the usage defined by the CSI
    * specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode
    * is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with
    * CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to
    * be aware of this because it is only going to get a NodePublishVolume call for such a
    * volume. For more information about implementing this mode, see
    * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one
    * or more of these modes and more modes may be added in the future.
    */
  var volumeLifecycleModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CSIDriverSpec {
  @scala.inline
  def apply(): CSIDriverSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSIDriverSpec]
  }
  @scala.inline
  implicit class CSIDriverSpecOps[Self <: CSIDriverSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachRequired(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withPodInfoOnMount(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podInfoOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodInfoOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podInfoOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeLifecycleModes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeLifecycleModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeLifecycleModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeLifecycleModes")(js.undefined)
        ret
    }
  }
  
}

