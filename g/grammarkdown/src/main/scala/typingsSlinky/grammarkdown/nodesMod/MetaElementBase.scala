package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.MetaElementKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected () extends SourceElementBase[TKind] {
  def this(kind: TKind, atToken: Token[AtToken]) = this()
  
  val atToken: Token[AtToken] = js.native
}
