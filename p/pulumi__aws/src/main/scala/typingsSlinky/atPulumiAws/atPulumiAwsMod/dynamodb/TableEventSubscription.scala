package typingsSlinky.atPulumiAws.atPulumiAwsMod.dynamodb

import typingsSlinky.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventHandler
import typingsSlinky.atPulumiAws.dynamodbDynamodbMixinsMod.TableEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dynamodb.TableEventSubscription")
@js.native
class TableEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.dynamodbMod.TableEventSubscription {
  def this(
    name: String,
    table: typingsSlinky.atPulumiAws.dynamodbTableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    table: typingsSlinky.atPulumiAws.dynamodbTableMod.Table,
    handler: TableEventHandler,
    args: TableEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

