package typingsSlinky.rdflib

import typingsSlinky.rdflib.factoryTypesMod.DataFactory
import typingsSlinky.rdflib.factoryTypesMod.DefaultFactoryTypes
import typingsSlinky.rdflib.factoryTypesMod.Indexable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/factories/canonical-data-factory", JSImport.Namespace)
@js.native
object canonicalDataFactoryMod extends js.Object {
  /** A basic internal RDFlib datafactory, which does not support Collections  */
  val default: DataFactory[DefaultFactoryTypes, Indexable] = js.native
  val defaultGraphURI: /* "chrome:theSession" */ String = js.native
}

