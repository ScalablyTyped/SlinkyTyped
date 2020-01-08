package typingsSlinky.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clownfaceMod {
  import typingsSlinky.clownface.Anon_Graph
  import typingsSlinky.clownface.clownfaceStrings._context
  import typingsSlinky.clownface.clownfaceStrings.dataset
  import typingsSlinky.rdfDashJs.rdfDashJsMod.DatasetCore
  import typingsSlinky.rdfDashJs.rdfDashJsMod.Quad
  import typingsSlinky.rdfDashJs.rdfDashJsMod.Term
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type AddCallback[D /* <: DatasetCore[Quad] */, X /* <: Term */] = js.Function1[/* added */ SingleContextClownface[D, X], Unit]
  type ClownfaceInit[D /* <: DatasetCore[Quad] */, T /* <: Term */] = Partial[(Pick[Clownface[D, T], dataset | _context]) with Anon_Graph]
  type SingleOrArray[T] = T | js.Array[T]
  type SingleOrArrayOfTerms = SingleOrArray[TermOrClownface]
  type SingleOrArrayOfTermsOrLiterals = SingleOrArray[TermOrLiteral]
  type SingleOrOneElementArray[T] = T | js.Array[T]
  type TermOrClownface = (Clownface[DatasetCore[Quad], Term]) | Term
  type TermOrLiteral = TermOrClownface | String | Double | Boolean
}
