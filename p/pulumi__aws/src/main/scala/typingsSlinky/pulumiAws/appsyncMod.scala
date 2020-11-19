package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKeyArgs
import typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKeyState
import typingsSlinky.pulumiAws.dataSourceMod.DataSourceArgs
import typingsSlinky.pulumiAws.dataSourceMod.DataSourceState
import typingsSlinky.pulumiAws.functionMod.FunctionArgs
import typingsSlinky.pulumiAws.functionMod.FunctionState
import typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApiArgs
import typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApiState
import typingsSlinky.pulumiAws.resolverMod.ResolverArgs
import typingsSlinky.pulumiAws.resolverMod.ResolverState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appsync", JSImport.Namespace)
@js.native
object appsyncMod extends js.Object {
  
  @js.native
  class ApiKey protected ()
    extends typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey {
    /**
      * Create a ApiKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiKeyArgs) = this()
    def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object ApiKey extends js.Object {
    
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
  }
  
  @js.native
  class DataSource protected ()
    extends typingsSlinky.pulumiAws.dataSourceMod.DataSource {
    /**
      * Create a DataSource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataSourceArgs) = this()
    def this(name: String, args: DataSourceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object DataSource extends js.Object {
    
    /**
      * Get an existing DataSource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
  }
  
  @js.native
  class Function protected ()
    extends typingsSlinky.pulumiAws.functionMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Function extends js.Object {
    
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.functionMod.Function = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.functionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState): typingsSlinky.pulumiAws.functionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.functionMod.Function = js.native
    
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
  }
  
  @js.native
  class GraphQLApi protected ()
    extends typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi {
    /**
      * Create a GraphQLApi resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GraphQLApiArgs) = this()
    def this(name: String, args: GraphQLApiArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object GraphQLApi extends js.Object {
    
    /**
      * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
  }
  
  @js.native
  class Resolver protected ()
    extends typingsSlinky.pulumiAws.resolverMod.Resolver {
    /**
      * Create a Resolver resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverArgs) = this()
    def this(name: String, args: ResolverArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Resolver extends js.Object {
    
    /**
      * Get an existing Resolver resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
  }
}
