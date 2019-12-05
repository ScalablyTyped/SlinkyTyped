package typingsSlinky.azureDashSb.azureDashSbMod.Azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ServiceBus {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models.Base
  import typingsSlinky.std.Partial

  type BrokerProperties = Partial[IBrokerProperties]
  type BrokerPropertiesResponse = IBrokerPropertiesResponse with Partial[IBrokerProperties]
  type CreateNotificationHubOptions = Partial[ICreateNotificationHubOptions]
  type CreateQueueOptions = Partial[IQueueOptions]
  type CreateRuleOptions = Partial[ICreateRuleOptions]
  type CreateSubscriptionOptions = Partial[ICreateSubscriptionOptions]
  type CreateTopicIfNotExistsOptions = Partial[ICreateTopicIfNotExistsOptions]
  type CreateTopicOptions = Partial[ICreateTopicOptions]
  type DateString = String
  type Dictionary[T] = StringDictionary[T]
  type Duration = String
  type ListNotificationHubsOptions = Partial[PaginationOptions]
  type ListQueuesOptions = Partial[PaginationOptions]
  type ListRulesOptions = Partial[PaginationOptions]
  type ListSubscriptionsOptions = Partial[PaginationOptions]
  type ListTopicsOptions = Partial[PaginationOptions]
  type MessageOrName = Message | String
  type ReceiveSubscriptionMessageOptions = ReceiveQueueMessageOptions
  type ResponseCallback = js.Function2[/* error */ js.Error | Null, /* response */ Response, Unit]
  type ResultAndResponseCallback = js.Function3[
    /* error */ js.Error | Null, 
    /* result */ Boolean | Base | js.Array[Base], 
    /* response */ Response, 
    Unit
  ]
  type TypedResultAndResponseCallback[T] = js.Function3[/* error */ js.Error | Null, /* result */ T, /* response */ Response, Unit]
}
