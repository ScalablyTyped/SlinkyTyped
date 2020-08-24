package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getRegexPatternSetMod.GetRegexPatternSetArgs
import typingsSlinky.pulumiAws.getRegexPatternSetMod.GetRegexPatternSetResult
import typingsSlinky.pulumiAws.wafv2GetIpSetMod.GetIpSetArgs
import typingsSlinky.pulumiAws.wafv2GetIpSetMod.GetIpSetResult
import typingsSlinky.pulumiAws.wafv2GetWebAclMod.GetWebAclArgs
import typingsSlinky.pulumiAws.wafv2GetWebAclMod.GetWebAclResult
import typingsSlinky.pulumiAws.wafv2IpSetMod.IpSetArgs
import typingsSlinky.pulumiAws.wafv2IpSetMod.IpSetState
import typingsSlinky.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSetArgs
import typingsSlinky.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSetState
import typingsSlinky.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociationArgs
import typingsSlinky.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociationState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafv2")
@js.native
object wafv2 extends js.Object {
  @js.native
  class IpSet protected ()
    extends typingsSlinky.pulumiAws.wafv2Mod.IpSet {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RegexPatternSet protected ()
    extends typingsSlinky.pulumiAws.wafv2Mod.RegexPatternSet {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class WebAclAssociation protected ()
    extends typingsSlinky.pulumiAws.wafv2Mod.WebAclAssociation {
    /**
      * Create a WebAclAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclAssociationArgs) = this()
    def this(name: String, args: WebAclAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getIpSet(args: GetIpSetArgs): js.Promise[GetIpSetResult] = js.native
  def getIpSet(args: GetIpSetArgs, opts: InvokeOptions): js.Promise[GetIpSetResult] = js.native
  def getRegexPatternSet(args: GetRegexPatternSetArgs): js.Promise[GetRegexPatternSetResult] = js.native
  def getRegexPatternSet(args: GetRegexPatternSetArgs, opts: InvokeOptions): js.Promise[GetRegexPatternSetResult] = js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
  /* static members */
  @js.native
  object IpSet extends js.Object {
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafv2IpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafv2IpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState): typingsSlinky.pulumiAws.wafv2IpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafv2IpSetMod.IpSet = js.native
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RegexPatternSet extends js.Object {
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typingsSlinky.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WebAclAssociation extends js.Object {
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState): typingsSlinky.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclAssociation.WebAclAssociation */ Boolean = js.native
  }
  
}

