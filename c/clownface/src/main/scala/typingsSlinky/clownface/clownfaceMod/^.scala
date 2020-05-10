package typingsSlinky.clownface.clownfaceMod

import typingsSlinky.clownface.mod.AnyContext
import typingsSlinky.clownface.mod.Clownface
import typingsSlinky.clownface.mod.ClownfaceInit
import typingsSlinky.clownface.mod.ClownfaceInitWithTerms
import typingsSlinky.clownface.mod.ClownfaceInitWithValue
import typingsSlinky.clownface.mod.ClownfaceInitWithValues
import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */] protected () extends Clownface[T, D] {
  def this(options: ClownfaceInit[D]) = this()
  def this(options: ClownfaceInitWithTerms[T | Term | js.Array[Term], D]) = this()
  def this(options: ClownfaceInitWithValue[D]) = this()
  def this(options: ClownfaceInitWithValues[D]) = this()
}

