package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketFlowable.mod.Flowable
import typingsSlinky.rsocketFlowable.mod.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responder[D, M] extends js.Object {
  /**
    * Fire and Forget interaction model of `ReactiveSocket`. The returned
    * Publisher resolves when the passed `payload` is successfully handled.
    */
  def fireAndForget(payload: Payload[D, M]): Unit = js.native
  /**
    * Metadata-Push interaction model of `ReactiveSocket`. The returned Publisher
    * resolves when the passed `payload` is successfully handled.
    */
  def metadataPush(payload: Payload[D, M]): Single[Unit] = js.native
  /**
    * Request-Channel interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestChannel(payloads: Flowable[Payload[D, M]]): Flowable[Payload[D, M]] = js.native
  /**
    * Request-Response interaction model of `ReactiveSocket`. The returned
    * Publisher resolves with the response.
    */
  def requestResponse(payload: Payload[D, M]): Single[Payload[D, M]] = js.native
  /**
    * Request-Stream interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestStream(payload: Payload[D, M]): Flowable[Payload[D, M]] = js.native
}

object Responder {
  @scala.inline
  def apply[D, M](
    fireAndForget: Payload[D, M] => Unit,
    metadataPush: Payload[D, M] => Single[Unit],
    requestChannel: Flowable[Payload[D, M]] => Flowable[Payload[D, M]],
    requestResponse: Payload[D, M] => Single[Payload[D, M]],
    requestStream: Payload[D, M] => Flowable[Payload[D, M]]
  ): Responder[D, M] = {
    val __obj = js.Dynamic.literal(fireAndForget = js.Any.fromFunction1(fireAndForget), metadataPush = js.Any.fromFunction1(metadataPush), requestChannel = js.Any.fromFunction1(requestChannel), requestResponse = js.Any.fromFunction1(requestResponse), requestStream = js.Any.fromFunction1(requestStream))
    __obj.asInstanceOf[Responder[D, M]]
  }
  @scala.inline
  implicit class ResponderOps[Self[d, m] <: Responder[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withFireAndForget(value: Payload[D, M] => Unit): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireAndForget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetadataPush(value: Payload[D, M] => Single[Unit]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataPush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestChannel(value: Flowable[Payload[D, M]] => Flowable[Payload[D, M]]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestChannel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestResponse(value: Payload[D, M] => Single[Payload[D, M]]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestStream(value: Payload[D, M] => Flowable[Payload[D, M]]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStream")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

