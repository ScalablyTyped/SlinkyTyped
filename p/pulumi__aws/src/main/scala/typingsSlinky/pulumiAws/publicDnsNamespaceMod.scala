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

object publicDnsNamespaceMod {
  
  @JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace")
  @js.native
  class PublicDnsNamespace protected () extends CustomResource {
    /**
      * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PublicDnsNamespaceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PublicDnsNamespaceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN that Amazon Route 53 assigns to the namespace when you create it.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description that you specify for the namespace when you create it.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
      */
    val hostedZone: Output_[String] = js.native
    
    /**
      * The name of the namespace.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the namespace.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object PublicDnsNamespace {
    
    /**
      * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID]): PublicDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PublicDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState): PublicDnsNamespace = js.native
    @JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicDnsNamespaceState, opts: CustomResourceOptions): PublicDnsNamespace = js.native
    
    /**
      * Returns true if the given object is an instance of PublicDnsNamespace.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/publicDnsNamespace.PublicDnsNamespace */ Boolean = js.native
  }
  
  @js.native
  trait PublicDnsNamespaceArgs extends StObject {
    
    /**
      * The description that you specify for the namespace when you create it.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the namespace.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the namespace.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PublicDnsNamespaceArgs {
    
    @scala.inline
    def apply(): PublicDnsNamespaceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicDnsNamespaceArgs]
    }
    
    @scala.inline
    implicit class PublicDnsNamespaceArgsMutableBuilder[Self <: PublicDnsNamespaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
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
  trait PublicDnsNamespaceState extends StObject {
    
    /**
      * The ARN that Amazon Route 53 assigns to the namespace when you create it.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description that you specify for the namespace when you create it.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
      */
    val hostedZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the namespace.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the namespace.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PublicDnsNamespaceState {
    
    @scala.inline
    def apply(): PublicDnsNamespaceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicDnsNamespaceState]
    }
    
    @scala.inline
    implicit class PublicDnsNamespaceStateMutableBuilder[Self <: PublicDnsNamespaceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHostedZone(value: Input[String]): Self = StObject.set(x, "hostedZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneUndefined: Self = StObject.set(x, "hostedZone", js.undefined)
      
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
