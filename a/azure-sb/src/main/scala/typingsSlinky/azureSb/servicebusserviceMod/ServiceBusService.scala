package typingsSlinky.azureSb.servicebusserviceMod

import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateNotificationHubOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateQueueOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateRuleOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateSubscriptionOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateTopicIfNotExistsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.CreateTopicOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListQueuesOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListRulesOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListSubscriptionsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ListTopicsOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Message
import typingsSlinky.azureSb.mod.Azure.ServiceBus.MessageOrName
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ReceiveQueueMessageOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ReceiveSubscriptionMessageOptions
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ResponseCallback
import typingsSlinky.azureSb.mod.Azure.ServiceBus.ResultAndResponseCallback
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.Queue
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.Rule
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.Subscription
import typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models.Topic
import typingsSlinky.azureSb.mod.Azure.ServiceBus.TypedResultAndResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceBusService
  extends typingsSlinky.azureSb.servicebusservicebaseMod.^ {
  
  /*
    * NotificationHub functions
    */
  def createNotificationHub(hubPath: String, callback: ResultAndResponseCallback): Unit = js.native
  def createNotificationHub(hubPath: String, options: CreateNotificationHubOptions, callback: ResultAndResponseCallback): Unit = js.native
  
  /*
    * Queue Management functions
    */
  def createQueue(queuePath: String, callback: TypedResultAndResponseCallback[Queue]): Unit = js.native
  def createQueue(queuePath: String, options: CreateQueueOptions, callback: TypedResultAndResponseCallback[Queue]): Unit = js.native
  
  def createQueueIfNotExists(queuePath: String, callback: TypedResultAndResponseCallback[Boolean]): Unit = js.native
  def createQueueIfNotExists(queuePath: String, options: CreateQueueOptions, callback: TypedResultAndResponseCallback[Boolean]): Unit = js.native
  
  /*
    * Rule functions
    */
  def createRule(
    topicPath: String,
    subscriptionPath: String,
    rulePath: String,
    callback: TypedResultAndResponseCallback[Rule]
  ): Unit = js.native
  def createRule(
    topicPath: String,
    subscriptionPath: String,
    rulePath: String,
    options: CreateRuleOptions,
    callback: TypedResultAndResponseCallback[Rule]
  ): Unit = js.native
  
  /*
    * Subscription functions
    */
  def createSubscription(
    topicPath: String,
    subscriptionPath: String,
    callback: TypedResultAndResponseCallback[Subscription]
  ): Unit = js.native
  def createSubscription(
    topicPath: String,
    subscriptionPath: String,
    options: CreateSubscriptionOptions,
    callback: TypedResultAndResponseCallback[Subscription]
  ): Unit = js.native
  
  /*
    * Topic Management functions
    */
  def createTopic(topicPath: String, callback: TypedResultAndResponseCallback[Topic]): Unit = js.native
  def createTopic(topicPath: String, options: CreateTopicOptions, callback: TypedResultAndResponseCallback[Topic]): Unit = js.native
  
  def createTopicIfNotExists(topicPath: String, callback: TypedResultAndResponseCallback[Boolean]): Unit = js.native
  def createTopicIfNotExists(
    topicPath: String,
    options: CreateTopicIfNotExistsOptions,
    callback: TypedResultAndResponseCallback[Boolean]
  ): Unit = js.native
  
  def deleteMessage(message: MessageOrName, callback: ResponseCallback): Unit = js.native
  
  def deleteNotificationHub(hubPath: String, callback: ResponseCallback): Unit = js.native
  
  def deleteQueue(queuePath: String, callback: ResponseCallback): Unit = js.native
  
  def deleteRule(topicPath: String, subscriptionPath: String, rulePath: String, callback: ResponseCallback): Unit = js.native
  
  def deleteSubscription(topicPath: String, subscriptionPath: String, callback: ResponseCallback): Unit = js.native
  
  def deleteTopic(topicPath: String, callback: ResponseCallback): Unit = js.native
  
  def getNotificationHub(hubPath: String, callback: ResultAndResponseCallback): Unit = js.native
  
  def getQueue(queuePath: String, callback: TypedResultAndResponseCallback[Queue]): Unit = js.native
  
  def getRule(
    topicPath: String,
    subscriptionPath: String,
    rulePath: String,
    callback: TypedResultAndResponseCallback[Rule]
  ): Unit = js.native
  
  def getSubscription(
    topicPath: String,
    subscriptionPath: String,
    callback: TypedResultAndResponseCallback[Subscription]
  ): Unit = js.native
  
  def getTopic(topicPath: String, callback: TypedResultAndResponseCallback[Topic]): Unit = js.native
  
  def listNotificationHubs(callback: ResultAndResponseCallback): Unit = js.native
  def listNotificationHubs(options: ListNotificationHubsOptions, callback: ResultAndResponseCallback): Unit = js.native
  
  def listQueues(callback: TypedResultAndResponseCallback[js.Array[Queue]]): Unit = js.native
  def listQueues(options: ListQueuesOptions, callback: TypedResultAndResponseCallback[js.Array[Queue]]): Unit = js.native
  
  def listRules(
    topicPath: String,
    subscriptionPath: String,
    callback: TypedResultAndResponseCallback[js.Array[Rule]]
  ): Unit = js.native
  def listRules(
    topicPath: String,
    subscriptionPath: String,
    options: ListRulesOptions,
    callback: TypedResultAndResponseCallback[js.Array[Rule]]
  ): Unit = js.native
  
  def listSubscriptions(topicPath: String, callback: TypedResultAndResponseCallback[js.Array[Subscription]]): Unit = js.native
  def listSubscriptions(
    topicPath: String,
    options: ListSubscriptionsOptions,
    callback: TypedResultAndResponseCallback[js.Array[Subscription]]
  ): Unit = js.native
  
  def listTopics(callback: TypedResultAndResponseCallback[js.Array[Topic]]): Unit = js.native
  def listTopics(options: ListTopicsOptions, callback: TypedResultAndResponseCallback[js.Array[Topic]]): Unit = js.native
  
  def receiveQueueMessage(queuePath: String, callback: TypedResultAndResponseCallback[Message]): Unit = js.native
  def receiveQueueMessage(
    queuePath: String,
    options: ReceiveQueueMessageOptions,
    callback: TypedResultAndResponseCallback[Message]
  ): Unit = js.native
  
  def receiveSubscriptionMessage(topicPath: String, subscriptionPath: String, callback: TypedResultAndResponseCallback[Message]): Unit = js.native
  def receiveSubscriptionMessage(
    topicPath: String,
    subscriptionPath: String,
    options: ReceiveSubscriptionMessageOptions,
    callback: TypedResultAndResponseCallback[Message]
  ): Unit = js.native
  
  def renewLockForMessage(message: MessageOrName, callback: ResponseCallback): Unit = js.native
  
  def sendQueueMessage(queuePath: String, message: MessageOrName, callback: ResponseCallback): Unit = js.native
  
  def sendTopicMessage(topicPath: String, message: MessageOrName, callback: ResponseCallback): Unit = js.native
  
  def unlockMessage(message: MessageOrName, callback: ResponseCallback): Unit = js.native
}
