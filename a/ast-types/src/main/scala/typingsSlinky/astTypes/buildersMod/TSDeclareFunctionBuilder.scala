package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Declare
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NoopKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSDeclareFunctionBuilder extends StObject {
  
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: Null, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def apply(id: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  
  def from(params: Declare): TSDeclareFunction = js.native
}
