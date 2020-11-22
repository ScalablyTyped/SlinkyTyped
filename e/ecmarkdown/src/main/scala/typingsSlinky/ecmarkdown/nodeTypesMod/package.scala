package typingsSlinky.ecmarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nodeTypesMod {
  
  type ActualOmit[T, K /* <: java.lang.String */] = typingsSlinky.std.Omit[T, K]
  
  /* Inlined std.Exclude<ecmarkdown.ecmarkdown/dist/node-types.Token, ecmarkdown.ecmarkdown/dist/node-types.EOFToken> */
  type NotEOFToken = typingsSlinky.ecmarkdown.ecmarkdownStrings.contents
  
  type Unlocated[T /* <: typingsSlinky.ecmarkdown.anon.Location */] = typingsSlinky.ecmarkdown.nodeTypesMod.ActualOmit[T, typingsSlinky.ecmarkdown.ecmarkdownStrings.location]
}
