package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabaseArgs
import typingsSlinky.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabaseState
import typingsSlinky.atPulumiAws.glueCatalogTableMod.CatalogTableArgs
import typingsSlinky.atPulumiAws.glueCatalogTableMod.CatalogTableState
import typingsSlinky.atPulumiAws.glueClassifierMod.ClassifierArgs
import typingsSlinky.atPulumiAws.glueClassifierMod.ClassifierState
import typingsSlinky.atPulumiAws.glueConnectionMod.ConnectionArgs
import typingsSlinky.atPulumiAws.glueConnectionMod.ConnectionState
import typingsSlinky.atPulumiAws.glueCrawlerMod.CrawlerArgs
import typingsSlinky.atPulumiAws.glueCrawlerMod.CrawlerState
import typingsSlinky.atPulumiAws.glueGetScriptMod.GetScriptArgs
import typingsSlinky.atPulumiAws.glueGetScriptMod.GetScriptResult
import typingsSlinky.atPulumiAws.glueJobMod.JobArgs
import typingsSlinky.atPulumiAws.glueJobMod.JobState
import typingsSlinky.atPulumiAws.glueSecurityConfigurationMod.SecurityConfigurationArgs
import typingsSlinky.atPulumiAws.glueSecurityConfigurationMod.SecurityConfigurationState
import typingsSlinky.atPulumiAws.glueTriggerMod.TriggerArgs
import typingsSlinky.atPulumiAws.glueTriggerMod.TriggerState
import typingsSlinky.atPulumiAws.glueWorkflowMod.WorkflowArgs
import typingsSlinky.atPulumiAws.glueWorkflowMod.WorkflowState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "glue")
@js.native
object glue extends js.Object {
  @js.native
  class CatalogDatabase protected ()
    extends typingsSlinky.atPulumiAws.glueMod.CatalogDatabase {
    /**
      * Create a CatalogDatabase resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CatalogDatabaseArgs) = this()
    def this(name: String, args: CatalogDatabaseArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CatalogTable protected ()
    extends typingsSlinky.atPulumiAws.glueMod.CatalogTable {
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
  
  @js.native
  class Classifier protected ()
    extends typingsSlinky.atPulumiAws.glueMod.Classifier {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClassifierArgs) = this()
    def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Connection protected ()
    extends typingsSlinky.atPulumiAws.glueMod.Connection {
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
  
  @js.native
  class Crawler protected ()
    extends typingsSlinky.atPulumiAws.glueMod.Crawler {
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
  
  @js.native
  class Job protected ()
    extends typingsSlinky.atPulumiAws.glueMod.Job {
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
  
  @js.native
  class SecurityConfiguration protected ()
    extends typingsSlinky.atPulumiAws.glueMod.SecurityConfiguration {
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
  
  @js.native
  class Trigger protected ()
    extends typingsSlinky.atPulumiAws.glueMod.Trigger {
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
  
  @js.native
  class Workflow protected ()
    extends typingsSlinky.atPulumiAws.glueMod.Workflow {
    /**
      * Create a Workflow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkflowArgs) = this()
    def this(name: String, args: WorkflowArgs, opts: CustomResourceOptions) = this()
  }
  
  def getScript(args: GetScriptArgs): js.Promise[GetScriptResult] with GetScriptResult = js.native
  def getScript(args: GetScriptArgs, opts: InvokeOptions): js.Promise[GetScriptResult] with GetScriptResult = js.native
  /* static members */
  @js.native
  object CatalogDatabase extends js.Object {
    /**
      * Get an existing CatalogDatabase resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabase = js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState): typingsSlinky.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabase = js.native
    def get(name: String, id: Input[ID], state: CatalogDatabaseState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueCatalogDatabaseMod.CatalogDatabase = js.native
    /**
      * Returns true if the given object is an instance of CatalogDatabase.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogDatabase.CatalogDatabase */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CatalogTable extends js.Object {
    /**
      * Get an existing CatalogTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueCatalogTableMod.CatalogTable = js.native
    def get(name: String, id: Input[ID], state: CatalogTableState): typingsSlinky.atPulumiAws.glueCatalogTableMod.CatalogTable = js.native
    def get(name: String, id: Input[ID], state: CatalogTableState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueCatalogTableMod.CatalogTable = js.native
    /**
      * Returns true if the given object is an instance of CatalogTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/catalogTable.CatalogTable */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Classifier extends js.Object {
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueClassifierMod.Classifier = js.native
    def get(name: String, id: Input[ID], state: ClassifierState): typingsSlinky.atPulumiAws.glueClassifierMod.Classifier = js.native
    def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueClassifierMod.Classifier = js.native
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Connection extends js.Object {
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState): typingsSlinky.atPulumiAws.glueConnectionMod.Connection = js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueConnectionMod.Connection = js.native
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Crawler extends js.Object {
    /**
      * Get an existing Crawler resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueCrawlerMod.Crawler = js.native
    def get(name: String, id: Input[ID], state: CrawlerState): typingsSlinky.atPulumiAws.glueCrawlerMod.Crawler = js.native
    def get(name: String, id: Input[ID], state: CrawlerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueCrawlerMod.Crawler = js.native
    /**
      * Returns true if the given object is an instance of Crawler.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/crawler.Crawler */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Job extends js.Object {
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueJobMod.Job = js.native
    def get(name: String, id: Input[ID], state: JobState): typingsSlinky.atPulumiAws.glueJobMod.Job = js.native
    def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueJobMod.Job = js.native
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecurityConfiguration extends js.Object {
    /**
      * Get an existing SecurityConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState): typingsSlinky.atPulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    def get(name: String, id: Input[ID], state: SecurityConfigurationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueSecurityConfigurationMod.SecurityConfiguration = js.native
    /**
      * Returns true if the given object is an instance of SecurityConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/securityConfiguration.SecurityConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Trigger extends js.Object {
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState): typingsSlinky.atPulumiAws.glueTriggerMod.Trigger = js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueTriggerMod.Trigger = js.native
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Workflow extends js.Object {
    /**
      * Get an existing Workflow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.glueWorkflowMod.Workflow = js.native
    def get(name: String, id: Input[ID], state: WorkflowState): typingsSlinky.atPulumiAws.glueWorkflowMod.Workflow = js.native
    def get(name: String, id: Input[ID], state: WorkflowState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.glueWorkflowMod.Workflow = js.native
    /**
      * Returns true if the given object is an instance of Workflow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/workflow.Workflow */ Boolean = js.native
  }
  
}

