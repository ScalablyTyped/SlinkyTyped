package typingsSlinky.pulumiKubernetes.inputMod.settings.v1alpha1

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.EnvFromSource
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.EnvVar
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.Volume
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.VolumeMount
import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.native
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.native
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.native
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.native
}

object PodPresetSpec {
  @scala.inline
  def apply(): PodPresetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodPresetSpec]
  }
  @scala.inline
  implicit class PodPresetSpecOps[Self <: PodPresetSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: Input[js.Array[Input[EnvVar]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeMounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMounts")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: Input[js.Array[Input[Volume]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

