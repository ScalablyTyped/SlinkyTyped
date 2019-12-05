package typingsSlinky.parse.nodeMod

import typingsSlinky.parse.Parse.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Config")
@js.native
class Config[T /* <: js.Any */] ()
  extends typingsSlinky.parse.Parse.Config[T]

/* static members */
@JSImport("parse/node", "Config")
@js.native
object Config extends js.Object {
  def current(): typingsSlinky.parse.Parse.Config[_] = js.native
  def get(): js.Promise[typingsSlinky.parse.Parse.Config[_]] = js.native
  def get(options: SuccessFailureOptions): js.Promise[typingsSlinky.parse.Parse.Config[_]] = js.native
  def save(attr: js.Any): js.Promise[typingsSlinky.parse.Parse.Config[_]] = js.native
}

