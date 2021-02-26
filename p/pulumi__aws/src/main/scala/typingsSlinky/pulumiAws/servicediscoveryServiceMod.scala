package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.servicediscovery.ServiceDnsConfig
import typingsSlinky.pulumiAws.outputMod.servicediscovery.ServiceHealthCheckConfig
import typingsSlinky.pulumiAws.outputMod.servicediscovery.ServiceHealthCheckCustomConfig
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicediscoveryServiceMod {
  
  @JSImport("@pulumi/aws/servicediscovery/service", "Service")
  @js.native
  class Service protected () extends CustomResource {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the service.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of the service.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
      */
    val dnsConfig: Output_[js.UndefOr[ServiceDnsConfig]] = js.native
    
    /**
      * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
      */
    val healthCheckConfig: Output_[js.UndefOr[ServiceHealthCheckConfig]] = js.native
    
    /**
      * A complex type that contains settings for ECS managed health checks.
      */
    val healthCheckCustomConfig: Output_[js.UndefOr[ServiceHealthCheckCustomConfig]] = js.native
    
    /**
      * The name of the service.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of the namespace to use for DNS configuration.
      */
    val namespaceId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the service.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Service {
    
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicediscovery/service", "Service.get")
    @js.native
    def get(name: String, id: Input[ID]): Service = js.native
    @JSImport("@pulumi/aws/servicediscovery/service", "Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Service = js.native
    @JSImport("@pulumi/aws/servicediscovery/service", "Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceState): Service = js.native
    @JSImport("@pulumi/aws/servicediscovery/service", "Service.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): Service = js.native
    
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicediscovery/service", "Service.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/service.Service */ Boolean = js.native
  }
  
  @js.native
  trait ServiceArgs extends StObject {
    
    /**
      * The description of the service.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
      */
    val dnsConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig]] = js.native
    
    /**
      * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
      */
    val healthCheckConfig: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig]
      ] = js.native
    
    /**
      * A complex type that contains settings for ECS managed health checks.
      */
    val healthCheckCustomConfig: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig]
      ] = js.native
    
    /**
      * The name of the service.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the namespace to use for DNS configuration.
      */
    val namespaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the service.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ServiceArgs {
    
    @scala.inline
    def apply(): ServiceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceArgs]
    }
    
    @scala.inline
    implicit class ServiceArgsMutableBuilder[Self <: ServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDnsConfig(value: Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig]): Self = StObject.set(x, "dnsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsConfigUndefined: Self = StObject.set(x, "dnsConfig", js.undefined)
      
      @scala.inline
      def setHealthCheckConfig(value: Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig]): Self = StObject.set(x, "healthCheckConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckConfigUndefined: Self = StObject.set(x, "healthCheckConfig", js.undefined)
      
      @scala.inline
      def setHealthCheckCustomConfig(value: Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig]): Self = StObject.set(x, "healthCheckCustomConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckCustomConfigUndefined: Self = StObject.set(x, "healthCheckCustomConfig", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNamespaceId(value: Input[String]): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ServiceState extends StObject {
    
    /**
      * The ARN of the service.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the service.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
      */
    val dnsConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig]] = js.native
    
    /**
      * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
      */
    val healthCheckConfig: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig]
      ] = js.native
    
    /**
      * A complex type that contains settings for ECS managed health checks.
      */
    val healthCheckCustomConfig: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig]
      ] = js.native
    
    /**
      * The name of the service.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the namespace to use for DNS configuration.
      */
    val namespaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the service.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ServiceState {
    
    @scala.inline
    def apply(): ServiceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceState]
    }
    
    @scala.inline
    implicit class ServiceStateMutableBuilder[Self <: ServiceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDnsConfig(value: Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig]): Self = StObject.set(x, "dnsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsConfigUndefined: Self = StObject.set(x, "dnsConfig", js.undefined)
      
      @scala.inline
      def setHealthCheckConfig(value: Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig]): Self = StObject.set(x, "healthCheckConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckConfigUndefined: Self = StObject.set(x, "healthCheckConfig", js.undefined)
      
      @scala.inline
      def setHealthCheckCustomConfig(value: Input[typingsSlinky.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig]): Self = StObject.set(x, "healthCheckCustomConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckCustomConfigUndefined: Self = StObject.set(x, "healthCheckCustomConfig", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNamespaceId(value: Input[String]): Self = StObject.set(x, "namespaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceIdUndefined: Self = StObject.set(x, "namespaceId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
