package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
@js.native
trait VolumeMount extends js.Object {
  /**
    * Path within the container at which the volume should be mounted.  Must not contain ':'.
    */
  val mountPath: String = js.native
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the
    * other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  val mountPropagation: String = js.native
  /**
    * This must match the Name of a Volume.
    */
  val name: String = js.native
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  val readOnly: Boolean = js.native
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to ""
    * (volume's root).
    */
  val subPath: String = js.native
  /**
    * Expanded path within the volume from which the container's volume should be mounted.
    * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded
    * using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath
    * are mutually exclusive.
    */
  val subPathExpr: String = js.native
}

object VolumeMount {
  @scala.inline
  def apply(
    mountPath: String,
    mountPropagation: String,
    name: String,
    readOnly: Boolean,
    subPath: String,
    subPathExpr: String
  ): VolumeMount = {
    val __obj = js.Dynamic.literal(mountPath = mountPath.asInstanceOf[js.Any], mountPropagation = mountPropagation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], subPath = subPath.asInstanceOf[js.Any], subPathExpr = subPathExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeMount]
  }
  @scala.inline
  implicit class VolumeMountOps[Self <: VolumeMount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMountPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountPropagation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubPathExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPathExpr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

