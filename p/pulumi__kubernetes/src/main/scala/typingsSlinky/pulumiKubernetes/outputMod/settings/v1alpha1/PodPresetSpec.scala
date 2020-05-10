package typingsSlinky.pulumiKubernetes.outputMod.settings.v1alpha1

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EnvFromSource
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EnvVar
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.Volume
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.VolumeMount
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodPresetSpec is a description of a pod preset.
  */
@js.native
trait PodPresetSpec extends js.Object {
  /**
    * Env defines the collection of EnvVar to inject into containers.
    */
  val env: js.Array[EnvVar] = js.native
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  val envFrom: js.Array[EnvFromSource] = js.native
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  val selector: LabelSelector = js.native
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  val volumeMounts: js.Array[VolumeMount] = js.native
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  val volumes: js.Array[Volume] = js.native
}

object PodPresetSpec {
  @scala.inline
  def apply(
    env: js.Array[EnvVar],
    envFrom: js.Array[EnvFromSource],
    selector: LabelSelector,
    volumeMounts: js.Array[VolumeMount],
    volumes: js.Array[Volume]
  ): PodPresetSpec = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodPresetSpec]
  }
  @scala.inline
  implicit class PodPresetSpecOps[Self <: PodPresetSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: js.Array[EnvVar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvFrom(value: js.Array[EnvFromSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeMounts(value: js.Array[VolumeMount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[Volume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

