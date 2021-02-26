package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.distributionMod.DistributionArgs
import typingsSlinky.pulumiAws.distributionMod.DistributionState
import typingsSlinky.pulumiAws.getDistributionMod.GetDistributionArgs
import typingsSlinky.pulumiAws.getDistributionMod.GetDistributionResult
import typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentityArgs
import typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentityState
import typingsSlinky.pulumiAws.publicKeyMod.PublicKeyArgs
import typingsSlinky.pulumiAws.publicKeyMod.PublicKeyState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfront {
  
  @JSImport("@pulumi/aws", "cloudfront.Distribution")
  @js.native
  class Distribution protected ()
    extends typingsSlinky.pulumiAws.cloudfrontMod.Distribution {
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
  /* static members */
  object Distribution {
    
    /**
      * Get an existing Distribution resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cloudfront.Distribution.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    @JSImport("@pulumi/aws", "cloudfront.Distribution.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    @JSImport("@pulumi/aws", "cloudfront.Distribution.get")
    @js.native
    def get(name: String, id: Input[ID], state: DistributionState): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    @JSImport("@pulumi/aws", "cloudfront.Distribution.get")
    @js.native
    def get(name: String, id: Input[ID], state: DistributionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.distributionMod.Distribution = js.native
    
    /**
      * Returns true if the given object is an instance of Distribution.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cloudfront.Distribution.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/distribution.Distribution */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity")
  @js.native
  class OriginAccessIdentity protected ()
    extends typingsSlinky.pulumiAws.cloudfrontMod.OriginAccessIdentity {
    /**
      * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OriginAccessIdentityArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object OriginAccessIdentity {
    
    /**
      * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.originAccessIdentityMod.OriginAccessIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cloudfront.OriginAccessIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cloudfront.PublicKey")
  @js.native
  class PublicKey protected ()
    extends typingsSlinky.pulumiAws.cloudfrontMod.PublicKey {
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
  object PublicKey {
    
    /**
      * Get an existing PublicKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cloudfront.PublicKey.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    @JSImport("@pulumi/aws", "cloudfront.PublicKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    @JSImport("@pulumi/aws", "cloudfront.PublicKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicKeyState): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    @JSImport("@pulumi/aws", "cloudfront.PublicKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicKeyMod.PublicKey = js.native
    
    /**
      * Returns true if the given object is an instance of PublicKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cloudfront.PublicKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cloudfront.getDistribution")
  @js.native
  def getDistribution(args: GetDistributionArgs): js.Promise[GetDistributionResult] = js.native
  @JSImport("@pulumi/aws", "cloudfront.getDistribution")
  @js.native
  def getDistribution(args: GetDistributionArgs, opts: InvokeOptions): js.Promise[GetDistributionResult] = js.native
}
