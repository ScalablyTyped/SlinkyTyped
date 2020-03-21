package typingsSlinky.rdfExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataFactoryMod {
  type Prefixes = typingsSlinky.rdfExt.prefixMapMod.^  | typingsSlinky.rdfExt.dataFactoryMod.PrefixesRecord
  type PrefixesRecord = typingsSlinky.std.Record[java.lang.String, typingsSlinky.rdfJs.mod.NamedNode | java.lang.String]
}
