package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.pdfmake.interfacesMod.ArrayOfContent
  - typingsSlinky.pdfmake.interfacesMod.ContentText
  - typingsSlinky.pdfmake.interfacesMod.ContentColumns
  - typingsSlinky.pdfmake.interfacesMod.ContentStack
  - typingsSlinky.pdfmake.interfacesMod.ContentUnorderedList
  - typingsSlinky.pdfmake.interfacesMod.ContentOrderedList
  - typingsSlinky.pdfmake.interfacesMod.ContentTable
  - typingsSlinky.pdfmake.interfacesMod.ContentAnchor
  - typingsSlinky.pdfmake.interfacesMod.ContentPageReference
  - typingsSlinky.pdfmake.interfacesMod.ContentTextReference
  - typingsSlinky.pdfmake.interfacesMod.ContentToc
  - typingsSlinky.pdfmake.interfacesMod.ContentTocItem
  - typingsSlinky.pdfmake.interfacesMod.ContentImage
  - typingsSlinky.pdfmake.interfacesMod.ContentSvg
  - typingsSlinky.pdfmake.interfacesMod.ContentQr
  - typingsSlinky.pdfmake.interfacesMod.ContentCanvas
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: ArrayOfContent): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentAnchor): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentCanvas): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentColumns): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentImage): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentOrderedList): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentPageReference): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentQr): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentStack): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentSvg): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentTable): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentText): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentTextReference): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentToc): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentTocItem): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: ContentUnorderedList): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: String): Content = value.asInstanceOf[Content]
}

