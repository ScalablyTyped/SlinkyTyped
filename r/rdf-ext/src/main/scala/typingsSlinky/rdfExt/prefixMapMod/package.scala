package typingsSlinky.rdfExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object prefixMapMod {
  
  type Prefixes = typingsSlinky.rdfExt.prefixMapMod.PrefixMap | typingsSlinky.rdfExt.prefixMapMod.PrefixesRecord
  
  type PrefixesRecord = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.rdfJs.mod.NamedNode[java.lang.String] | java.lang.String
  ]
}
