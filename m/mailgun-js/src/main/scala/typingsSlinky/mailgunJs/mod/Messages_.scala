package typingsSlinky.mailgunJs.mod

import typingsSlinky.mailgunJs.mod.messages.BatchData
import typingsSlinky.mailgunJs.mod.messages.SendData
import typingsSlinky.mailgunJs.mod.messages.SendResponse
import typingsSlinky.mailgunJs.mod.messages.SendTemplateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messages_ extends js.Object {
  
  def send(data: BatchData): js.Promise[SendResponse] = js.native
  def send(data: BatchData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
  def send(data: SendData): js.Promise[SendResponse] = js.native
  def send(data: SendData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
  def send(data: SendTemplateData): js.Promise[SendResponse] = js.native
  def send(data: SendTemplateData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
}
