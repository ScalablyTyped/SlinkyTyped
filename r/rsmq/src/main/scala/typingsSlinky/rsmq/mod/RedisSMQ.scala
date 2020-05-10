package typingsSlinky.rsmq.mod

import typingsSlinky.rsmq.rsmqNumbers.`0`
import typingsSlinky.rsmq.rsmqNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@js.native
trait RedisSMQ extends js.Object {
  def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit = js.native
  def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`] = js.native
  def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`] = js.native
  @JSName("createQueue")
  def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit = js.native
  def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit = js.native
  def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`] = js.native
  def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`] = js.native
  @JSName("deleteQueue")
  def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit = js.native
  def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
  def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
  def listQueues(cb: Callback[js.Array[String]]): Unit = js.native
  def listQueuesAsync(): js.Promise[js.Array[String]] = js.native
  def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
  def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
  def quit(): Unit = js.native
  def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
  def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
  def sendMessage(opts: SendMessageOptions, cb: Callback[Double]): Unit = js.native
  def sendMessageAsync(opts: SendMessageOptions): js.Promise[Double] = js.native
  def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
  def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
}

object RedisSMQ {
  @scala.inline
  def apply(
    changeMessageVisibility: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit,
    changeMessageVisibilityAsync: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`],
    createQueue: (CreateQueueOptions, Callback[`1`]) => Unit,
    createQueueAsync: CreateQueueOptions => js.Promise[`1`],
    deleteMessage: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit,
    deleteMessageAsync: DeleteMessageOptions => js.Promise[`0` | `1`],
    deleteQueue: (DeleteQueueOptions, Callback[`1`]) => Unit,
    deleteQueueAsync: DeleteQueueOptions => js.Promise[`1`],
    getQueueAttributes: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
    getQueueAttributesAsync: GetQueueAttributesOptions => js.Promise[QueueAttributes],
    listQueues: Callback[js.Array[String]] => Unit,
    listQueuesAsync: () => js.Promise[js.Array[String]],
    popMessage: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
    popMessageAsync: PopMessageOptions => js.Promise[QueueMessage | js.Object],
    quit: () => Unit,
    receiveMessage: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
    receiveMessageAsync: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object],
    sendMessage: (SendMessageOptions, Callback[Double]) => Unit,
    sendMessageAsync: SendMessageOptions => js.Promise[Double],
    setQueueAttributes: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
    setQueueAttributesAsync: SetQueueAttributesOptions => js.Promise[QueueAttributes]
  ): RedisSMQ = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), changeMessageVisibilityAsync = js.Any.fromFunction1(changeMessageVisibilityAsync), createQueue = js.Any.fromFunction2(createQueue), createQueueAsync = js.Any.fromFunction1(createQueueAsync), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteQueue = js.Any.fromFunction2(deleteQueue), deleteQueueAsync = js.Any.fromFunction1(deleteQueueAsync), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), getQueueAttributesAsync = js.Any.fromFunction1(getQueueAttributesAsync), listQueues = js.Any.fromFunction1(listQueues), listQueuesAsync = js.Any.fromFunction0(listQueuesAsync), popMessage = js.Any.fromFunction2(popMessage), popMessageAsync = js.Any.fromFunction1(popMessageAsync), quit = js.Any.fromFunction0(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), receiveMessageAsync = js.Any.fromFunction1(receiveMessageAsync), sendMessage = js.Any.fromFunction2(sendMessage), sendMessageAsync = js.Any.fromFunction1(sendMessageAsync), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes), setQueueAttributesAsync = js.Any.fromFunction1(setQueueAttributesAsync))
    __obj.asInstanceOf[RedisSMQ]
  }
  @scala.inline
  implicit class RedisSMQOps[Self <: RedisSMQ] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeMessageVisibility(value: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMessageVisibility")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChangeMessageVisibilityAsync(value: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeMessageVisibilityAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateQueue(value: (CreateQueueOptions, Callback[`1`]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQueue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateQueueAsync(value: CreateQueueOptions => js.Promise[`1`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQueueAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteMessage(value: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteMessageAsync(value: DeleteMessageOptions => js.Promise[`0` | `1`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteQueue(value: (DeleteQueueOptions, Callback[`1`]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteQueue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteQueueAsync(value: DeleteQueueOptions => js.Promise[`1`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteQueueAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQueueAttributes(value: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueueAttributes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetQueueAttributesAsync(value: GetQueueAttributesOptions => js.Promise[QueueAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueueAttributesAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListQueues(value: Callback[js.Array[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listQueues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListQueuesAsync(value: () => js.Promise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listQueuesAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopMessage(value: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPopMessageAsync(value: PopMessageOptions => js.Promise[QueueMessage | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReceiveMessage(value: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReceiveMessageAsync(value: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendMessage(value: (SendMessageOptions, Callback[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSendMessageAsync(value: SendMessageOptions => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetQueueAttributes(value: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQueueAttributes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetQueueAttributesAsync(value: SetQueueAttributesOptions => js.Promise[QueueAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQueueAttributesAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

