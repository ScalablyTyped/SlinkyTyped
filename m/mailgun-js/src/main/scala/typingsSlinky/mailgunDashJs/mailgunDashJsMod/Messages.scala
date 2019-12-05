package typingsSlinky.mailgunDashJs.mailgunDashJsMod

import typingsSlinky.mailgunDashJs.mailgunDashJsMod.messages.BatchData
import typingsSlinky.mailgunDashJs.mailgunDashJsMod.messages.SendData
import typingsSlinky.mailgunDashJs.mailgunDashJsMod.messages.SendResponse
import typingsSlinky.mailgunDashJs.mailgunDashJsMod.messages.SendTemplateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  def send(data: SendData | SendTemplateData): js.Promise[SendResponse] = js.native
  def send(
    data: SendData | SendTemplateData,
    callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]
  ): js.Promise[SendResponse] = js.native
  def send(data: BatchData): js.Promise[SendResponse] = js.native
  def send(data: BatchData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
}

