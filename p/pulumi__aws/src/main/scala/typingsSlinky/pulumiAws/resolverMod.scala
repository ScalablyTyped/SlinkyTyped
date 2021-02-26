package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.appsync.ResolverCachingConfig
import typingsSlinky.pulumiAws.outputMod.appsync.ResolverPipelineConfig
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("@pulumi/aws/appsync/resolver", "Resolver")
  @js.native
  class Resolver protected () extends CustomResource {
    /**
      * Create a Resolver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverArgs) = this()
    def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API ID for the GraphQL API.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The ARN
      */
    val arn: Output_[String] = js.native
    
    /**
      * The CachingConfig.
      */
    val cachingConfig: Output_[js.UndefOr[ResolverCachingConfig]] = js.native
    
    /**
      * The DataSource name.
      */
    val dataSource: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The field name from the schema defined in the GraphQL API.
      */
    val field: Output_[String] = js.native
    
    /**
      * The resolver type. Valid values are `UNIT` and `PIPELINE`.
      */
    val kind: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The PipelineConfig.
      */
    val pipelineConfig: Output_[js.UndefOr[ResolverPipelineConfig]] = js.native
    
    /**
      * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
      */
    val requestTemplate: Output_[String] = js.native
    
    /**
      * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
      */
    val responseTemplate: Output_[String] = js.native
    
    /**
      * The type name from the schema defined in the GraphQL API.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Resolver {
    
    /**
      * Get an existing Resolver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/appsync/resolver", "Resolver.get")
    @js.native
    def get(name: String, id: Input[ID]): Resolver = js.native
    @JSImport("@pulumi/aws/appsync/resolver", "Resolver.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Resolver = js.native
    @JSImport("@pulumi/aws/appsync/resolver", "Resolver.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverState): Resolver = js.native
    @JSImport("@pulumi/aws/appsync/resolver", "Resolver.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): Resolver = js.native
    
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appsync/resolver", "Resolver.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
  }
  
  @js.native
  trait ResolverArgs extends StObject {
    
    /**
      * The API ID for the GraphQL API.
      */
    val apiId: Input[String] = js.native
    
    /**
      * The CachingConfig.
      */
    val cachingConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverCachingConfig]] = js.native
    
    /**
      * The DataSource name.
      */
    val dataSource: js.UndefOr[Input[String]] = js.native
    
    /**
      * The field name from the schema defined in the GraphQL API.
      */
    val field: Input[String] = js.native
    
    /**
      * The resolver type. Valid values are `UNIT` and `PIPELINE`.
      */
    val kind: js.UndefOr[Input[String]] = js.native
    
    /**
      * The PipelineConfig.
      */
    val pipelineConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverPipelineConfig]] = js.native
    
    /**
      * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
      */
    val requestTemplate: Input[String] = js.native
    
    /**
      * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
      */
    val responseTemplate: Input[String] = js.native
    
    /**
      * The type name from the schema defined in the GraphQL API.
      */
    val `type`: Input[String] = js.native
  }
  object ResolverArgs {
    
    @scala.inline
    def apply(
      apiId: Input[String],
      field: Input[String],
      requestTemplate: Input[String],
      responseTemplate: Input[String],
      `type`: Input[String]
    ): ResolverArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], requestTemplate = requestTemplate.asInstanceOf[js.Any], responseTemplate = responseTemplate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverArgs]
    }
    
    @scala.inline
    implicit class ResolverArgsMutableBuilder[Self <: ResolverArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverCachingConfig]): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
      
      @scala.inline
      def setDataSource(value: Input[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setPipelineConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverPipelineConfig]): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
      
      @scala.inline
      def setRequestTemplate(value: Input[String]): Self = StObject.set(x, "requestTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplate(value: Input[String]): Self = StObject.set(x, "responseTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolverState extends StObject {
    
    /**
      * The API ID for the GraphQL API.
      */
    val apiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The CachingConfig.
      */
    val cachingConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverCachingConfig]] = js.native
    
    /**
      * The DataSource name.
      */
    val dataSource: js.UndefOr[Input[String]] = js.native
    
    /**
      * The field name from the schema defined in the GraphQL API.
      */
    val field: js.UndefOr[Input[String]] = js.native
    
    /**
      * The resolver type. Valid values are `UNIT` and `PIPELINE`.
      */
    val kind: js.UndefOr[Input[String]] = js.native
    
    /**
      * The PipelineConfig.
      */
    val pipelineConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverPipelineConfig]] = js.native
    
    /**
      * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver.
      */
    val requestTemplate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver.
      */
    val responseTemplate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type name from the schema defined in the GraphQL API.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object ResolverState {
    
    @scala.inline
    def apply(): ResolverState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverState]
    }
    
    @scala.inline
    implicit class ResolverStateMutableBuilder[Self <: ResolverState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCachingConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverCachingConfig]): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
      
      @scala.inline
      def setDataSource(value: Input[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setPipelineConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.ResolverPipelineConfig]): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
      
      @scala.inline
      def setRequestTemplate(value: Input[String]): Self = StObject.set(x, "requestTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTemplateUndefined: Self = StObject.set(x, "requestTemplate", js.undefined)
      
      @scala.inline
      def setResponseTemplate(value: Input[String]): Self = StObject.set(x, "responseTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTemplateUndefined: Self = StObject.set(x, "responseTemplate", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
