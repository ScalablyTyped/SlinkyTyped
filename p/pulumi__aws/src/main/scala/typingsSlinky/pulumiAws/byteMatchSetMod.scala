package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.wafregional.ByteMatchSetByteMatchTuple
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteMatchSetMod {
  
  @JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet")
  @js.native
  class ByteMatchSet protected () extends CustomResource {
    /**
      * Create a ByteMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ByteMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
      */
    val byteMatchTuples: Output_[js.UndefOr[js.Array[ByteMatchSetByteMatchTuple]]] = js.native
    
    /**
      * The name or description of the ByteMatchSet.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object ByteMatchSet {
    
    /**
      * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): ByteMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ByteMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState): ByteMatchSet = js.native
    @JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): ByteMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/byteMatchSet.ByteMatchSet */ Boolean = js.native
  }
  
  @js.native
  trait ByteMatchSetArgs extends StObject {
    
    /**
      * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
      */
    val byteMatchTuples: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple]]
        ]
      ] = js.native
    
    /**
      * The name or description of the ByteMatchSet.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object ByteMatchSetArgs {
    
    @scala.inline
    def apply(): ByteMatchSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteMatchSetArgs]
    }
    
    @scala.inline
    implicit class ByteMatchSetArgsMutableBuilder[Self <: ByteMatchSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByteMatchTuples(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple]]
            ]
      ): Self = StObject.set(x, "byteMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteMatchTuplesUndefined: Self = StObject.set(x, "byteMatchTuples", js.undefined)
      
      @scala.inline
      def setByteMatchTuplesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple]*): Self = StObject.set(x, "byteMatchTuples", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait ByteMatchSetState extends StObject {
    
    /**
      * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
      */
    val byteMatchTuples: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple]]
        ]
      ] = js.native
    
    /**
      * The name or description of the ByteMatchSet.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object ByteMatchSetState {
    
    @scala.inline
    def apply(): ByteMatchSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteMatchSetState]
    }
    
    @scala.inline
    implicit class ByteMatchSetStateMutableBuilder[Self <: ByteMatchSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByteMatchTuples(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple]]
            ]
      ): Self = StObject.set(x, "byteMatchTuples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteMatchTuplesUndefined: Self = StObject.set(x, "byteMatchTuples", js.undefined)
      
      @scala.inline
      def setByteMatchTuplesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple]*): Self = StObject.set(x, "byteMatchTuples", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
