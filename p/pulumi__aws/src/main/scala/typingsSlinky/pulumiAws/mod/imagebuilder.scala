package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.componentMod.ComponentArgs
import typingsSlinky.pulumiAws.componentMod.ComponentState
import typingsSlinky.pulumiAws.distributionConfigurationMod.DistributionConfigurationArgs
import typingsSlinky.pulumiAws.distributionConfigurationMod.DistributionConfigurationState
import typingsSlinky.pulumiAws.getComponentMod.GetComponentArgs
import typingsSlinky.pulumiAws.getComponentMod.GetComponentResult
import typingsSlinky.pulumiAws.getDistributionConfigurationMod.GetDistributionConfigurationArgs
import typingsSlinky.pulumiAws.getDistributionConfigurationMod.GetDistributionConfigurationResult
import typingsSlinky.pulumiAws.getInfrastructureConfigurationMod.GetInfrastructureConfigurationArgs
import typingsSlinky.pulumiAws.getInfrastructureConfigurationMod.GetInfrastructureConfigurationResult
import typingsSlinky.pulumiAws.infrastructureConfigurationMod.InfrastructureConfigurationArgs
import typingsSlinky.pulumiAws.infrastructureConfigurationMod.InfrastructureConfigurationState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebuilder {
  
  @JSImport("@pulumi/aws", "imagebuilder.Component")
  @js.native
  class Component protected ()
    extends typingsSlinky.pulumiAws.imagebuilderMod.Component {
    /**
      * Create a Component resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComponentArgs) = this()
    def this(name: String, args: ComponentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Component {
    
    /**
      * Get an existing Component resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "imagebuilder.Component.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.componentMod.Component = js.native
    @JSImport("@pulumi/aws", "imagebuilder.Component.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.componentMod.Component = js.native
    @JSImport("@pulumi/aws", "imagebuilder.Component.get")
    @js.native
    def get(name: String, id: Input[ID], state: ComponentState): typingsSlinky.pulumiAws.componentMod.Component = js.native
    @JSImport("@pulumi/aws", "imagebuilder.Component.get")
    @js.native
    def get(name: String, id: Input[ID], state: ComponentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.componentMod.Component = js.native
    
    /**
      * Returns true if the given object is an instance of Component.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "imagebuilder.Component.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/component.Component */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration")
  @js.native
  class DistributionConfiguration protected ()
    extends typingsSlinky.pulumiAws.imagebuilderMod.DistributionConfiguration {
    /**
      * Create a DistributionConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DistributionConfigurationArgs) = this()
    def this(name: String, args: DistributionConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DistributionConfiguration {
    
    /**
      * Get an existing DistributionConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.distributionConfigurationMod.DistributionConfiguration = js.native
    @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.distributionConfigurationMod.DistributionConfiguration = js.native
    @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: DistributionConfigurationState): typingsSlinky.pulumiAws.distributionConfigurationMod.DistributionConfiguration = js.native
    @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: DistributionConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.distributionConfigurationMod.DistributionConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of DistributionConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "imagebuilder.DistributionConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/distributionConfiguration.DistributionConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration")
  @js.native
  class InfrastructureConfiguration protected ()
    extends typingsSlinky.pulumiAws.imagebuilderMod.InfrastructureConfiguration {
    /**
      * Create a InfrastructureConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InfrastructureConfigurationArgs) = this()
    def this(name: String, args: InfrastructureConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object InfrastructureConfiguration {
    
    /**
      * Get an existing InfrastructureConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = js.native
    @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = js.native
    @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: InfrastructureConfigurationState): typingsSlinky.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = js.native
    @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: InfrastructureConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.infrastructureConfigurationMod.InfrastructureConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of InfrastructureConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "imagebuilder.InfrastructureConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "imagebuilder.getComponent")
  @js.native
  def getComponent(args: GetComponentArgs): js.Promise[GetComponentResult] = js.native
  @JSImport("@pulumi/aws", "imagebuilder.getComponent")
  @js.native
  def getComponent(args: GetComponentArgs, opts: InvokeOptions): js.Promise[GetComponentResult] = js.native
  
  @JSImport("@pulumi/aws", "imagebuilder.getDistributionConfiguration")
  @js.native
  def getDistributionConfiguration(args: GetDistributionConfigurationArgs): js.Promise[GetDistributionConfigurationResult] = js.native
  @JSImport("@pulumi/aws", "imagebuilder.getDistributionConfiguration")
  @js.native
  def getDistributionConfiguration(args: GetDistributionConfigurationArgs, opts: InvokeOptions): js.Promise[GetDistributionConfigurationResult] = js.native
  
  @JSImport("@pulumi/aws", "imagebuilder.getInfrastructureConfiguration")
  @js.native
  def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs): js.Promise[GetInfrastructureConfigurationResult] = js.native
  @JSImport("@pulumi/aws", "imagebuilder.getInfrastructureConfiguration")
  @js.native
  def getInfrastructureConfiguration(args: GetInfrastructureConfigurationArgs, opts: InvokeOptions): js.Promise[GetInfrastructureConfigurationResult] = js.native
}
