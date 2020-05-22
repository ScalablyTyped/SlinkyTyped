package typingsSlinky.rdflib

import typingsSlinky.rdflib.anon.Fetcher
import typingsSlinky.rdflib.tfTypesMod.Quad
import typingsSlinky.rdflib.tfTypesMod.QuadGraph
import typingsSlinky.rdflib.tfTypesMod.QuadObject
import typingsSlinky.rdflib.tfTypesMod.QuadPredicate
import typingsSlinky.rdflib.tfTypesMod.QuadSubject
import typingsSlinky.rdflib.tfTypesMod.RdfJsDataFactory
import typingsSlinky.rdflib.tfTypesMod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val appliedFactoryMethods: js.Array[String] = js.native
  @JSName("AJAR_handleNewTerm")
  def AJARHandleNewTerm(kb: Fetcher, p: js.Any, requestedBy: js.Any): js.Any = js.native
  def ArrayIndexOf(arr: js.Any, item: js.Any): Double = js.native
  def ArrayIndexOf(arr: js.Any, item: js.Any, i: Double): Double = js.native
  def arrayToStatements(rdfFactory: RdfJsDataFactory, subject: QuadSubject, data: js.Array[Term]): js.Array[Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]] = js.native
}

