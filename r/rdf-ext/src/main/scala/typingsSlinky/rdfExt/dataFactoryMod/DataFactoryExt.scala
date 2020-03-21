package typingsSlinky.rdfExt.dataFactoryMod

import typingsSlinky.rdfExt.quadMod.QuadExt
import typingsSlinky.rdfExt.variableMod.VariableExt
import typingsSlinky.rdfJs.mod.DataFactory
import typingsSlinky.rdfJs.mod.QuadGraph
import typingsSlinky.rdfJs.mod.QuadObject
import typingsSlinky.rdfJs.mod.QuadPredicate
import typingsSlinky.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFactoryExt extends DataFactory[QuadExt] {
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  @JSName("variable")
  def variable_MDataFactoryExt(value: String): VariableExt = js.native
}

