package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.appsyncApiKeyMod.ApiKeyArgs
import typingsSlinky.atPulumiAws.appsyncApiKeyMod.ApiKeyState
import typingsSlinky.atPulumiAws.appsyncDataSourceMod.DataSourceArgs
import typingsSlinky.atPulumiAws.appsyncDataSourceMod.DataSourceState
import typingsSlinky.atPulumiAws.appsyncFunctionMod.FunctionArgs
import typingsSlinky.atPulumiAws.appsyncFunctionMod.FunctionState
import typingsSlinky.atPulumiAws.appsyncGraphQLApiMod.GraphQLApiArgs
import typingsSlinky.atPulumiAws.appsyncGraphQLApiMod.GraphQLApiState
import typingsSlinky.atPulumiAws.appsyncResolverMod.ResolverArgs
import typingsSlinky.atPulumiAws.appsyncResolverMod.ResolverState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync", JSImport.Namespace)
@js.native
object appsyncMod extends js.Object {
  @js.native
  class ApiKey protected ()
    extends typingsSlinky.atPulumiAws.appsyncApiKeyMod.ApiKey {
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
  
  @js.native
  class DataSource protected ()
    extends typingsSlinky.atPulumiAws.appsyncDataSourceMod.DataSource {
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
  
  @js.native
  class Function protected ()
    extends typingsSlinky.atPulumiAws.appsyncFunctionMod.Function {
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
  
  @js.native
  class GraphQLApi protected ()
    extends typingsSlinky.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi {
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
  
  @js.native
  class Resolver protected ()
    extends typingsSlinky.atPulumiAws.appsyncResolverMod.Resolver {
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
  object ApiKey extends js.Object {
    /**
      * Get an existing ApiKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState): typingsSlinky.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
    def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
    /**
      * Returns true if the given object is an instance of ApiKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState): typingsSlinky.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.appsyncFunctionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState): typingsSlinky.atPulumiAws.appsyncFunctionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.appsyncFunctionMod.Function = js.native
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState): typingsSlinky.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi = js.native
    def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.appsyncGraphQLApiMod.GraphQLApi = js.native
    /**
      * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.appsyncResolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState): typingsSlinky.atPulumiAws.appsyncResolverMod.Resolver = js.native
    def get(name: String, id: Input[ID], state: ResolverState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.appsyncResolverMod.Resolver = js.native
    /**
      * Returns true if the given object is an instance of Resolver.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/resolver.Resolver */ Boolean = js.native
  }
  
}

