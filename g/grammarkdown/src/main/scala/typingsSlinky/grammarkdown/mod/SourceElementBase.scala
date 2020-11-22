package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SourceElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SourceElementKind */] ()
  extends typingsSlinky.grammarkdown.nodesMod.Node[TKind]
