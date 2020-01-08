package typingsSlinky.atPulumiAws.rdsMod

import typingsSlinky.atPulumiAws.rdsGetEventCategoriesMod.GetEventCategoriesArgs
import typingsSlinky.atPulumiAws.rdsGetEventCategoriesMod.GetEventCategoriesResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "getEventCategories")
@js.native
object getEventCategories extends js.Object {
  def apply(): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def apply(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def apply(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
}

