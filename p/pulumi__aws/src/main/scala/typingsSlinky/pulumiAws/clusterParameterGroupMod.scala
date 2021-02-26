package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.docdb.ClusterParameterGroupParameter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterParameterGroupMod {
  
  @JSImport("@pulumi/aws/docdb/clusterParameterGroup", "ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected () extends CustomResource {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterParameterGroupArgs) = this()
    def this(name: String, args: ClusterParameterGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the documentDB cluster parameter group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of the documentDB cluster parameter group. Defaults to "Managed by Pulumi".
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The family of the documentDB cluster parameter group.
      */
    val family: Output_[String] = js.native
    
    /**
      * The name of the documentDB parameter.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[String] = js.native
    
    /**
      * A list of documentDB parameters to apply.
      */
    val parameters: Output_[js.UndefOr[js.Array[ClusterParameterGroupParameter]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ClusterParameterGroup {
    
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/docdb/clusterParameterGroup", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/docdb/clusterParameterGroup", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/docdb/clusterParameterGroup", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): ClusterParameterGroup = js.native
    @JSImport("@pulumi/aws/docdb/clusterParameterGroup", "ClusterParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): ClusterParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/docdb/clusterParameterGroup", "ClusterParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterParameterGroup.ClusterParameterGroup */ Boolean = js.native
  }
  
  @js.native
  trait ClusterParameterGroupArgs extends StObject {
    
    /**
      * The description of the documentDB cluster parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The family of the documentDB cluster parameter group.
      */
    val family: Input[String] = js.native
    
    /**
      * The name of the documentDB parameter.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of documentDB parameters to apply.
      */
    val parameters: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter]]
        ]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClusterParameterGroupArgs {
    
    @scala.inline
    def apply(family: Input[String]): ClusterParameterGroupArgs = {
      val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupArgs]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupArgsMutableBuilder[Self <: ClusterParameterGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter]]
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClusterParameterGroupState extends StObject {
    
    /**
      * The ARN of the documentDB cluster parameter group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the documentDB cluster parameter group. Defaults to "Managed by Pulumi".
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The family of the documentDB cluster parameter group.
      */
    val family: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the documentDB parameter.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of documentDB parameters to apply.
      */
    val parameters: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter]]
        ]
      ] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ClusterParameterGroupState {
    
    @scala.inline
    def apply(): ClusterParameterGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterParameterGroupState]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupStateMutableBuilder[Self <: ClusterParameterGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFamily(value: Input[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParameters(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter]]
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.docdb.ClusterParameterGroupParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
