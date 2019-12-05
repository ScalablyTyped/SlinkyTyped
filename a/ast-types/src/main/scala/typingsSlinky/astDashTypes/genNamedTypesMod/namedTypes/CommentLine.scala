package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.CommentLine
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentLine")
@js.native
object CommentLine extends TopLevel[Type[CommentLine]]

