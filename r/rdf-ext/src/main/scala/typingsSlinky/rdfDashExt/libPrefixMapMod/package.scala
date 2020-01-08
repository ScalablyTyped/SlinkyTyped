package typingsSlinky.rdfDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPrefixMapMod {
  import typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode
  import typingsSlinky.std.Record

  type Prefixes = PrefixMap | PrefixesRecord
  type PrefixesRecord = Record[String, NamedNode | String]
}
