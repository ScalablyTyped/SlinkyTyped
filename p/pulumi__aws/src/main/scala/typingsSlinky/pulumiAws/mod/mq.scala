package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.brokerMod.BrokerArgs
import typingsSlinky.pulumiAws.brokerMod.BrokerState
import typingsSlinky.pulumiAws.configurationMod.ConfigurationArgs
import typingsSlinky.pulumiAws.configurationMod.ConfigurationState
import typingsSlinky.pulumiAws.getBrokerMod.GetBrokerArgs
import typingsSlinky.pulumiAws.getBrokerMod.GetBrokerResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mq {
  
  @JSImport("@pulumi/aws", "mq.Broker")
  @js.native
  class Broker protected ()
    extends typingsSlinky.pulumiAws.mqMod.Broker {
    /**
      * Create a Broker resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BrokerArgs) = this()
    def this(name: String, args: BrokerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Broker {
    
    /**
      * Get an existing Broker resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "mq.Broker.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.brokerMod.Broker = js.native
    @JSImport("@pulumi/aws", "mq.Broker.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.brokerMod.Broker = js.native
    @JSImport("@pulumi/aws", "mq.Broker.get")
    @js.native
    def get(name: String, id: Input[ID], state: BrokerState): typingsSlinky.pulumiAws.brokerMod.Broker = js.native
    @JSImport("@pulumi/aws", "mq.Broker.get")
    @js.native
    def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.brokerMod.Broker = js.native
    
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "mq.Broker.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "mq.Configuration")
  @js.native
  class Configuration protected ()
    extends typingsSlinky.pulumiAws.mqMod.Configuration {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationArgs) = this()
    def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Configuration {
    
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "mq.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.configurationMod.Configuration = js.native
    @JSImport("@pulumi/aws", "mq.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.configurationMod.Configuration = js.native
    @JSImport("@pulumi/aws", "mq.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typingsSlinky.pulumiAws.configurationMod.Configuration = js.native
    @JSImport("@pulumi/aws", "mq.Configuration.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.configurationMod.Configuration = js.native
    
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "mq.Configuration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "mq.getBroker")
  @js.native
  def getBroker(): js.Promise[GetBrokerResult] = js.native
  @JSImport("@pulumi/aws", "mq.getBroker")
  @js.native
  def getBroker(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetBrokerResult] = js.native
  @JSImport("@pulumi/aws", "mq.getBroker")
  @js.native
  def getBroker(args: GetBrokerArgs): js.Promise[GetBrokerResult] = js.native
  @JSImport("@pulumi/aws", "mq.getBroker")
  @js.native
  def getBroker(args: GetBrokerArgs, opts: InvokeOptions): js.Promise[GetBrokerResult] = js.native
}
