package typingsSlinky.rdflib.mod

import typingsSlinky.rdflib.anon.Flags
import typingsSlinky.rdflib.formulaMod.default
import typingsSlinky.rdflib.typesMod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "serialize")
@js.native
object serialize extends js.Object {
  
  def apply(
    /** The graph or nodes that should be serialized */
  target: default | typingsSlinky.rdflib.tfTypesMod.NamedNode | typingsSlinky.rdflib.tfTypesMod.BlankNode,
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
