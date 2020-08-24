package typingsSlinky.rdflib

import typingsSlinky.rdflib.anon.Flags
import typingsSlinky.rdflib.tfTypesMod.BlankNode
import typingsSlinky.rdflib.tfTypesMod.NamedNode
import typingsSlinky.rdflib.typesMod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/serialize", JSImport.Namespace)
@js.native
object serializeMod extends js.Object {
  def default(
    /** The graph or nodes that should be serialized */
  target: typingsSlinky.rdflib.formulaMod.default | NamedNode | BlankNode,
    /** The store */
  kb: js.UndefOr[typingsSlinky.rdflib.storeMod.default],
    base: js.UndefOr[js.Any],
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: js.UndefOr[String | ContentType],
    callback: js.UndefOr[
      js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[String | Null], _]
    ],
    options: js.UndefOr[Flags]
  ): js.UndefOr[String] = js.native
}

