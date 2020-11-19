package typingsSlinky.hasha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AlgorithmName = typingsSlinky.typeFest.literalUnionMod.LiteralUnion[
    typingsSlinky.hasha.hashaStrings.md5 | typingsSlinky.hasha.hashaStrings.sha1 | typingsSlinky.hasha.hashaStrings.sha256 | typingsSlinky.hasha.hashaStrings.sha512, 
    java.lang.String
  ]
  
  type HashaInput = typingsSlinky.node.Buffer | java.lang.String | (js.Array[typingsSlinky.node.Buffer | java.lang.String])
}
