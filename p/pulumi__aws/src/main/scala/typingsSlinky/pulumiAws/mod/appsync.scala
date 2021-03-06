package typingsSlinky.pulumiAws.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsync {
  
  @JSImport("@pulumi/aws", "appsync.ApiKey")
  @js.native
  class ApiKey protected ()
    extends typingsSlinky.pulumiAws.appsyncMod.ApiKey {
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
  object ApiKey {
    
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appsync.ApiKey.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    @JSImport("@pulumi/aws", "appsync.ApiKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    @JSImport("@pulumi/aws", "appsync.ApiKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApiKeyState): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    @JSImport("@pulumi/aws", "appsync.ApiKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.appsyncApiKeyMod.ApiKey = js.native
    
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appsync.ApiKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appsync.DataSource")
  @js.native
  class DataSource protected ()
    extends typingsSlinky.pulumiAws.appsyncMod.DataSource {
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
  object DataSource {
    
    /**
      * Get an existing DataSource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appsync.DataSource.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    @JSImport("@pulumi/aws", "appsync.DataSource.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    @JSImport("@pulumi/aws", "appsync.DataSource.get")
    @js.native
    def get(name: String, id: Input[ID], state: DataSourceState): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    @JSImport("@pulumi/aws", "appsync.DataSource.get")
    @js.native
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.dataSourceMod.DataSource = js.native
    
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appsync.DataSource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appsync.Function")
  @js.native
  class Function protected ()
    extends typingsSlinky.pulumiAws.appsyncMod.Function {
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
  object Function {
    
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appsync.Function.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.functionMod.Function = js.native
    @JSImport("@pulumi/aws", "appsync.Function.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.functionMod.Function = js.native
    @JSImport("@pulumi/aws", "appsync.Function.get")
    @js.native
    def get(name: String, id: Input[ID], state: FunctionState): typingsSlinky.pulumiAws.functionMod.Function = js.native
    @JSImport("@pulumi/aws", "appsync.Function.get")
    @js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.functionMod.Function = js.native
    
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appsync.Function.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appsync.GraphQLApi")
  @js.native
  class GraphQLApi protected ()
    extends typingsSlinky.pulumiAws.appsyncMod.GraphQLApi {
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
  object GraphQLApi {
    
    /**
      * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appsync.GraphQLApi.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    @JSImport("@pulumi/aws", "appsync.GraphQLApi.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    @JSImport("@pulumi/aws", "appsync.GraphQLApi.get")
    @js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    @JSImport("@pulumi/aws", "appsync.GraphQLApi.get")
    @js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.graphQLApiMod.GraphQLApi = js.native
    
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appsync.GraphQLApi.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appsync.Resolver")
  @js.native
  class Resolver protected ()
    extends typingsSlinky.pulumiAws.appsyncMod.Resolver {
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
    @JSImport("@pulumi/aws", "appsync.Resolver.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    @JSImport("@pulumi/aws", "appsync.Resolver.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    @JSImport("@pulumi/aws", "appsync.Resolver.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverState): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    @JSImport("@pulumi/aws", "appsync.Resolver.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resolverMod.Resolver = js.native
    
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appsync.Resolver.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
  }
}
