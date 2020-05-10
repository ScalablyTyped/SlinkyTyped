package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
@js.native
trait SchemaVolumeMount extends js.Object {
  /**
    * Path within the container at which the volume should be mounted.  Must
    * not contain &#39;:&#39;.
    */
  var mountPath: js.UndefOr[String] = js.native
  /**
    * mountPropagation determines how mounts are propagated from the host to
    * container and the other way around. When not set,
    * MountPropagationHostToContainer is used. This field is beta in 1.10.
    * +optional
    */
  var mountPropagation: js.UndefOr[String] = js.native
  /**
    * This must match the Name of a Volume.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified).
    * Defaults to false. +optional
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Path within the volume from which the container&#39;s volume should be
    * mounted. Defaults to &quot;&quot; (volume&#39;s root). +optional
    */
  var subPath: js.UndefOr[String] = js.native
}

object SchemaVolumeMount {
  @scala.inline
  def apply(): SchemaVolumeMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeMount]
  }
  @scala.inline
  implicit class SchemaVolumeMountOps[Self <: SchemaVolumeMount] (val x: Self) extends AnyVal {
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
    def withoutMountPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMountPropagation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSubPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPath")(js.undefined)
        ret
    }
  }
  
}

