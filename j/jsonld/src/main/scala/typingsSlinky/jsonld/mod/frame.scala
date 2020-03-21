package typingsSlinky.jsonld.mod

import typingsSlinky.jsonld.jsonldSpecMod.Document
import typingsSlinky.jsonld.jsonldSpecMod.Frame
import typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "frame")
@js.native
object frame extends js.Object {
  def apply(input: Document, frame: Frame): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, frame: Frame, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, frame: Frame, options: typingsSlinky.jsonld.mod.Options.Frame): js.Promise[JsonLdObj] = js.native
  def apply(
    input: Document,
    frame: Frame,
    options: typingsSlinky.jsonld.mod.Options.Frame,
    callback: Callback[JsonLdObj]
  ): Unit = js.native
}

