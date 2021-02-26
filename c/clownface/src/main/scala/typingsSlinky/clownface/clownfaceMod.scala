package typingsSlinky.clownface

import typingsSlinky.clownface.mod.AnyContext
import typingsSlinky.clownface.mod.AnyPointer
import typingsSlinky.clownface.mod.ClownfaceInit
import typingsSlinky.clownface.mod.ClownfaceInitWithTerms
import typingsSlinky.clownface.mod.ClownfaceInitWithValue
import typingsSlinky.clownface.mod.ClownfaceInitWithValues
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clownfaceMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("clownface/lib/Clownface", JSImport.Namespace)
  @js.native
  class ^[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] protected () extends AnyPointer[T, D] {
    def this(options: ClownfaceInit[D]) = this()
    def this(options: ClownfaceInitWithTerms[T | Term | js.Array[Term], D]) = this()
    def this(options: ClownfaceInitWithValue[D]) = this()
    def this(options: ClownfaceInitWithValues[D]) = this()
  }
  
  // tslint:disable-next-line no-unnecessary-class
  type ClownfaceImpl[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] = AnyPointer[T, D]
}
