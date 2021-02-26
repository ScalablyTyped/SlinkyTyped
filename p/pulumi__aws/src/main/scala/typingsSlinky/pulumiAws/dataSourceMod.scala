package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.appsync.DataSourceDynamodbConfig
import typingsSlinky.pulumiAws.outputMod.appsync.DataSourceElasticsearchConfig
import typingsSlinky.pulumiAws.outputMod.appsync.DataSourceHttpConfig
import typingsSlinky.pulumiAws.outputMod.appsync.DataSourceLambdaConfig
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceMod {
  
  @JSImport("@pulumi/aws/appsync/dataSource", "DataSource")
  @js.native
  class DataSource protected () extends CustomResource {
    /**
      * Create a DataSource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataSourceArgs) = this()
    def this(name: String, args: DataSourceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API ID for the GraphQL API for the DataSource.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The ARN
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the DataSource.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * DynamoDB settings. See below
      */
    val dynamodbConfig: Output_[js.UndefOr[DataSourceDynamodbConfig]] = js.native
    
    /**
      * Amazon Elasticsearch settings. See below
      */
    val elasticsearchConfig: Output_[js.UndefOr[DataSourceElasticsearchConfig]] = js.native
    
    /**
      * HTTP settings. See below
      */
    val httpConfig: Output_[js.UndefOr[DataSourceHttpConfig]] = js.native
    
    /**
      * AWS Lambda settings. See below
      */
    val lambdaConfig: Output_[js.UndefOr[DataSourceLambdaConfig]] = js.native
    
    /**
      * A user-supplied name for the DataSource.
      */
    val name: Output_[String] = js.native
    
    /**
      * The IAM service role ARN for the data source.
      */
    val serviceRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
      */
    val `type`: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/appsync/dataSource", "DataSource.get")
    @js.native
    def get(name: String, id: Input[ID]): DataSource = js.native
    @JSImport("@pulumi/aws/appsync/dataSource", "DataSource.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DataSource = js.native
    @JSImport("@pulumi/aws/appsync/dataSource", "DataSource.get")
    @js.native
    def get(name: String, id: Input[ID], state: DataSourceState): DataSource = js.native
    @JSImport("@pulumi/aws/appsync/dataSource", "DataSource.get")
    @js.native
    def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): DataSource = js.native
    
    /**
      * Returns true if the given object is an instance of DataSource.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/appsync/dataSource", "DataSource.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
  }
  
  @js.native
  trait DataSourceArgs extends StObject {
    
    /**
      * The API ID for the GraphQL API for the DataSource.
      */
    val apiId: Input[String] = js.native
    
    /**
      * A description of the DataSource.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * DynamoDB settings. See below
      */
    val dynamodbConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]] = js.native
    
    /**
      * Amazon Elasticsearch settings. See below
      */
    val elasticsearchConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]] = js.native
    
    /**
      * HTTP settings. See below
      */
    val httpConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceHttpConfig]] = js.native
    
    /**
      * AWS Lambda settings. See below
      */
    val lambdaConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]] = js.native
    
    /**
      * A user-supplied name for the DataSource.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM service role ARN for the data source.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
      */
    val `type`: Input[String] = js.native
  }
  object DataSourceArgs {
    
    @scala.inline
    def apply(apiId: Input[String], `type`: Input[String]): DataSourceArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceArgs]
    }
    
    @scala.inline
    implicit class DataSourceArgsMutableBuilder[Self <: DataSourceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDynamodbConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
      
      @scala.inline
      def setElasticsearchConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
      
      @scala.inline
      def setHttpConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceHttpConfig]): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      @scala.inline
      def setLambdaConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataSourceState extends StObject {
    
    /**
      * The API ID for the GraphQL API for the DataSource.
      */
    val apiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of the DataSource.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * DynamoDB settings. See below
      */
    val dynamodbConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]] = js.native
    
    /**
      * Amazon Elasticsearch settings. See below
      */
    val elasticsearchConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]] = js.native
    
    /**
      * HTTP settings. See below
      */
    val httpConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceHttpConfig]] = js.native
    
    /**
      * AWS Lambda settings. See below
      */
    val lambdaConfig: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]] = js.native
    
    /**
      * A user-supplied name for the DataSource.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM service role ARN for the data source.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object DataSourceState {
    
    @scala.inline
    def apply(): DataSourceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceState]
    }
    
    @scala.inline
    implicit class DataSourceStateMutableBuilder[Self <: DataSourceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDynamodbConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig]): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
      
      @scala.inline
      def setElasticsearchConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig]): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
      
      @scala.inline
      def setHttpConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceHttpConfig]): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      @scala.inline
      def setLambdaConfig(value: Input[typingsSlinky.pulumiAws.inputMod.appsync.DataSourceLambdaConfig]): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
