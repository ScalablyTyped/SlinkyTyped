package typingsSlinky.atPulumiAws.cloudwatchMod

import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventRuleEventSubscription")
@js.native
class EventRuleEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription {
  def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsSlinky.atPulumiAws.cloudwatchEventRuleMod.EventRule,
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
    eventRuleOrSchedule: typingsSlinky.atPulumiAws.cloudwatchEventRuleMod.EventRule,
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
    eventRuleOrSchedule: typingsSlinky.atPulumiAws.cloudwatchEventRuleMod.EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

