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

object domainPermissionsMod {
  
  @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions")
  @js.native
  class DomainPermissions protected () extends CustomResource {
    /**
      * Create a DomainPermissions resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPermissionsArgs) = this()
    def this(name: String, args: DomainPermissionsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: Output_[String] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: Output_[String] = js.native
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: Output_[String] = js.native
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: Output_[String] = js.native
    
    /**
      * The ARN of the resource associated with the resource policy.
      */
    val resourceArn: Output_[String] = js.native
  }
  /* static members */
  object DomainPermissions {
    
    /**
      * Get an existing DomainPermissions resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID]): DomainPermissions = js.native
    @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainPermissions = js.native
    @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPermissionsState): DomainPermissions = js.native
    @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPermissionsState, opts: CustomResourceOptions): DomainPermissions = js.native
    
    /**
      * Returns true if the given object is an instance of DomainPermissions.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codeartifact/domainPermissions", "DomainPermissions.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codeartifact/domainPermissions.DomainPermissions */ Boolean = js.native
  }
  
  @js.native
  trait DomainPermissionsArgs extends StObject {
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: Input[String] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: Input[String] = js.native
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: js.UndefOr[Input[String]] = js.native
  }
  object DomainPermissionsArgs {
    
    @scala.inline
    def apply(domain: Input[String], policyDocument: Input[String]): DomainPermissionsArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainPermissionsArgs]
    }
    
    @scala.inline
    implicit class DomainPermissionsArgsMutableBuilder[Self <: DomainPermissionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyRevision(value: Input[String]): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
    }
  }
  
  @js.native
  trait DomainPermissionsState extends StObject {
    
    /**
      * The name of the domain on which to set the resource policy.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The account number of the AWS account that owns the domain.
      */
    val domainOwner: js.UndefOr[Input[String]] = js.native
    
    /**
      * A JSON policy string to be set as the access control resource policy on the provided domain.
      */
    val policyDocument: js.UndefOr[Input[String]] = js.native
    
    /**
      * The current revision of the resource policy to be set. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy.
      */
    val policyRevision: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the resource associated with the resource policy.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
  }
  object DomainPermissionsState {
    
    @scala.inline
    def apply(): DomainPermissionsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainPermissionsState]
    }
    
    @scala.inline
    implicit class DomainPermissionsStateMutableBuilder[Self <: DomainPermissionsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwner(value: Input[String]): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setPolicyDocument(value: Input[String]): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
      
      @scala.inline
      def setPolicyRevision(value: Input[String]): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
