package typingsSlinky.next

import slinky.core.facade.ReactElement
import typingsSlinky.next.utilsMod.DocumentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderDocument extends js.Object {
  def renderDocument(
    Document: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object,
    props: DocumentProps
  ): ReactElement
}

object AnonRenderDocument {
  @scala.inline
  def apply(
    renderDocument: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
  ): AnonRenderDocument = {
    val __obj = js.Dynamic.literal(renderDocument = js.Any.fromFunction2(renderDocument))
  
    __obj.asInstanceOf[AnonRenderDocument]
  }
}

