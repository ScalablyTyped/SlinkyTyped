package typingsSlinky.htmlparser2.mod

import typingsSlinky.domhandler.mod.DomElement
import typingsSlinky.domhandler.mod.DomHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2", "DomHandler")
@js.native
class DomHandler protected ()
  extends typingsSlinky.domhandler.mod.DomHandler {
  def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
  def this(
    callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _],
    options: DomHandlerOptions
  ) = this()
}

