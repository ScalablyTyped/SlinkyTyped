package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsLocTypeAnnotation
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAnnotationBuilder extends js.Object {
  
  def apply(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def apply(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  
  def from(params: CommentsLocTypeAnnotation): TSTypeAnnotation = js.native
}
