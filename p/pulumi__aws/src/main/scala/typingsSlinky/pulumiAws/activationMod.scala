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

object activationMod {
  
  @JSImport("@pulumi/aws/ssm/activation", "Activation")
  @js.native
  class Activation protected () extends CustomResource {
    /**
      * Create a Activation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActivationArgs) = this()
    def this(name: String, args: ActivationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The code the system generates when it processes the activation.
      */
    val activationCode: Output_[String] = js.native
    
    /**
      * The description of the resource that you want to register.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
      */
    val expirationDate: Output_[String] = js.native
    
    /**
      * If the current activation has expired.
      */
    val expired: Output_[Boolean] = js.native
    
    /**
      * The IAM Role to attach to the managed instance.
      */
    val iamRole: Output_[String] = js.native
    
    /**
      * The default name of the registered managed instance.
      */
    val name: Output_[String] = js.native
    
    /**
      * The number of managed instances that are currently registered using this activation.
      */
    val registrationCount: Output_[Double] = js.native
    
    /**
      * The maximum number of managed instances you want to register. The default value is 1 instance.
      */
    val registrationLimit: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Activation {
    
    /**
      * Get an existing Activation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/activation", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID]): Activation = js.native
    @JSImport("@pulumi/aws/ssm/activation", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Activation = js.native
    @JSImport("@pulumi/aws/ssm/activation", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivationState): Activation = js.native
    @JSImport("@pulumi/aws/ssm/activation", "Activation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivationState, opts: CustomResourceOptions): Activation = js.native
    
    /**
      * Returns true if the given object is an instance of Activation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/activation", "Activation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/activation.Activation */ Boolean = js.native
  }
  
  @js.native
  trait ActivationArgs extends StObject {
    
    /**
      * The description of the resource that you want to register.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
      */
    val expirationDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM Role to attach to the managed instance.
      */
    val iamRole: Input[String] = js.native
    
    /**
      * The default name of the registered managed instance.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum number of managed instances you want to register. The default value is 1 instance.
      */
    val registrationLimit: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ActivationArgs {
    
    @scala.inline
    def apply(iamRole: Input[String]): ActivationArgs = {
      val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivationArgs]
    }
    
    @scala.inline
    implicit class ActivationArgsMutableBuilder[Self <: ActivationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Input[String]): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setIamRole(value: Input[String]): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegistrationLimit(value: Input[Double]): Self = StObject.set(x, "registrationLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationLimitUndefined: Self = StObject.set(x, "registrationLimit", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ActivationState extends StObject {
    
    /**
      * The code the system generates when it processes the activation.
      */
    val activationCode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the resource that you want to register.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
      */
    val expirationDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * If the current activation has expired.
      */
    val expired: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The IAM Role to attach to the managed instance.
      */
    val iamRole: js.UndefOr[Input[String]] = js.native
    
    /**
      * The default name of the registered managed instance.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The number of managed instances that are currently registered using this activation.
      */
    val registrationCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The maximum number of managed instances you want to register. The default value is 1 instance.
      */
    val registrationLimit: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A map of tags to assign to the object.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ActivationState {
    
    @scala.inline
    def apply(): ActivationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivationState]
    }
    
    @scala.inline
    implicit class ActivationStateMutableBuilder[Self <: ActivationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivationCode(value: Input[String]): Self = StObject.set(x, "activationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationCodeUndefined: Self = StObject.set(x, "activationCode", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Input[String]): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setExpired(value: Input[Boolean]): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      @scala.inline
      def setIamRole(value: Input[String]): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoleUndefined: Self = StObject.set(x, "iamRole", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRegistrationCount(value: Input[Double]): Self = StObject.set(x, "registrationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationCountUndefined: Self = StObject.set(x, "registrationCount", js.undefined)
      
      @scala.inline
      def setRegistrationLimit(value: Input[Double]): Self = StObject.set(x, "registrationLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationLimitUndefined: Self = StObject.set(x, "registrationLimit", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
