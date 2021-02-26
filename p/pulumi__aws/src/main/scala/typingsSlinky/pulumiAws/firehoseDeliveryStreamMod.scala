package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamS3Configuration
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
import typingsSlinky.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firehoseDeliveryStreamMod {
  
  @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream")
  @js.native
  class FirehoseDeliveryStream protected () extends CustomResource {
    /**
      * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirehoseDeliveryStreamArgs) = this()
    def this(name: String, args: FirehoseDeliveryStreamArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream
      */
    val arn: Output_[String] = js.native
    
    /**
      * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
      */
    val destination: Output_[String] = js.native
    
    val destinationId: Output_[String] = js.native
    
    /**
      * Configuration options if elasticsearch is the destination. More details are given below.
      */
    val elasticsearchConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamElasticsearchConfiguration]] = js.native
    
    /**
      * Enhanced configuration options for the s3 destination. More details are given below.
      */
    val extendedS3Configuration: Output_[js.UndefOr[FirehoseDeliveryStreamExtendedS3Configuration]] = js.native
    
    /**
      * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
      */
    val httpEndpointConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamHttpEndpointConfiguration]] = js.native
    
    /**
      * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
      */
    val kinesisSourceConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamKinesisSourceConfiguration]] = js.native
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: Output_[String] = js.native
    
    /**
      * Configuration options if redshift is the destination.
      * Using `redshiftConfiguration` requires the user to also specify a
      * `s3Configuration` block. More details are given below.
      */
    val redshiftConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamRedshiftConfiguration]] = js.native
    
    /**
      * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
      * is redshift). More details are given below.
      */
    val s3Configuration: Output_[js.UndefOr[FirehoseDeliveryStreamS3Configuration]] = js.native
    
    /**
      * Encrypt at rest options.
      * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
      */
    val serverSideEncryption: Output_[js.UndefOr[FirehoseDeliveryStreamServerSideEncryption]] = js.native
    
    /**
      * Configuration options if splunk is the destination. More details are given below.
      */
    val splunkConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamSplunkConfiguration]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Specifies the table version for the output data schema. Defaults to `LATEST`.
      */
    val versionId: Output_[String] = js.native
  }
  /* static members */
  object FirehoseDeliveryStream {
    
    /**
      * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID]): FirehoseDeliveryStream = js.native
    @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FirehoseDeliveryStream = js.native
    @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): FirehoseDeliveryStream = js.native
    @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): FirehoseDeliveryStream = js.native
    
    /**
      * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = js.native
  }
  
  @js.native
  trait FirehoseDeliveryStreamArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
      */
    val destination: Input[String] = js.native
    
    val destinationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration options if elasticsearch is the destination. More details are given below.
      */
    val elasticsearchConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
        ]
      ] = js.native
    
    /**
      * Enhanced configuration options for the s3 destination. More details are given below.
      */
    val extendedS3Configuration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
        ]
      ] = js.native
    
    /**
      * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
      */
    val httpEndpointConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
        ]
      ] = js.native
    
    /**
      * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
      */
    val kinesisSourceConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
        ]
      ] = js.native
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration options if redshift is the destination.
      * Using `redshiftConfiguration` requires the user to also specify a
      * `s3Configuration` block. More details are given below.
      */
    val redshiftConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
        ]
      ] = js.native
    
    /**
      * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
      * is redshift). More details are given below.
      */
    val s3Configuration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]
      ] = js.native
    
    /**
      * Encrypt at rest options.
      * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
      */
    val serverSideEncryption: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
        ]
      ] = js.native
    
    /**
      * Configuration options if splunk is the destination. More details are given below.
      */
    val splunkConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
        ]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Specifies the table version for the output data schema. Defaults to `LATEST`.
      */
    val versionId: js.UndefOr[Input[String]] = js.native
  }
  object FirehoseDeliveryStreamArgs {
    
    @scala.inline
    def apply(destination: Input[String]): FirehoseDeliveryStreamArgs = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseDeliveryStreamArgs]
    }
    
    @scala.inline
    implicit class FirehoseDeliveryStreamArgsMutableBuilder[Self <: FirehoseDeliveryStreamArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationId(value: Input[String]): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
      
      @scala.inline
      def setElasticsearchConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
            ]
      ): Self = StObject.set(x, "elasticsearchConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchConfigurationUndefined: Self = StObject.set(x, "elasticsearchConfiguration", js.undefined)
      
      @scala.inline
      def setExtendedS3Configuration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
            ]
      ): Self = StObject.set(x, "extendedS3Configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedS3ConfigurationUndefined: Self = StObject.set(x, "extendedS3Configuration", js.undefined)
      
      @scala.inline
      def setHttpEndpointConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
            ]
      ): Self = StObject.set(x, "httpEndpointConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEndpointConfigurationUndefined: Self = StObject.set(x, "httpEndpointConfiguration", js.undefined)
      
      @scala.inline
      def setKinesisSourceConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
            ]
      ): Self = StObject.set(x, "kinesisSourceConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisSourceConfigurationUndefined: Self = StObject.set(x, "kinesisSourceConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRedshiftConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
            ]
      ): Self = StObject.set(x, "redshiftConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedshiftConfigurationUndefined: Self = StObject.set(x, "redshiftConfiguration", js.undefined)
      
      @scala.inline
      def setS3Configuration(value: Input[typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
      
      @scala.inline
      def setServerSideEncryption(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
            ]
      ): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      @scala.inline
      def setSplunkConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
            ]
      ): Self = StObject.set(x, "splunkConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplunkConfigurationUndefined: Self = StObject.set(x, "splunkConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersionId(value: Input[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
  
  @js.native
  trait FirehoseDeliveryStreamState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
      */
    val destination: js.UndefOr[Input[String]] = js.native
    
    val destinationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration options if elasticsearch is the destination. More details are given below.
      */
    val elasticsearchConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
        ]
      ] = js.native
    
    /**
      * Enhanced configuration options for the s3 destination. More details are given below.
      */
    val extendedS3Configuration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
        ]
      ] = js.native
    
    /**
      * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
      */
    val httpEndpointConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
        ]
      ] = js.native
    
    /**
      * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
      */
    val kinesisSourceConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
        ]
      ] = js.native
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration options if redshift is the destination.
      * Using `redshiftConfiguration` requires the user to also specify a
      * `s3Configuration` block. More details are given below.
      */
    val redshiftConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
        ]
      ] = js.native
    
    /**
      * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
      * is redshift). More details are given below.
      */
    val s3Configuration: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]
      ] = js.native
    
    /**
      * Encrypt at rest options.
      * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
      */
    val serverSideEncryption: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
        ]
      ] = js.native
    
    /**
      * Configuration options if splunk is the destination. More details are given below.
      */
    val splunkConfiguration: js.UndefOr[
        Input[
          typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
        ]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Specifies the table version for the output data schema. Defaults to `LATEST`.
      */
    val versionId: js.UndefOr[Input[String]] = js.native
  }
  object FirehoseDeliveryStreamState {
    
    @scala.inline
    def apply(): FirehoseDeliveryStreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirehoseDeliveryStreamState]
    }
    
    @scala.inline
    implicit class FirehoseDeliveryStreamStateMutableBuilder[Self <: FirehoseDeliveryStreamState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationId(value: Input[String]): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setElasticsearchConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
            ]
      ): Self = StObject.set(x, "elasticsearchConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchConfigurationUndefined: Self = StObject.set(x, "elasticsearchConfiguration", js.undefined)
      
      @scala.inline
      def setExtendedS3Configuration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
            ]
      ): Self = StObject.set(x, "extendedS3Configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedS3ConfigurationUndefined: Self = StObject.set(x, "extendedS3Configuration", js.undefined)
      
      @scala.inline
      def setHttpEndpointConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
            ]
      ): Self = StObject.set(x, "httpEndpointConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEndpointConfigurationUndefined: Self = StObject.set(x, "httpEndpointConfiguration", js.undefined)
      
      @scala.inline
      def setKinesisSourceConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
            ]
      ): Self = StObject.set(x, "kinesisSourceConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisSourceConfigurationUndefined: Self = StObject.set(x, "kinesisSourceConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRedshiftConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
            ]
      ): Self = StObject.set(x, "redshiftConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedshiftConfigurationUndefined: Self = StObject.set(x, "redshiftConfiguration", js.undefined)
      
      @scala.inline
      def setS3Configuration(value: Input[typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
      
      @scala.inline
      def setServerSideEncryption(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
            ]
      ): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      @scala.inline
      def setSplunkConfiguration(
        value: Input[
              typingsSlinky.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
            ]
      ): Self = StObject.set(x, "splunkConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplunkConfigurationUndefined: Self = StObject.set(x, "splunkConfiguration", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersionId(value: Input[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
}
