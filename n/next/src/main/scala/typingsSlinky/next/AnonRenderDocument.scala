package typingsSlinky.next

import slinky.core.facade.ReactElement
import typingsSlinky.next.utilsMod.DocumentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRenderDocument extends js.Object {
  def renderDocument(
    Document: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object,
    props: DocumentProps
  ): ReactElement = js.native
}

object AnonRenderDocument {
  @scala.inline
  def apply(
    renderDocument: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
  ): AnonRenderDocument = {
    val __obj = js.Dynamic.literal(renderDocument = js.Any.fromFunction2(renderDocument))
    __obj.asInstanceOf[AnonRenderDocument]
  }
  @scala.inline
  implicit class AnonRenderDocumentOps[Self <: AnonRenderDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderDocument(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDocument")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

