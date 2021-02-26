package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocTypes
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSUnionTypeBuilder extends StObject {
  
  def apply(types: js.Array[TSTypeKind]): TSUnionType = js.native
  
  def from(params: LocTypes): TSUnionType = js.native
}
