package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.apigatewayMod.RestApi
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePathMappingMod {
  
  @JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping")
  @js.native
  class BasePathMapping protected () extends CustomResource {
    /**
      * Create a BasePathMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BasePathMappingArgs) = this()
    def this(name: String, args: BasePathMappingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
      */
    val basePath: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The already-registered domain name to connect the API to.
      */
    val domainName: Output_[String] = js.native
    
    /**
      * The id of the API to connect.
      */
    val restApi: Output_[String] = js.native
    
    /**
      * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
      */
    val stageName: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object BasePathMapping {
    
    /**
      * Get an existing BasePathMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping.get")
    @js.native
    def get(name: String, id: Input[ID]): BasePathMapping = js.native
    @JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BasePathMapping = js.native
    @JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: BasePathMappingState): BasePathMapping = js.native
    @JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping.get")
    @js.native
    def get(name: String, id: Input[ID], state: BasePathMappingState, opts: CustomResourceOptions): BasePathMapping = js.native
    
    /**
      * Returns true if the given object is an instance of BasePathMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/basePathMapping.BasePathMapping */ Boolean = js.native
  }
  
  @js.native
  trait BasePathMappingArgs extends StObject {
    
    /**
      * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
      */
    val basePath: js.UndefOr[Input[String]] = js.native
    
    /**
      * The already-registered domain name to connect the API to.
      */
    val domainName: Input[String] = js.native
    
    /**
      * The id of the API to connect.
      */
    val restApi: Input[String | RestApi] = js.native
    
    /**
      * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
      */
    val stageName: js.UndefOr[Input[String]] = js.native
  }
  object BasePathMappingArgs {
    
    @scala.inline
    def apply(domainName: Input[String], restApi: Input[String | RestApi]): BasePathMappingArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePathMappingArgs]
    }
    
    @scala.inline
    implicit class BasePathMappingArgsMutableBuilder[Self <: BasePathMappingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: Input[String]): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    }
  }
  
  @js.native
  trait BasePathMappingState extends StObject {
    
    /**
      * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
      */
    val basePath: js.UndefOr[Input[String]] = js.native
    
    /**
      * The already-registered domain name to connect the API to.
      */
    val domainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The id of the API to connect.
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.native
    
    /**
      * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
      */
    val stageName: js.UndefOr[Input[String]] = js.native
  }
  object BasePathMappingState {
    
    @scala.inline
    def apply(): BasePathMappingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePathMappingState]
    }
    
    @scala.inline
    implicit class BasePathMappingStateMutableBuilder[Self <: BasePathMappingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: Input[String]): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setStageName(value: Input[String]): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    }
  }
}
