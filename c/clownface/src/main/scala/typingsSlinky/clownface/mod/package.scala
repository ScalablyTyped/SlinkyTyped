package typingsSlinky.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddCallback[D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */, X /* <: typingsSlinky.rdfJs.mod.Term */] = js.Function1[/* added */ typingsSlinky.clownface.mod.SingleContextClownface[D, X], scala.Unit]
  type ClownfaceInitWithNodes[D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */, T /* <: typingsSlinky.rdfJs.mod.Term */] = ((typingsSlinky.clownface.mod.ClownfaceInit[D, typingsSlinky.rdfJs.mod.Term]) with typingsSlinky.clownface.mod.WithTerms[T]) | ((typingsSlinky.clownface.mod.ClownfaceInit[D, typingsSlinky.rdfJs.mod.Term]) with typingsSlinky.clownface.mod.WithValues)
  type ClownfaceInitWithSingleNode[D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */, T /* <: typingsSlinky.rdfJs.mod.Term */] = ((typingsSlinky.clownface.mod.ClownfaceInit[D, typingsSlinky.rdfJs.mod.Term]) with typingsSlinky.clownface.mod.WithSingleTerm[T]) | ((typingsSlinky.clownface.mod.ClownfaceInit[D, typingsSlinky.rdfJs.mod.Term]) with typingsSlinky.clownface.mod.WithSingleValue)
  type SingleOrArray[T] = T | js.Array[T]
  type SingleOrArrayOfTerms = typingsSlinky.clownface.mod.SingleOrArray[typingsSlinky.clownface.mod.TermOrClownface]
  type SingleOrArrayOfTermsOrLiterals = typingsSlinky.clownface.mod.SingleOrArray[typingsSlinky.clownface.mod.TermOrLiteral]
  type SingleOrOneElementArray[T] = T | js.Array[T]
  type TermOrClownface = (typingsSlinky.clownface.mod.Clownface[
    typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad], 
    typingsSlinky.rdfJs.mod.Term
  ]) | typingsSlinky.rdfJs.mod.Term
  type TermOrLiteral = typingsSlinky.clownface.mod.TermOrClownface | java.lang.String | scala.Double | scala.Boolean
}
