package typingsSlinky.overlayscrollbars.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.overlayscrollbars.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayScrollbarsStatic extends StObject {
  
  def apply(): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: Element): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: Element, options: Options): OverlayScrollbars = js.native
  def apply(element: Element, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def apply(element: HTMLElement): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: HTMLElement, options: Options): OverlayScrollbars = js.native
  def apply(element: HTMLElement, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def apply(elements: js.Array[Element]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: js.Array[Element],
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[Element], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element with Node]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element with Node], filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: NodeListOf[Element with Node],
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element with Node], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: NodeListOf[Element with Node], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, filter: String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: JQuery,
    filter: js.Function2[/* element */ Element, /* instance */ OverlayScrollbars, Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(element: JQuery): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: JQuery, options: Options): OverlayScrollbars = js.native
  def apply(element: JQuery, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  
  def defaultOptions(): Options = js.native
  def defaultOptions(newDefaultOptions: Options): Unit = js.native
  
  def extension(): Dictindex = js.native
  def extension(extensionName: String): Unit = js.native
  def extension(
    extensionName: String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ js.Any, 
      Extension
    ]
  ): Unit = js.native
  def extension(
    extensionName: String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ js.Any, 
      Extension
    ],
    defaultOptions: js.Object
  ): Unit = js.native
  @JSName("extension")
  def extension_ExtensionInfo(extensionName: String): ExtensionInfo = js.native
  
  def globals(): Globals = js.native
  
  def valid(osInstance: js.Any): Boolean = js.native
}
