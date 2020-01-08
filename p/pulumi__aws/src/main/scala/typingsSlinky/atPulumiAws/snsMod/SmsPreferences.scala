package typingsSlinky.atPulumiAws.snsMod

import typingsSlinky.atPulumiAws.snsSmsPreferencesMod.SmsPreferencesArgs
import typingsSlinky.atPulumiAws.snsSmsPreferencesMod.SmsPreferencesState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "SmsPreferences")
@js.native
class SmsPreferences protected ()
  extends typingsSlinky.atPulumiAws.snsSmsPreferencesMod.SmsPreferences {
  /**
    * Create a SmsPreferences resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SmsPreferencesArgs) = this()
  def this(name: String, args: SmsPreferencesArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/sns", "SmsPreferences")
@js.native
object SmsPreferences extends js.Object {
  /**
    * Get an existing SmsPreferences resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.snsSmsPreferencesMod.SmsPreferences = js.native
  def get(name: String, id: Input[ID], state: SmsPreferencesState): typingsSlinky.atPulumiAws.snsSmsPreferencesMod.SmsPreferences = js.native
  def get(name: String, id: Input[ID], state: SmsPreferencesState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.snsSmsPreferencesMod.SmsPreferences = js.native
  /**
    * Returns true if the given object is an instance of SmsPreferences.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/smsPreferences.SmsPreferences */ Boolean = js.native
}

