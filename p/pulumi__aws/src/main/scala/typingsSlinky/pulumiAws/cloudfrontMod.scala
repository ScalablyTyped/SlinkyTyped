package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.distributionMod.DistributionArgs
import typingsSlinky.pulumiAws.distributionMod.DistributionState
import typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentityArgs
import typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentityState
import typingsSlinky.pulumiAws.publicKeyMod.PublicKeyArgs
import typingsSlinky.pulumiAws.publicKeyMod.PublicKeyState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront", JSImport.Namespace)
@js.native
object cloudfrontMod extends js.Object {
  @js.native
  class Distribution protected ()
    extends typingsSlinky.pulumiAws.distributionMod.Distribution {
    /**
      * Create a Distribution resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DistributionArgs) = this()
    def this(name: String, args: DistributionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OriginAccessIdentity protected ()
    extends typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity {
    /**
      * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OriginAccessIdentityArgs) = this()
    def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PublicKey protected ()
    extends typingsSlinky.pulumiAws.publicKeyMod.PublicKey {
    /**
      * Create a PublicKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublicKeyArgs) = this()
    def this(name: String, args: PublicKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Distribution extends js.Object {
    /**
      * Get an existing Distribution resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    def get(name: String, id: Input[ID], state: DistributionState): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    def get(name: String, id: Input[ID], state: DistributionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    /**
      * Returns true if the given object is an instance of Distribution.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OriginAccessIdentity extends js.Object {
    /**
      * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    /**
      * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PublicKey extends js.Object {
    /**
      * Get an existing PublicKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    def get(name: String, id: Input[ID], state: PublicKeyState): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    /**
      * Returns true if the given object is an instance of PublicKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = js.native
  }
  
}

