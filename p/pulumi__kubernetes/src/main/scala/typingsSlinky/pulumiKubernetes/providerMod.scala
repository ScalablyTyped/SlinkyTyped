package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiPulumi.mod.ProviderResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@pulumi/kubernetes/provider", "Provider")
  @js.native
  class Provider protected () extends ProviderResource {
    /**
      * Create a Provider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ProviderArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
  }
  /* static members */
  object Provider {
    
    /**
      * Returns true if the given object is an instance of Provider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/provider", "Provider.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/provider.Provider */ Boolean = js.native
  }
  
  @js.native
  trait ProviderArgs extends StObject {
    
    /**
      * If present, the name of the kubeconfig cluster to use.
      */
    val cluster: js.UndefOr[Input[String]] = js.native
    
    /**
      * If present, the name of the kubeconfig context to use.
      */
    val context: js.UndefOr[Input[String]] = js.native
    
    /**
      * BETA FEATURE - If present and set to true, enable server-side diff calculations.
      * This feature is in developer preview, and is disabled by default.
      *
      * This config can be specified in the following ways, using this precedence:
      * 1. This `enableDryRun` parameter.
      * 2. The `PULUMI_K8S_ENABLE_DRY_RUN` environment variable.
      */
    val enableDryRun: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The contents of a kubeconfig file or the path to a kubeconfig file. If this is set, this config will be used instead of $KUBECONFIG.
      */
    val kubeconfig: js.UndefOr[Input[String]] = js.native
    
    /**
      * If present, the default namespace to use. This flag is ignored for cluster-scoped resources.
      *
      * A namespace can be specified in multiple places, and the precedence is as follows:
      * 1. `.metadata.namespace` set on the resource.
      * 2. This `namespace` parameter.
      * 3. `namespace` set for the active context in the kubeconfig.
      */
    val namespace: js.UndefOr[Input[String]] = js.native
    
    /**
      * BETA FEATURE - If present, render resource manifests to this directory. In this mode, resources will not
      * be created on a Kubernetes cluster, but the rendered manifests will be kept in sync with changes
      * to the Pulumi program. This feature is in developer preview, and is disabled by default.
      *
      * Note that some computed Outputs such as status fields will not be populated
      * since the resources are not created on a Kubernetes cluster. These Output values will remain undefined,
      * and may result in an error if they are referenced by other resources. Also note that any secret values
      * used in these resources will be rendered in plaintext to the resulting YAML.
      */
    val renderYamlToDirectory: js.UndefOr[Input[String]] = js.native
    
    /**
      * If present and set to true, suppress apiVersion deprecation warnings from the CLI.
      *
      * This config can be specified in the following ways, using this precedence:
      * 1. This `suppressDeprecationWarnings` parameter.
      * 2. The `PULUMI_K8S_SUPPRESS_DEPRECATION_WARNINGS` environment variable.
      */
    val suppressDeprecationWarnings: js.UndefOr[Input[Boolean]] = js.native
  }
  object ProviderArgs {
    
    @scala.inline
    def apply(): ProviderArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderArgs]
    }
    
    @scala.inline
    implicit class ProviderArgsMutableBuilder[Self <: ProviderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCluster(value: Input[String]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      @scala.inline
      def setContext(value: Input[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEnableDryRun(value: Input[Boolean]): Self = StObject.set(x, "enableDryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDryRunUndefined: Self = StObject.set(x, "enableDryRun", js.undefined)
      
      @scala.inline
      def setKubeconfig(value: Input[String]): Self = StObject.set(x, "kubeconfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKubeconfigUndefined: Self = StObject.set(x, "kubeconfig", js.undefined)
      
      @scala.inline
      def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setRenderYamlToDirectory(value: Input[String]): Self = StObject.set(x, "renderYamlToDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderYamlToDirectoryUndefined: Self = StObject.set(x, "renderYamlToDirectory", js.undefined)
      
      @scala.inline
      def setSuppressDeprecationWarnings(value: Input[Boolean]): Self = StObject.set(x, "suppressDeprecationWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressDeprecationWarningsUndefined: Self = StObject.set(x, "suppressDeprecationWarnings", js.undefined)
    }
  }
}
