package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getLedgerMod.GetLedgerArgs
import typingsSlinky.pulumiAws.getLedgerMod.GetLedgerResult
import typingsSlinky.pulumiAws.ledgerMod.LedgerArgs
import typingsSlinky.pulumiAws.ledgerMod.LedgerState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/qldb", JSImport.Namespace)
@js.native
object qldbMod extends js.Object {
  
  def getLedger(args: GetLedgerArgs): js.Promise[GetLedgerResult] = js.native
  def getLedger(args: GetLedgerArgs, opts: InvokeOptions): js.Promise[GetLedgerResult] = js.native
  
  @js.native
  class Ledger protected ()
    extends typingsSlinky.pulumiAws.ledgerMod.Ledger {
    /**
      * Create a Ledger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LedgerArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LedgerArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Ledger extends js.Object {
    
    /**
      * Get an existing Ledger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ledgerMod.Ledger = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ledgerMod.Ledger = js.native
    def get(name: String, id: Input[ID], state: LedgerState): typingsSlinky.pulumiAws.ledgerMod.Ledger = js.native
    def get(name: String, id: Input[ID], state: LedgerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ledgerMod.Ledger = js.native
    
    /**
      * Returns true if the given object is an instance of Ledger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/qldb/ledger.Ledger */ Boolean = js.native
  }
}
