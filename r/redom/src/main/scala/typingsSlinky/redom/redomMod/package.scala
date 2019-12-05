package typingsSlinky.redom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redomMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLAnchorElement
  import org.scalajs.dom.raw.HTMLBRElement
  import org.scalajs.dom.raw.HTMLButtonElement
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLElement
  import org.scalajs.dom.raw.HTMLFormElement
  import org.scalajs.dom.raw.HTMLHRElement
  import org.scalajs.dom.raw.HTMLHeadingElement
  import org.scalajs.dom.raw.HTMLIFrameElement
  import org.scalajs.dom.raw.HTMLImageElement
  import org.scalajs.dom.raw.HTMLInputElement
  import org.scalajs.dom.raw.HTMLLIElement
  import org.scalajs.dom.raw.HTMLLabelElement
  import org.scalajs.dom.raw.HTMLOListElement
  import org.scalajs.dom.raw.HTMLOptionElement
  import org.scalajs.dom.raw.HTMLParagraphElement
  import org.scalajs.dom.raw.HTMLPreElement
  import org.scalajs.dom.raw.HTMLSelectElement
  import org.scalajs.dom.raw.HTMLSpanElement
  import org.scalajs.dom.raw.HTMLStyleElement
  import org.scalajs.dom.raw.HTMLTableCellElement
  import org.scalajs.dom.raw.HTMLTableElement
  import org.scalajs.dom.raw.HTMLTableHeaderCellElement
  import org.scalajs.dom.raw.HTMLTableRowElement
  import org.scalajs.dom.raw.HTMLTableSectionElement
  import org.scalajs.dom.raw.HTMLTextAreaElement
  import org.scalajs.dom.raw.HTMLUListElement
  import org.scalajs.dom.raw.Node
  import org.scalajs.dom.raw.SVGElement

  type HTMLElementOfRedomQuery[Q /* <: RedomQuery */] = HTMLElementOfStringLiteral[Q] | Q
  type HTMLElementOfStringLiteral[Q /* <: String */] = HTMLElement | SVGElement | HTMLStyleElement | HTMLTableHeaderCellElement | HTMLTableSectionElement | HTMLTableCellElement | HTMLTableRowElement | HTMLTableElement | HTMLHeadingElement | HTMLButtonElement | HTMLOptionElement | HTMLSelectElement | HTMLTextAreaElement | HTMLLabelElement | HTMLInputElement | HTMLFormElement | HTMLOListElement | HTMLLIElement | HTMLUListElement | HTMLIFrameElement | HTMLImageElement | HTMLBRElement | HTMLHRElement | HTMLParagraphElement | HTMLPreElement | HTMLSpanElement | HTMLAnchorElement | HTMLDivElement
  type RedomElement = Node | RedomComponent
  type RedomMiddleware = js.Function1[/* el */ HTMLElement, Unit]
  type RedomQuery = String | RedomElement
  type RedomQueryArgument = RedomQueryArgumentValue | js.Array[RedomQueryArgumentValue]
  type RedomQueryArgumentValue = RedomElement | String | Double | StringDictionary[js.Any] | RedomMiddleware
  type RouterDictionary = StringDictionary[RedomComponentConstructor]
}
