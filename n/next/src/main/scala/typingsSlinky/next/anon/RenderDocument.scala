package typingsSlinky.next.anon

import slinky.core.facade.ReactElement
import typingsSlinky.next.libUtilsMod.DocumentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderDocument extends StObject {
  
  def renderDocument(
    Document: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object,
    props: DocumentProps
  ): ReactElement = js.native
}
object RenderDocument {
  
  @scala.inline
  def apply(
    renderDocument: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
  ): RenderDocument = {
    val __obj = js.Dynamic.literal(renderDocument = js.Any.fromFunction2(renderDocument))
    __obj.asInstanceOf[RenderDocument]
  }
  
  @scala.inline
  implicit class RenderDocumentMutableBuilder[Self <: RenderDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderDocument(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
    ): Self = StObject.set(x, "renderDocument", js.Any.fromFunction2(value))
  }
}
