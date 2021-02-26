package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.LexicalSymbolKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "LexicalSymbolBase")
@js.native
abstract class LexicalSymbolBase[TKind /* <: LexicalSymbolKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
}
