package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.elasticbeanstalk.ConfigurationTemplateSetting
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationTemplateMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate")
  @js.native
  class ConfigurationTemplate protected () extends CustomResource {
    /**
      * Create a ConfigurationTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationTemplateArgs) = this()
    def this(name: String, args: ConfigurationTemplateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * name of the application to associate with this configuration template
      */
    val application: Output_[String] = js.native
    
    /**
      * Short description of the Template
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the environment used with this configuration template
      */
    val environmentId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A unique name for this Template.
      */
    val name: Output_[String] = js.native
    
    /**
      * Option settings to configure the new Environment. These
      * override specific values that are set as defaults. The format is detailed
      * below in Option Settings
      */
    val settings: Output_[js.Array[ConfigurationTemplateSetting]] = js.native
    
    /**
      * A solution stack to base your Template
      * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
      */
    val solutionStackName: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object ConfigurationTemplate {
    
    /**
      * Get an existing ConfigurationTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID]): ConfigurationTemplate = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ConfigurationTemplate = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState): ConfigurationTemplate = js.native
    @JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationTemplateState, opts: CustomResourceOptions): ConfigurationTemplate = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticbeanstalk/configurationTemplate", "ConfigurationTemplate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/configurationTemplate.ConfigurationTemplate */ Boolean = js.native
  }
  
  @js.native
  trait ConfigurationTemplateArgs extends StObject {
    
    /**
      * name of the application to associate with this configuration template
      */
    val application: Input[String] = js.native
    
    /**
      * Short description of the Template
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the environment used with this configuration template
      */
    val environmentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A unique name for this Template.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Option settings to configure the new Environment. These
      * override specific values that are set as defaults. The format is detailed
      * below in Option Settings
      */
    val settings: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting]
          ]
        ]
      ] = js.native
    
    /**
      * A solution stack to base your Template
      * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
      */
    val solutionStackName: js.UndefOr[Input[String]] = js.native
  }
  object ConfigurationTemplateArgs {
    
    @scala.inline
    def apply(application: Input[String]): ConfigurationTemplateArgs = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationTemplateArgs]
    }
    
    @scala.inline
    implicit class ConfigurationTemplateArgsMutableBuilder[Self <: ConfigurationTemplateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Input[String]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnvironmentId(value: Input[String]): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSettings(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting]
              ]
            ]
      ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting]*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setSolutionStackName(value: Input[String]): Self = StObject.set(x, "solutionStackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionStackNameUndefined: Self = StObject.set(x, "solutionStackName", js.undefined)
    }
  }
  
  @js.native
  trait ConfigurationTemplateState extends StObject {
    
    /**
      * name of the application to associate with this configuration template
      */
    val application: js.UndefOr[Input[String]] = js.native
    
    /**
      * Short description of the Template
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the environment used with this configuration template
      */
    val environmentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A unique name for this Template.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Option settings to configure the new Environment. These
      * override specific values that are set as defaults. The format is detailed
      * below in Option Settings
      */
    val settings: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting]
          ]
        ]
      ] = js.native
    
    /**
      * A solution stack to base your Template
      * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
      */
    val solutionStackName: js.UndefOr[Input[String]] = js.native
  }
  object ConfigurationTemplateState {
    
    @scala.inline
    def apply(): ConfigurationTemplateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationTemplateState]
    }
    
    @scala.inline
    implicit class ConfigurationTemplateStateMutableBuilder[Self <: ConfigurationTemplateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Input[String]): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnvironmentId(value: Input[String]): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSettings(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting]
              ]
            ]
      ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting]*): Self = StObject.set(x, "settings", js.Array(value :_*))
      
      @scala.inline
      def setSolutionStackName(value: Input[String]): Self = StObject.set(x, "solutionStackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionStackNameUndefined: Self = StObject.set(x, "solutionStackName", js.undefined)
    }
  }
}
