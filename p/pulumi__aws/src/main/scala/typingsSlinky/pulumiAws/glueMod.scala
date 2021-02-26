package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabaseArgs
import typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabaseState
import typingsSlinky.pulumiAws.catalogTableMod.CatalogTableArgs
import typingsSlinky.pulumiAws.catalogTableMod.CatalogTableState
import typingsSlinky.pulumiAws.classifierMod.ClassifierArgs
import typingsSlinky.pulumiAws.classifierMod.ClassifierState
import typingsSlinky.pulumiAws.crawlerMod.CrawlerArgs
import typingsSlinky.pulumiAws.crawlerMod.CrawlerState
import typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettingsArgs
import typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettingsState
import typingsSlinky.pulumiAws.devEndpointMod.DevEndpointArgs
import typingsSlinky.pulumiAws.devEndpointMod.DevEndpointState
import typingsSlinky.pulumiAws.getScriptMod.GetScriptArgs
import typingsSlinky.pulumiAws.getScriptMod.GetScriptResult
import typingsSlinky.pulumiAws.glueConnectionMod.ConnectionArgs
import typingsSlinky.pulumiAws.glueConnectionMod.ConnectionState
import typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfigurationArgs
import typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfigurationState
import typingsSlinky.pulumiAws.glueTriggerMod.TriggerArgs
import typingsSlinky.pulumiAws.glueTriggerMod.TriggerState
import typingsSlinky.pulumiAws.jobMod.JobArgs
import typingsSlinky.pulumiAws.jobMod.JobState
import typingsSlinky.pulumiAws.mltransformMod.MLTransformArgs
import typingsSlinky.pulumiAws.mltransformMod.MLTransformState
import typingsSlinky.pulumiAws.partitionMod.PartitionArgs
import typingsSlinky.pulumiAws.partitionMod.PartitionState
import typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicyArgs
import typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicyState
import typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunctionArgs
import typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunctionState
import typingsSlinky.pulumiAws.workflowMod.WorkflowArgs
import typingsSlinky.pulumiAws.workflowMod.WorkflowState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glueMod {
  
  @JSImport("@pulumi/aws/glue", "CatalogDatabase")
  @js.native
  class CatalogDatabase protected ()
    extends typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabase {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CatalogDatabaseArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CatalogDatabase {
    
    /**
      * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    @JSImport("@pulumi/aws/glue", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    @JSImport("@pulumi/aws/glue", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState): typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    @JSImport("@pulumi/aws/glue", "CatalogDatabase.get")
    @js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.catalogDatabaseMod.CatalogDatabase = js.native
    
    /**
      * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "CatalogDatabase.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "CatalogTable")
  @js.native
  class CatalogTable protected ()
    extends typingsSlinky.pulumiAws.catalogTableMod.CatalogTable {
    /**
      * Create a CatalogTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CatalogTableArgs) = this()
    def this(name: String, args: CatalogTableArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CatalogTable {
    
    /**
      * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "CatalogTable.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.catalogTableMod.CatalogTable = js.native
    @JSImport("@pulumi/aws/glue", "CatalogTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.catalogTableMod.CatalogTable = js.native
    @JSImport("@pulumi/aws/glue", "CatalogTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: CatalogTableState): typingsSlinky.pulumiAws.catalogTableMod.CatalogTable = js.native
    @JSImport("@pulumi/aws/glue", "CatalogTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.catalogTableMod.CatalogTable = js.native
    
    /**
      * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "CatalogTable.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Classifier")
  @js.native
  class Classifier protected ()
    extends typingsSlinky.pulumiAws.classifierMod.Classifier {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClassifierArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Classifier {
    
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.classifierMod.Classifier = js.native
    @JSImport("@pulumi/aws/glue", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.classifierMod.Classifier = js.native
    @JSImport("@pulumi/aws/glue", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClassifierState): typingsSlinky.pulumiAws.classifierMod.Classifier = js.native
    @JSImport("@pulumi/aws/glue", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.classifierMod.Classifier = js.native
    
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Classifier.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Connection")
  @js.native
  class Connection protected ()
    extends typingsSlinky.pulumiAws.glueConnectionMod.Connection {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Connection {
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.glueConnectionMod.Connection = js.native
    @JSImport("@pulumi/aws/glue", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.glueConnectionMod.Connection = js.native
    @JSImport("@pulumi/aws/glue", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState): typingsSlinky.pulumiAws.glueConnectionMod.Connection = js.native
    @JSImport("@pulumi/aws/glue", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.glueConnectionMod.Connection = js.native
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Connection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Crawler")
  @js.native
  class Crawler protected ()
    extends typingsSlinky.pulumiAws.crawlerMod.Crawler {
    /**
      * Create a Crawler resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CrawlerArgs) = this()
    def this(name: String, args: CrawlerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Crawler {
    
    /**
      * Get an existing Crawler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Crawler.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.crawlerMod.Crawler = js.native
    @JSImport("@pulumi/aws/glue", "Crawler.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.crawlerMod.Crawler = js.native
    @JSImport("@pulumi/aws/glue", "Crawler.get")
    @js.native
    def get(name: String, id: Input[ID], state: CrawlerState): typingsSlinky.pulumiAws.crawlerMod.Crawler = js.native
    @JSImport("@pulumi/aws/glue", "Crawler.get")
    @js.native
    def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.crawlerMod.Crawler = js.native
    
    /**
      * Returns true if the given object is an instance of Crawler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Crawler.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings")
  @js.native
  class DataCatalogEncryptionSettings protected ()
    extends typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings {
    /**
      * Create a DataCatalogEncryptionSettings resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DataCatalogEncryptionSettingsArgs) = this()
    def this(name: String, args: DataCatalogEncryptionSettingsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DataCatalogEncryptionSettings {
    
    /**
      * Get an existing DataCatalogEncryptionSettings resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = js.native
    @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = js.native
    @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings.get")
    @js.native
    def get(name: String, id: Input[ID], state: DataCatalogEncryptionSettingsState): typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = js.native
    @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: DataCatalogEncryptionSettingsState,
      opts: CustomResourceOptions
    ): typingsSlinky.pulumiAws.dataCatalogEncryptionSettingsMod.DataCatalogEncryptionSettings = js.native
    
    /**
      * Returns true if the given object is an instance of DataCatalogEncryptionSettings.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "DataCatalogEncryptionSettings.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/dataCatalogEncryptionSettings.DataCatalogEncryptionSettings */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "DevEndpoint")
  @js.native
  class DevEndpoint protected ()
    extends typingsSlinky.pulumiAws.devEndpointMod.DevEndpoint {
    /**
      * Create a DevEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DevEndpointArgs) = this()
    def this(name: String, args: DevEndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DevEndpoint {
    
    /**
      * Get an existing DevEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.devEndpointMod.DevEndpoint = js.native
    @JSImport("@pulumi/aws/glue", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.devEndpointMod.DevEndpoint = js.native
    @JSImport("@pulumi/aws/glue", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: DevEndpointState): typingsSlinky.pulumiAws.devEndpointMod.DevEndpoint = js.native
    @JSImport("@pulumi/aws/glue", "DevEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: DevEndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.devEndpointMod.DevEndpoint = js.native
    
    /**
      * Returns true if the given object is an instance of DevEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "DevEndpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/devEndpoint.DevEndpoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Job")
  @js.native
  class Job protected ()
    extends typingsSlinky.pulumiAws.jobMod.Job {
    /**
      * Create a Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobArgs) = this()
    def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Job {
    
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Job.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.jobMod.Job = js.native
    @JSImport("@pulumi/aws/glue", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobMod.Job = js.native
    @JSImport("@pulumi/aws/glue", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobState): typingsSlinky.pulumiAws.jobMod.Job = js.native
    @JSImport("@pulumi/aws/glue", "Job.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobMod.Job = js.native
    
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Job.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "MLTransform")
  @js.native
  class MLTransform protected ()
    extends typingsSlinky.pulumiAws.mltransformMod.MLTransform {
    /**
      * Create a MLTransform resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MLTransformArgs) = this()
    def this(name: String, args: MLTransformArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MLTransform {
    
    /**
      * Get an existing MLTransform resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.mltransformMod.MLTransform = js.native
    @JSImport("@pulumi/aws/glue", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.mltransformMod.MLTransform = js.native
    @JSImport("@pulumi/aws/glue", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID], state: MLTransformState): typingsSlinky.pulumiAws.mltransformMod.MLTransform = js.native
    @JSImport("@pulumi/aws/glue", "MLTransform.get")
    @js.native
    def get(name: String, id: Input[ID], state: MLTransformState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.mltransformMod.MLTransform = js.native
    
    /**
      * Returns true if the given object is an instance of MLTransform.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "MLTransform.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/mltransform.MLTransform */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Partition")
  @js.native
  class Partition protected ()
    extends typingsSlinky.pulumiAws.partitionMod.Partition {
    /**
      * Create a Partition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PartitionArgs) = this()
    def this(name: String, args: PartitionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Partition {
    
    /**
      * Get an existing Partition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
    @JSImport("@pulumi/aws/glue", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
    @JSImport("@pulumi/aws/glue", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID], state: PartitionState): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
    @JSImport("@pulumi/aws/glue", "Partition.get")
    @js.native
    def get(name: String, id: Input[ID], state: PartitionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.partitionMod.Partition = js.native
    
    /**
      * Returns true if the given object is an instance of Partition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Partition.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/partition.Partition */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "ResourcePolicy")
  @js.native
  class ResourcePolicy protected ()
    extends typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicy {
    /**
      * Create a ResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourcePolicyArgs) = this()
    def this(name: String, args: ResourcePolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResourcePolicy {
    
    /**
      * Get an existing ResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicy = js.native
    @JSImport("@pulumi/aws/glue", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicy = js.native
    @JSImport("@pulumi/aws/glue", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourcePolicyState): typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicy = js.native
    @JSImport("@pulumi/aws/glue", "ResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourcePolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.resourcePolicyMod.ResourcePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "ResourcePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/resourcePolicy.ResourcePolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "SecurityConfiguration")
  @js.native
  class SecurityConfiguration protected ()
    extends typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration {
    /**
      * Create a SecurityConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityConfigurationArgs) = this()
    def this(name: String, args: SecurityConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecurityConfiguration {
    
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/glue", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/glue", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    @JSImport("@pulumi/aws/glue", "SecurityConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "SecurityConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Trigger")
  @js.native
  class Trigger protected ()
    extends typingsSlinky.pulumiAws.glueTriggerMod.Trigger {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Trigger {
    
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.glueTriggerMod.Trigger = js.native
    @JSImport("@pulumi/aws/glue", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.glueTriggerMod.Trigger = js.native
    @JSImport("@pulumi/aws/glue", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: TriggerState): typingsSlinky.pulumiAws.glueTriggerMod.Trigger = js.native
    @JSImport("@pulumi/aws/glue", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.glueTriggerMod.Trigger = js.native
    
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Trigger.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "UserDefinedFunction")
  @js.native
  class UserDefinedFunction protected ()
    extends typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunction {
    /**
      * Create a UserDefinedFunction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserDefinedFunctionArgs) = this()
    def this(name: String, args: UserDefinedFunctionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object UserDefinedFunction {
    
    /**
      * Get an existing UserDefinedFunction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = js.native
    @JSImport("@pulumi/aws/glue", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = js.native
    @JSImport("@pulumi/aws/glue", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserDefinedFunctionState): typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = js.native
    @JSImport("@pulumi/aws/glue", "UserDefinedFunction.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserDefinedFunctionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.userDefinedFunctionMod.UserDefinedFunction = js.native
    
    /**
      * Returns true if the given object is an instance of UserDefinedFunction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "UserDefinedFunction.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/userDefinedFunction.UserDefinedFunction */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "Workflow")
  @js.native
  class Workflow protected ()
    extends typingsSlinky.pulumiAws.workflowMod.Workflow {
    /**
      * Create a Workflow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkflowArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: WorkflowArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Workflow {
    
    /**
      * Get an existing Workflow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue", "Workflow.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.workflowMod.Workflow = js.native
    @JSImport("@pulumi/aws/glue", "Workflow.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.workflowMod.Workflow = js.native
    @JSImport("@pulumi/aws/glue", "Workflow.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkflowState): typingsSlinky.pulumiAws.workflowMod.Workflow = js.native
    @JSImport("@pulumi/aws/glue", "Workflow.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.workflowMod.Workflow = js.native
    
    /**
      * Returns true if the given object is an instance of Workflow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue", "Workflow.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/glue", "getScript")
  @js.native
  def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] = js.native
  @JSImport("@pulumi/aws/glue", "getScript")
  @js.native
  def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] = js.native
}
