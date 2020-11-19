package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersionArgs
import typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersionState
import typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplateArgs
import typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplateState
import typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.ApplicationArgs
import typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.ApplicationState
import typingsSlinky.pulumiAws.environmentMod.EnvironmentArgs
import typingsSlinky.pulumiAws.environmentMod.EnvironmentState
import typingsSlinky.pulumiAws.getApplicationMod.GetApplicationArgs
import typingsSlinky.pulumiAws.getApplicationMod.GetApplicationResult
import typingsSlinky.pulumiAws.getHostedZoneMod.GetHostedZoneArgs
import typingsSlinky.pulumiAws.getHostedZoneMod.GetHostedZoneResult
import typingsSlinky.pulumiAws.getSolutionStackMod.GetSolutionStackArgs
import typingsSlinky.pulumiAws.getSolutionStackMod.GetSolutionStackResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/elasticbeanstalk", JSImport.Namespace)
@js.native
object elasticbeanstalkMod extends js.Object {
  
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] = js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] = js.native
  
  def getHostedZone(): js.Promise[GetHostedZoneResult] = js.native
  def getHostedZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] = js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] = js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] = js.native
  
  @js.native
  class Application protected ()
    extends typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = js.native
  }
  
  @js.native
  class ApplicationVersion protected ()
    extends typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersion {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState): typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersion = js.native
    
    /**
      * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = js.native
  }
  
  @js.native
  class ConfigurationTemplate protected ()
    extends typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplate {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState): typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.configurationTemplateMod.ConfigurationTemplate = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
  }
  
  @js.native
  class Environment protected ()
    extends typingsSlinky.pulumiAws.environmentMod.Environment {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.environmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.environmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState): typingsSlinky.pulumiAws.environmentMod.Environment = js.native
    def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.environmentMod.Environment = js.native
    
    /**
      * Returns true if the given object is an instance of Environment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
  }
}
