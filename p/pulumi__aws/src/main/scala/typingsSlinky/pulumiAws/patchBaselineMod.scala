package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ssm.PatchBaselineApprovalRule
import typingsSlinky.pulumiAws.outputMod.ssm.PatchBaselineGlobalFilter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchBaselineMod {
  
  @JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline")
  @js.native
  class PatchBaseline protected () extends CustomResource {
    /**
      * Create a PatchBaseline resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PatchBaselineArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approvalRule block requires the fields documented below.
      */
    val approvalRules: Output_[js.UndefOr[js.Array[PatchBaselineApprovalRule]]] = js.native
    
    /**
      * A list of explicitly approved patches for the baseline.
      */
    val approvedPatches: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
      */
    val approvedPatchesComplianceLevel: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The description of the patch baseline.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
      */
    val globalFilters: Output_[js.UndefOr[js.Array[PatchBaselineGlobalFilter]]] = js.native
    
    /**
      * The name of the patch baseline.
      */
    val name: Output_[String] = js.native
    
    /**
      * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
      */
    val operatingSystem: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of rejected patches.
      */
    val rejectedPatches: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object PatchBaseline {
    
    /**
      * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID]): PatchBaseline = js.native
    @JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PatchBaseline = js.native
    @JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState): PatchBaseline = js.native
    @JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): PatchBaseline = js.native
    
    /**
      * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/patchBaseline", "PatchBaseline.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = js.native
  }
  
  @js.native
  trait PatchBaselineArgs extends StObject {
    
    /**
      * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approvalRule block requires the fields documented below.
      */
    val approvalRules: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule]]]
      ] = js.native
    
    /**
      * A list of explicitly approved patches for the baseline.
      */
    val approvedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
      */
    val approvedPatchesComplianceLevel: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the patch baseline.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
      */
    val globalFilters: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter]]]
      ] = js.native
    
    /**
      * The name of the patch baseline.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
      */
    val operatingSystem: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of rejected patches.
      */
    val rejectedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PatchBaselineArgs {
    
    @scala.inline
    def apply(): PatchBaselineArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchBaselineArgs]
    }
    
    @scala.inline
    implicit class PatchBaselineArgsMutableBuilder[Self <: PatchBaselineArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApprovalRules(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule]]]): Self = StObject.set(x, "approvalRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovalRulesUndefined: Self = StObject.set(x, "approvalRules", js.undefined)
      
      @scala.inline
      def setApprovalRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule]*): Self = StObject.set(x, "approvalRules", js.Array(value :_*))
      
      @scala.inline
      def setApprovedPatches(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "approvedPatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovedPatchesComplianceLevel(value: Input[String]): Self = StObject.set(x, "approvedPatchesComplianceLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovedPatchesComplianceLevelUndefined: Self = StObject.set(x, "approvedPatchesComplianceLevel", js.undefined)
      
      @scala.inline
      def setApprovedPatchesUndefined: Self = StObject.set(x, "approvedPatches", js.undefined)
      
      @scala.inline
      def setApprovedPatchesVarargs(value: Input[String]*): Self = StObject.set(x, "approvedPatches", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGlobalFilters(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter]]]): Self = StObject.set(x, "globalFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalFiltersUndefined: Self = StObject.set(x, "globalFilters", js.undefined)
      
      @scala.inline
      def setGlobalFiltersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter]*): Self = StObject.set(x, "globalFilters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: Input[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      @scala.inline
      def setRejectedPatches(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "rejectedPatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectedPatchesUndefined: Self = StObject.set(x, "rejectedPatches", js.undefined)
      
      @scala.inline
      def setRejectedPatchesVarargs(value: Input[String]*): Self = StObject.set(x, "rejectedPatches", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait PatchBaselineState extends StObject {
    
    /**
      * A set of rules used to include patches in the baseline. up to 10 approval rules can be specified. Each approvalRule block requires the fields documented below.
      */
    val approvalRules: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule]]]
      ] = js.native
    
    /**
      * A list of explicitly approved patches for the baseline.
      */
    val approvedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
      */
    val approvedPatchesComplianceLevel: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the patch baseline.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A set of global filters used to exclude patches from the baseline. Up to 4 global filters can be specified using Key/Value pairs. Valid Keys are `PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`.
      */
    val globalFilters: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter]]]
      ] = js.native
    
    /**
      * The name of the patch baseline.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Defines the operating system the patch baseline applies to. Supported operating systems include `WINDOWS`, `AMAZON_LINUX`, `AMAZON_LINUX_2`, `SUSE`, `UBUNTU`, `CENTOS`, and `REDHAT_ENTERPRISE_LINUX`. The Default value is `WINDOWS`.
      */
    val operatingSystem: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of rejected patches.
      */
    val rejectedPatches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PatchBaselineState {
    
    @scala.inline
    def apply(): PatchBaselineState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchBaselineState]
    }
    
    @scala.inline
    implicit class PatchBaselineStateMutableBuilder[Self <: PatchBaselineState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApprovalRules(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule]]]): Self = StObject.set(x, "approvalRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovalRulesUndefined: Self = StObject.set(x, "approvalRules", js.undefined)
      
      @scala.inline
      def setApprovalRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineApprovalRule]*): Self = StObject.set(x, "approvalRules", js.Array(value :_*))
      
      @scala.inline
      def setApprovedPatches(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "approvedPatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovedPatchesComplianceLevel(value: Input[String]): Self = StObject.set(x, "approvedPatchesComplianceLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovedPatchesComplianceLevelUndefined: Self = StObject.set(x, "approvedPatchesComplianceLevel", js.undefined)
      
      @scala.inline
      def setApprovedPatchesUndefined: Self = StObject.set(x, "approvedPatches", js.undefined)
      
      @scala.inline
      def setApprovedPatchesVarargs(value: Input[String]*): Self = StObject.set(x, "approvedPatches", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGlobalFilters(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter]]]): Self = StObject.set(x, "globalFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalFiltersUndefined: Self = StObject.set(x, "globalFilters", js.undefined)
      
      @scala.inline
      def setGlobalFiltersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.ssm.PatchBaselineGlobalFilter]*): Self = StObject.set(x, "globalFilters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperatingSystem(value: Input[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      @scala.inline
      def setRejectedPatches(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "rejectedPatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectedPatchesUndefined: Self = StObject.set(x, "rejectedPatches", js.undefined)
      
      @scala.inline
      def setRejectedPatchesVarargs(value: Input[String]*): Self = StObject.set(x, "rejectedPatches", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
