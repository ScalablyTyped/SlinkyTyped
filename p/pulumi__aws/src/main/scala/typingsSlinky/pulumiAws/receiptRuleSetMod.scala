package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object receiptRuleSetMod {
  
  @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet")
  @js.native
  class ReceiptRuleSet protected () extends CustomResource {
    /**
      * Create a ReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleSetArgs) = this()
    def this(name: String, args: ReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Output_[String] = js.native
  }
  /* static members */
  object ReceiptRuleSet {
    
    /**
      * Get an existing ReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID]): ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState): ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): ReceiptRuleSet = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/receiptRuleSet", "ReceiptRuleSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = js.native
  }
  
  @js.native
  trait ReceiptRuleSetArgs extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: Input[String] = js.native
  }
  object ReceiptRuleSetArgs {
    
    @scala.inline
    def apply(ruleSetName: Input[String]): ReceiptRuleSetArgs = {
      val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptRuleSetArgs]
    }
    
    @scala.inline
    implicit class ReceiptRuleSetArgsMutableBuilder[Self <: ReceiptRuleSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiptRuleSetState extends StObject {
    
    /**
      * The name of the rule set
      */
    val ruleSetName: js.UndefOr[Input[String]] = js.native
  }
  object ReceiptRuleSetState {
    
    @scala.inline
    def apply(): ReceiptRuleSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReceiptRuleSetState]
    }
    
    @scala.inline
    implicit class ReceiptRuleSetStateMutableBuilder[Self <: ReceiptRuleSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRuleSetName(value: Input[String]): Self = StObject.set(x, "ruleSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleSetNameUndefined: Self = StObject.set(x, "ruleSetName", js.undefined)
    }
  }
}
