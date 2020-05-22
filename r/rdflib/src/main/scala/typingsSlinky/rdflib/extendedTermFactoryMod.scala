package typingsSlinky.rdflib

import typingsSlinky.rdflib.collectionMod.Collection
import typingsSlinky.rdflib.factoryTypesMod.DataFactory
import typingsSlinky.rdflib.factoryTypesMod.DefaultFactoryTypes
import typingsSlinky.rdflib.factoryTypesMod.Indexable
import typingsSlinky.rdflib.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/factories/extended-term-factory", JSImport.Namespace)
@js.native
object extendedTermFactoryMod extends js.Object {
  @js.native
  trait CollectionFactory extends DataFactory[DefaultFactoryTypes, Indexable] {
    def collection(elements: js.Array[ValueType]): typingsSlinky.rdflib.collectionMod.default[
        typingsSlinky.rdflib.nodeInternalMod.default | typingsSlinky.rdflib.blankNodeMod.default | Collection[_] | typingsSlinky.rdflib.literalMod.default | typingsSlinky.rdflib.variableMod.default
      ] = js.native
  }
  
  /**
    * Data factory which also supports Collections
    *
    * Necessary for preventing circular dependencies.
    */
  val default: CollectionFactory = js.native
}

