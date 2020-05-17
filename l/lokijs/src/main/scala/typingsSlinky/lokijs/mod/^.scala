package typingsSlinky.lokijs.mod

import typingsSlinky.lokijs.Loki
import typingsSlinky.lokijs.anon.PartialLokiConstructorOpt
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
class ^ protected () extends Loki {
  def this(filename: String) = this()
  def this(filename: String, options: PartialLokiConstructorOpt) = this()
}

@JSImport("lokijs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LokiOps: typingsSlinky.lokijs.LokiOps = js.native
}

