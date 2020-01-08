package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.elasticbeanstalkApplicationMod.ApplicationArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkApplicationMod.ApplicationState
import typingsSlinky.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersionArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersionState
import typingsSlinky.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplateState
import typingsSlinky.atPulumiAws.elasticbeanstalkEnvironmentMod.EnvironmentArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkEnvironmentMod.EnvironmentState
import typingsSlinky.atPulumiAws.elasticbeanstalkGetApplicationMod.GetApplicationArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkGetApplicationMod.GetApplicationResult
import typingsSlinky.atPulumiAws.elasticbeanstalkGetHostedZoneMod.GetHostedZoneArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkGetHostedZoneMod.GetHostedZoneResult
import typingsSlinky.atPulumiAws.elasticbeanstalkGetSolutionStackMod.GetSolutionStackArgs
import typingsSlinky.atPulumiAws.elasticbeanstalkGetSolutionStackMod.GetSolutionStackResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticbeanstalk")
@js.native
object elasticbeanstalk extends js.Object {
  @js.native
  class Application protected ()
    extends typingsSlinky.atPulumiAws.elasticbeanstalkMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ApplicationVersion protected ()
    extends typingsSlinky.atPulumiAws.elasticbeanstalkMod.ApplicationVersion {
    /**
      * Create a ApplicationVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationVersionArgs) = this()
    def this(name: String, args: ApplicationVersionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfigurationTemplate protected ()
    extends typingsSlinky.atPulumiAws.elasticbeanstalkMod.ConfigurationTemplate {
    /**
      * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationTemplateArgs) = this()
    def this(name: String, args: ConfigurationTemplateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Environment protected ()
    extends typingsSlinky.atPulumiAws.elasticbeanstalkMod.Environment {
    /**
      * Create a Environment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EnvironmentArgs) = this()
    def this(name: String, args: EnvironmentArgs, opts: CustomResourceOptions) = this()
  }
  
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] with GetApplicationResult = js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] with GetApplicationResult = js.native
  def getHostedZone(): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] with GetSolutionStackResult = js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] with GetSolutionStackResult = js.native
  /* static members */
  @js.native
  object Application extends js.Object {
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typingsSlinky.atPulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ApplicationVersion extends js.Object {
    /**
      * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState): typingsSlinky.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
    /**
      * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ConfigurationTemplate extends js.Object {
    /**
      * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typingsSlinky.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticbeanstalkConfigurationTemplateMod.ConfigurationTemplate = js.native
    /**
      * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Environment extends js.Object {
    /**
      * Get an existing Environment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState): typingsSlinky.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
  }
  
}

