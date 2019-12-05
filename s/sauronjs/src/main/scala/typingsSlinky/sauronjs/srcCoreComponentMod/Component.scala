package typingsSlinky.sauronjs.srcCoreComponentMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  var broadcastSubject: js.Any = js.native
  var element: HTMLElement = js.native
  var state: js.UndefOr[js.Any] = js.native
  def attr(key: String): String = js.native
  def attr(key: String, value: String): Unit = js.native
  def broadcast(event: String): Unit = js.native
  def broadcast(event: String, data: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def find(selector: String): HTMLElement = js.native
  def findAll(selector: String): NodeListOf[HTMLElement with Node] = js.native
  def registerSubscription(
    subscriptions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subscription */ _
    ]
  ): Unit = js.native
  def subscribe(
    observables: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
    ]
  ): Unit = js.native
}

