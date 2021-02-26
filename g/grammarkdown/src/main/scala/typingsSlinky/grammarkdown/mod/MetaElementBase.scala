package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.MetaElementKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected ()
  extends typingsSlinky.grammarkdown.nodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken]) = this()
}
