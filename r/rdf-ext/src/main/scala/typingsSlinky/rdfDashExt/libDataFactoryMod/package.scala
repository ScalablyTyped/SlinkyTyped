package typingsSlinky.rdfDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDataFactoryMod {
  import typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode
  import typingsSlinky.std.Record

  type Prefixes = typingsSlinky.rdfDashExt.libPrefixMapMod.^  | PrefixesRecord
  type PrefixesRecord = Record[String, NamedNode | String]
}
