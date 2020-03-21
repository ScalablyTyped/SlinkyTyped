package typingsSlinky.firebaseMessaging

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.notificationclick
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.push
import typingsSlinky.firebaseMessaging.firebaseMessagingStrings.pushsubscriptionchange
import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerGlobalScope extends js.Object {
  val clients: Clients = js.native
  val location: WorkerLocation = js.native
  val registration: ServiceWorkerRegistration = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(`type`: push, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushsubscriptionchange(
    `type`: pushsubscriptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushsubscriptionchange(
    `type`: pushsubscriptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pushsubscriptionchange(
    `type`: pushsubscriptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushSubscriptionChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

