package typingsSlinky.autobindDecorator

import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobind-decorator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val boundClass: ClassDecorator = js.native
  val boundMethod: MethodDecorator = js.native
  val default: ClassDecorator with MethodDecorator = js.native
}

