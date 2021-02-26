package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.rds.OptionGroupOption
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionGroupMod {
  
  @JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup")
  @js.native
  class OptionGroup protected () extends CustomResource {
    /**
      * Create a OptionGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OptionGroupArgs) = this()
    def this(name: String, args: OptionGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the db option group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies the name of the engine that this option group should be associated with.
      */
    val engineName: Output_[String] = js.native
    
    /**
      * Specifies the major version of the engine that this option group should be associated with.
      */
    val majorEngineVersion: Output_[String] = js.native
    
    /**
      * The Name of the setting.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
      */
    val namePrefix: Output_[String] = js.native
    
    /**
      * The description of the option group. Defaults to "Managed by Pulumi".
      */
    val optionGroupDescription: Output_[String] = js.native
    
    /**
      * A list of Options to apply.
      */
    val options: Output_[js.UndefOr[js.Array[OptionGroupOption]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object OptionGroup {
    
    /**
      * Get an existing OptionGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): OptionGroup = js.native
    @JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OptionGroup = js.native
    @JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: OptionGroupState): OptionGroup = js.native
    @JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: OptionGroupState, opts: CustomResourceOptions): OptionGroup = js.native
    
    /**
      * Returns true if the given object is an instance of OptionGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/optionGroup", "OptionGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/optionGroup.OptionGroup */ Boolean = js.native
  }
  
  @js.native
  trait OptionGroupArgs extends StObject {
    
    /**
      * Specifies the name of the engine that this option group should be associated with.
      */
    val engineName: Input[String] = js.native
    
    /**
      * Specifies the major version of the engine that this option group should be associated with.
      */
    val majorEngineVersion: Input[String] = js.native
    
    /**
      * The Name of the setting.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the option group. Defaults to "Managed by Pulumi".
      */
    val optionGroupDescription: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of Options to apply.
      */
    val options: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object OptionGroupArgs {
    
    @scala.inline
    def apply(engineName: Input[String], majorEngineVersion: Input[String]): OptionGroupArgs = {
      val __obj = js.Dynamic.literal(engineName = engineName.asInstanceOf[js.Any], majorEngineVersion = majorEngineVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionGroupArgs]
    }
    
    @scala.inline
    implicit class OptionGroupArgsMutableBuilder[Self <: OptionGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngineName(value: Input[String]): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorEngineVersion(value: Input[String]): Self = StObject.set(x, "majorEngineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionGroupDescription(value: Input[String]): Self = StObject.set(x, "optionGroupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionGroupDescriptionUndefined: Self = StObject.set(x, "optionGroupDescription", js.undefined)
      
      @scala.inline
      def setOptions(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption]]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption]*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait OptionGroupState extends StObject {
    
    /**
      * The ARN of the db option group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the name of the engine that this option group should be associated with.
      */
    val engineName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the major version of the engine that this option group should be associated with.
      */
    val majorEngineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Name of the setting.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the option group. Defaults to "Managed by Pulumi".
      */
    val optionGroupDescription: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of Options to apply.
      */
    val options: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object OptionGroupState {
    
    @scala.inline
    def apply(): OptionGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionGroupState]
    }
    
    @scala.inline
    implicit class OptionGroupStateMutableBuilder[Self <: OptionGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEngineName(value: Input[String]): Self = StObject.set(x, "engineName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineNameUndefined: Self = StObject.set(x, "engineName", js.undefined)
      
      @scala.inline
      def setMajorEngineVersion(value: Input[String]): Self = StObject.set(x, "majorEngineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorEngineVersionUndefined: Self = StObject.set(x, "majorEngineVersion", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionGroupDescription(value: Input[String]): Self = StObject.set(x, "optionGroupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionGroupDescriptionUndefined: Self = StObject.set(x, "optionGroupDescription", js.undefined)
      
      @scala.inline
      def setOptions(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption]]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.rds.OptionGroupOption]*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
