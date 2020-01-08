package typingsSlinky.atPulumiAws.atPulumiAwsMod.wafregional

import typingsSlinky.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs
import typingsSlinky.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSetState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet")
@js.native
class SqlInjectionMatchSet protected ()
  extends typingsSlinky.atPulumiAws.wafregionalMod.SqlInjectionMatchSet {
  /**
    * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SqlInjectionMatchSetArgs) = this()
  def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet")
@js.native
object SqlInjectionMatchSet extends js.Object {
  /**
    * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
  def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): typingsSlinky.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
  def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
  /**
    * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
}

