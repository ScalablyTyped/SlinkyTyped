package typingsSlinky.parse.parseMod

import typingsSlinky.parse.Parse.Push.PushData
import typingsSlinky.parse.Parse.Push.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in Parse
  * @name Parse.Push
  * @namespace
  */
@JSImport("parse", "Push")
@js.native
object Push extends js.Object {
  def send[T](data: PushData): js.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
}

