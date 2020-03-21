package typingsSlinky.pulumiAws.cloudwatchMod

import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventRuleEventSubscription")
@js.native
class EventRuleEventSubscription protected ()
  extends typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription {
  def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
    handler: EventRuleEventHandler
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

