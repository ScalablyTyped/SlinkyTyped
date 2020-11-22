package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.IndexType
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIndexedAccessTypeBuilder extends js.Object {
  
  def apply(objectType: TSTypeKind, indexType: TSTypeKind): TSIndexedAccessType = js.native
  
  def from(params: IndexType): TSIndexedAccessType = js.native
}
