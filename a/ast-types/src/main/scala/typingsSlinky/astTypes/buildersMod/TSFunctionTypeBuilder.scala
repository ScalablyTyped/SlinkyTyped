package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Parameters
import typingsSlinky.astTypes.kindsMod.ArrayPatternKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ObjectPatternKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSFunctionTypeBuilder extends StObject {
  
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType = js.native
  
  def from(params: Parameters): TSFunctionType = js.native
}
