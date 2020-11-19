package typingsSlinky.grammarkdown.nodesMod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SyntaxKind */] () extends Node[TKind]
