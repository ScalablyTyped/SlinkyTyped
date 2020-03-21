package typingsSlinky.pulumiAws.mod.dynamodb

import typingsSlinky.pulumiAws.dynamodbMixinsMod.TableEventHandler
import typingsSlinky.pulumiAws.dynamodbMixinsMod.TableEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dynamodb.TableEventSubscription")
@js.native
class TableEventSubscription protected ()
  extends typingsSlinky.pulumiAws.dynamodbMod.TableEventSubscription {
  def this(
    name: String,
    table: typingsSlinky.pulumiAws.tableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    table: typingsSlinky.pulumiAws.tableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

