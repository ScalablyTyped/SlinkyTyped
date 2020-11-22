package typingsSlinky.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddCallback[D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */, X /* <: typingsSlinky.rdfJs.mod.Term */] = js.Function1[/* added */ typingsSlinky.clownface.mod.AnyPointer[X, D], scala.Unit]
  
  type AnyContext = js.UndefOr[typingsSlinky.rdfJs.mod.Term | js.Array[typingsSlinky.rdfJs.mod.Term]]
  
  type GraphPointer[T /* <: typingsSlinky.rdfJs.mod.Term */, D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */] = typingsSlinky.clownface.mod.AnyPointer[T, D]
  
  type Iteratee[T /* <: typingsSlinky.clownface.mod.AnyContext */, D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */] = typingsSlinky.clownface.mod.AnyPointer[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any) | T, 
    D
  ]
  
  type MultiPointer[T /* <: typingsSlinky.rdfJs.mod.Term */, D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */] = typingsSlinky.clownface.mod.AnyPointer[T | js.Array[T], D]
  
  type SingleOrArray[T] = T | js.Array[T]
  
  type SingleOrArrayOfTerms[X /* <: typingsSlinky.rdfJs.mod.Term */] = typingsSlinky.clownface.mod.SingleOrArray[X] | (typingsSlinky.clownface.mod.MultiPointer[
    X, 
    typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ])
  
  type SingleOrArrayOfTermsOrLiterals[X /* <: typingsSlinky.rdfJs.mod.Term */] = typingsSlinky.clownface.mod.SingleOrArray[typingsSlinky.clownface.mod.TermOrLiteral[X]]
  
  type SingleOrOneElementArray[T] = T | js.Array[T]
  
  type TermOrClownface[X /* <: typingsSlinky.rdfJs.mod.Term */] = (typingsSlinky.clownface.mod.MultiPointer[
    X, 
    typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ]) | X
  
  type TermOrLiteral[X /* <: typingsSlinky.rdfJs.mod.Term */] = typingsSlinky.clownface.mod.TermOrClownface[X] | java.lang.String | scala.Double | scala.Boolean
}
