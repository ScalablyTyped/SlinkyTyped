package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainAdvancedSecurityOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainClusterConfig
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainCognitoOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainEbsOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainEncryptionAtRest
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainLogPublishingOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainNodeToNodeEncryption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainSnapshotOption
import typingsSlinky.pulumiAws.outputMod.elasticsearch.GetDomainVpcOption
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDomainMod {
  
  @JSImport("@pulumi/aws/elasticsearch/getDomain", "getDomain")
  @js.native
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] = js.native
  @JSImport("@pulumi/aws/elasticsearch/getDomain", "getDomain")
  @js.native
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] = js.native
  
  @js.native
  trait GetDomainArgs extends StObject {
    
    /**
      * Name of the domain.
      */
    val domainName: String = js.native
    
    /**
      * The tags assigned to the domain.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetDomainArgs {
    
    @scala.inline
    def apply(domainName: String): GetDomainArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDomainArgs]
    }
    
    @scala.inline
    implicit class GetDomainArgsMutableBuilder[Self <: GetDomainArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetDomainResult extends StObject {
    
    /**
      * The policy document attached to the domain.
      */
    val accessPolicies: String = js.native
    
    /**
      * Key-value string pairs to specify advanced configuration options.
      */
    val advancedOptions: StringDictionary[String] = js.native
    
    /**
      * Status of the Elasticsearch domain's advanced security options. The block consists of the following attributes:
      */
    val advancedSecurityOptions: js.Array[GetDomainAdvancedSecurityOption] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the domain.
      */
    val arn: String = js.native
    
    /**
      * Cluster configuration of the domain.
      */
    val clusterConfigs: js.Array[GetDomainClusterConfig] = js.native
    
    /**
      * Domain Amazon Cognito Authentication options for Kibana.
      */
    val cognitoOptions: js.Array[GetDomainCognitoOption] = js.native
    
    /**
      * Status of the creation of the domain.
      */
    val created: Boolean = js.native
    
    /**
      * Status of the deletion of the domain.
      */
    val deleted: Boolean = js.native
    
    /**
      * Unique identifier for the domain.
      */
    val domainId: String = js.native
    
    val domainName: String = js.native
    
    /**
      * EBS Options for the instances in the domain.
      */
    val ebsOptions: js.Array[GetDomainEbsOption] = js.native
    
    /**
      * ElasticSearch version for the domain.
      */
    val elasticsearchVersion: String = js.native
    
    /**
      * Domain encryption at rest related options.
      */
    val encryptionAtRests: js.Array[GetDomainEncryptionAtRest] = js.native
    
    /**
      * Domain-specific endpoint used to submit index, search, and data upload requests.
      */
    val endpoint: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Domain-specific endpoint used to access the Kibana application.
      */
    val kibanaEndpoint: String = js.native
    
    /**
      * Domain log publishing related options.
      */
    val logPublishingOptions: js.Array[GetDomainLogPublishingOption] = js.native
    
    /**
      * Domain in transit encryption related options.
      */
    val nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption] = js.native
    
    /**
      * Status of a configuration change in the domain.
      * * `snapshotOptions` – Domain snapshot related options.
      */
    val processing: Boolean = js.native
    
    val snapshotOptions: js.Array[GetDomainSnapshotOption] = js.native
    
    /**
      * The tags assigned to the domain.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * VPC Options for private Elasticsearch domains.
      */
    val vpcOptions: js.Array[GetDomainVpcOption] = js.native
  }
  object GetDomainResult {
    
    @scala.inline
    def apply(
      accessPolicies: String,
      advancedOptions: StringDictionary[String],
      advancedSecurityOptions: js.Array[GetDomainAdvancedSecurityOption],
      arn: String,
      clusterConfigs: js.Array[GetDomainClusterConfig],
      cognitoOptions: js.Array[GetDomainCognitoOption],
      created: Boolean,
      deleted: Boolean,
      domainId: String,
      domainName: String,
      ebsOptions: js.Array[GetDomainEbsOption],
      elasticsearchVersion: String,
      encryptionAtRests: js.Array[GetDomainEncryptionAtRest],
      endpoint: String,
      id: String,
      kibanaEndpoint: String,
      logPublishingOptions: js.Array[GetDomainLogPublishingOption],
      nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption],
      processing: Boolean,
      snapshotOptions: js.Array[GetDomainSnapshotOption],
      tags: StringDictionary[String],
      vpcOptions: js.Array[GetDomainVpcOption]
    ): GetDomainResult = {
      val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], advancedOptions = advancedOptions.asInstanceOf[js.Any], advancedSecurityOptions = advancedSecurityOptions.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], clusterConfigs = clusterConfigs.asInstanceOf[js.Any], cognitoOptions = cognitoOptions.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], ebsOptions = ebsOptions.asInstanceOf[js.Any], elasticsearchVersion = elasticsearchVersion.asInstanceOf[js.Any], encryptionAtRests = encryptionAtRests.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kibanaEndpoint = kibanaEndpoint.asInstanceOf[js.Any], logPublishingOptions = logPublishingOptions.asInstanceOf[js.Any], nodeToNodeEncryptions = nodeToNodeEncryptions.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], snapshotOptions = snapshotOptions.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcOptions = vpcOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDomainResult]
    }
    
    @scala.inline
    implicit class GetDomainResultMutableBuilder[Self <: GetDomainResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicies(value: String): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedOptions(value: StringDictionary[String]): Self = StObject.set(x, "advancedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedSecurityOptions(value: js.Array[GetDomainAdvancedSecurityOption]): Self = StObject.set(x, "advancedSecurityOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedSecurityOptionsVarargs(value: GetDomainAdvancedSecurityOption*): Self = StObject.set(x, "advancedSecurityOptions", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterConfigs(value: js.Array[GetDomainClusterConfig]): Self = StObject.set(x, "clusterConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterConfigsVarargs(value: GetDomainClusterConfig*): Self = StObject.set(x, "clusterConfigs", js.Array(value :_*))
      
      @scala.inline
      def setCognitoOptions(value: js.Array[GetDomainCognitoOption]): Self = StObject.set(x, "cognitoOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoOptionsVarargs(value: GetDomainCognitoOption*): Self = StObject.set(x, "cognitoOptions", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptions(value: js.Array[GetDomainEbsOption]): Self = StObject.set(x, "ebsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptionsVarargs(value: GetDomainEbsOption*): Self = StObject.set(x, "ebsOptions", js.Array(value :_*))
      
      @scala.inline
      def setElasticsearchVersion(value: String): Self = StObject.set(x, "elasticsearchVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionAtRests(value: js.Array[GetDomainEncryptionAtRest]): Self = StObject.set(x, "encryptionAtRests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionAtRestsVarargs(value: GetDomainEncryptionAtRest*): Self = StObject.set(x, "encryptionAtRests", js.Array(value :_*))
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKibanaEndpoint(value: String): Self = StObject.set(x, "kibanaEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPublishingOptions(value: js.Array[GetDomainLogPublishingOption]): Self = StObject.set(x, "logPublishingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPublishingOptionsVarargs(value: GetDomainLogPublishingOption*): Self = StObject.set(x, "logPublishingOptions", js.Array(value :_*))
      
      @scala.inline
      def setNodeToNodeEncryptions(value: js.Array[GetDomainNodeToNodeEncryption]): Self = StObject.set(x, "nodeToNodeEncryptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeToNodeEncryptionsVarargs(value: GetDomainNodeToNodeEncryption*): Self = StObject.set(x, "nodeToNodeEncryptions", js.Array(value :_*))
      
      @scala.inline
      def setProcessing(value: Boolean): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotOptions(value: js.Array[GetDomainSnapshotOption]): Self = StObject.set(x, "snapshotOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotOptionsVarargs(value: GetDomainSnapshotOption*): Self = StObject.set(x, "snapshotOptions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOptions(value: js.Array[GetDomainVpcOption]): Self = StObject.set(x, "vpcOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOptionsVarargs(value: GetDomainVpcOption*): Self = StObject.set(x, "vpcOptions", js.Array(value :_*))
    }
  }
}
