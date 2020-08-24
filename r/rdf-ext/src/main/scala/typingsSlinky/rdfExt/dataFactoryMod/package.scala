package typingsSlinky.rdfExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataFactoryMod {
  // tslint:disable-next-line no-unnecessary-class
  type DataFactoryExt = typingsSlinky.rdfJs.mod.DataFactory[typingsSlinky.rdfExt.quadMod.QuadExt, typingsSlinky.rdfJs.mod.Quad]
  type Prefixes = typingsSlinky.rdfExt.prefixMapMod.^  | typingsSlinky.rdfExt.dataFactoryMod.PrefixesRecord
  type PrefixesRecord = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.rdfJs.mod.NamedNode[java.lang.String] | java.lang.String
  ]
}
