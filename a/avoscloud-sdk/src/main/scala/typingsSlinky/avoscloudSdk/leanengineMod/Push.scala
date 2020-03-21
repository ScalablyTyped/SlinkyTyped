package typingsSlinky.avoscloudSdk.leanengineMod

import typingsSlinky.avoscloudSdk.mod.Push.PushData
import typingsSlinky.avoscloudSdk.mod.Push.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in AV
  * @name AV.Push
  * @namespace
  */
@JSImport("leanengine", "Push")
@js.native
object Push extends js.Object {
  def send[T](data: PushData): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
}

