package typingsSlinky.lokijs.mod

import typingsSlinky.lokijs.LokiConstructor
import typingsSlinky.lokijs.PartialLokiConstructorOptAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
@JSImport("lokijs", JSImport.Namespace)
@js.native
class ^ protected () extends LokiConstructor {
  def this(filename: String) = this()
  def this(filename: String, options: PartialLokiConstructorOptAdapter) = this()
}

@JSImport("lokijs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LokiOps: typingsSlinky.lokijs.LokiOps = js.native
}

