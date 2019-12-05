package typingsSlinky.avoscloudDashSdk.leanengineMod

import typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Push.PushData
import typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Push.SendOptions
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
  def send[T](data: PushData): typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T] = js.native
}

