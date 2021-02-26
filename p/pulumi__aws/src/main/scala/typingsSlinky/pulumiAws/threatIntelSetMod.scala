package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threatIntelSetMod {
  
  @JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet")
  @js.native
  class ThreatIntelSet protected () extends CustomResource {
    /**
      * Create a ThreatIntelSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ThreatIntelSetArgs) = this()
    def this(name: String, args: ThreatIntelSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
      */
    val activate: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the GuardDuty ThreatIntelSet.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: Output_[String] = js.native
    
    /**
      * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
      */
    val format: Output_[String] = js.native
    
    /**
      * The URI of the file that contains the ThreatIntelSet.
      */
    val location: Output_[String] = js.native
    
    /**
      * The friendly name to identify the ThreatIntelSet.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ThreatIntelSet {
    
    /**
      * Get an existing ThreatIntelSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID]): ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState): ThreatIntelSet = js.native
    @JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThreatIntelSetState, opts: CustomResourceOptions): ThreatIntelSet = js.native
    
    /**
      * Returns true if the given object is an instance of ThreatIntelSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty/threatIntelSet", "ThreatIntelSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/threatIntelSet.ThreatIntelSet */ Boolean = js.native
  }
  
  @js.native
  trait ThreatIntelSetArgs extends StObject {
    
    /**
      * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
      */
    val activate: Input[Boolean] = js.native
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: Input[String] = js.native
    
    /**
      * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
      */
    val format: Input[String] = js.native
    
    /**
      * The URI of the file that contains the ThreatIntelSet.
      */
    val location: Input[String] = js.native
    
    /**
      * The friendly name to identify the ThreatIntelSet.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ThreatIntelSetArgs {
    
    @scala.inline
    def apply(
      activate: Input[Boolean],
      detectorId: Input[String],
      format: Input[String],
      location: Input[String]
    ): ThreatIntelSetArgs = {
      val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreatIntelSetArgs]
    }
    
    @scala.inline
    implicit class ThreatIntelSetArgsMutableBuilder[Self <: ThreatIntelSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: Input[Boolean]): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ThreatIntelSetState extends StObject {
    
    /**
      * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
      */
    val activate: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the GuardDuty ThreatIntelSet.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
      */
    val format: js.UndefOr[Input[String]] = js.native
    
    /**
      * The URI of the file that contains the ThreatIntelSet.
      */
    val location: js.UndefOr[Input[String]] = js.native
    
    /**
      * The friendly name to identify the ThreatIntelSet.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ThreatIntelSetState {
    
    @scala.inline
    def apply(): ThreatIntelSetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThreatIntelSetState]
    }
    
    @scala.inline
    implicit class ThreatIntelSetStateMutableBuilder[Self <: ThreatIntelSetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: Input[Boolean]): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
      
      @scala.inline
      def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
