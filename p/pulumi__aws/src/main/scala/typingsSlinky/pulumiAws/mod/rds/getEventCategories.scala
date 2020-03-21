package typingsSlinky.pulumiAws.mod.rds

import typingsSlinky.pulumiAws.getEventCategoriesMod.GetEventCategoriesArgs
import typingsSlinky.pulumiAws.getEventCategoriesMod.GetEventCategoriesResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.getEventCategories")
@js.native
object getEventCategories extends js.Object {
  def apply(): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def apply(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def apply(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
}

