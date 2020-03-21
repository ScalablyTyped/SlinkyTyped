package typingsSlinky.nodemailer.dkimMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DKIM extends js.Object {
  var keys: js.Array[SingleKeyOptions] = js.native
  var options: Options = js.native
  def sign(input: String): PassThrough = js.native
  def sign(input: String, extraOptions: Options): PassThrough = js.native
  def sign(input: Buffer): PassThrough = js.native
  def sign(input: Buffer, extraOptions: Options): PassThrough = js.native
  def sign(input: Readable): PassThrough = js.native
  def sign(input: Readable, extraOptions: Options): PassThrough = js.native
}

