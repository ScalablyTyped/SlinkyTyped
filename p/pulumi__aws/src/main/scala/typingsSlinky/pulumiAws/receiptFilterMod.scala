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

object receiptFilterMod {
  
  @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter")
  @js.native
  class ReceiptFilter protected () extends CustomResource {
    /**
      * Create a ReceiptFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptFilterArgs) = this()
    def this(name: String, args: ReceiptFilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The SES receipt filter ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The IP address or address range to filter, in CIDR notation
      */
    val cidr: Output_[String] = js.native
    
    /**
      * The name of the filter
      */
    val name: Output_[String] = js.native
    
    /**
      * Block or Allow
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object ReceiptFilter {
    
    /**
      * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): ReceiptFilter = js.native
    @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReceiptFilter = js.native
    @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState): ReceiptFilter = js.native
    @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): ReceiptFilter = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/receiptFilter", "ReceiptFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = js.native
  }
  
  @js.native
  trait ReceiptFilterArgs extends StObject {
    
    /**
      * The IP address or address range to filter, in CIDR notation
      */
    val cidr: Input[String] = js.native
    
    /**
      * The name of the filter
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Block or Allow
      */
    val policy: Input[String] = js.native
  }
  object ReceiptFilterArgs {
    
    @scala.inline
    def apply(cidr: Input[String], policy: Input[String]): ReceiptFilterArgs = {
      val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiptFilterArgs]
    }
    
    @scala.inline
    implicit class ReceiptFilterArgsMutableBuilder[Self <: ReceiptFilterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiptFilterState extends StObject {
    
    /**
      * The SES receipt filter ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IP address or address range to filter, in CIDR notation
      */
    val cidr: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the filter
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Block or Allow
      */
    val policy: js.UndefOr[Input[String]] = js.native
  }
  object ReceiptFilterState {
    
    @scala.inline
    def apply(): ReceiptFilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReceiptFilterState]
    }
    
    @scala.inline
    implicit class ReceiptFilterStateMutableBuilder[Self <: ReceiptFilterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
