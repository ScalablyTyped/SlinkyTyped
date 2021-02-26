package typingsSlinky.pulumiKubernetes.outputMod

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EnvFromSource
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EnvVar
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.Volume
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.VolumeMount
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  object v1alpha1 {
    
    /**
      * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
      */
    @js.native
    trait PodPreset extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: settingsDotk8sDotioSlashv1alpha1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PodPreset = js.native
      
      var metadata: ObjectMeta = js.native
      
      var spec: PodPresetSpec = js.native
    }
    object PodPreset {
      
      @scala.inline
      def apply(
        apiVersion: settingsDotk8sDotioSlashv1alpha1,
        kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PodPreset,
        metadata: ObjectMeta,
        spec: PodPresetSpec
      ): PodPreset = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[PodPreset]
      }
      
      @scala.inline
      implicit class PodPresetMutableBuilder[Self <: PodPreset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: settingsDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PodPreset): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: PodPresetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * PodPresetSpec is a description of a pod preset.
      */
    @js.native
    trait PodPresetSpec extends StObject {
      
      /**
        * Env defines the collection of EnvVar to inject into containers.
        */
      var env: js.Array[EnvVar] = js.native
      
      /**
        * EnvFrom defines the collection of EnvFromSource to inject into containers.
        */
      var envFrom: js.Array[EnvFromSource] = js.native
      
      /**
        * Selector is a label query over a set of resources, in this case pods. Required.
        */
      var selector: LabelSelector = js.native
      
      /**
        * VolumeMounts defines the collection of VolumeMount to inject into containers.
        */
      var volumeMounts: js.Array[VolumeMount] = js.native
      
      /**
        * Volumes defines the collection of Volume to inject into the pod.
        */
      var volumes: js.Array[Volume] = js.native
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
      implicit class PodPresetSpecMutableBuilder[Self <: PodPresetSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnv(value: js.Array[EnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvFrom(value: js.Array[EnvFromSource]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvFromVarargs(value: EnvFromSource*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
        
        @scala.inline
        def setEnvVarargs(value: EnvVar*): Self = StObject.set(x, "env", js.Array(value :_*))
        
        @scala.inline
        def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolumeMounts(value: js.Array[VolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolumeMountsVarargs(value: VolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
        
        @scala.inline
        def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
      }
    }
  }
}
