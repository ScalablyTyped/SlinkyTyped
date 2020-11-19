package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PdfViewer")
@js.native
class PdfViewer protected ()
  extends typingsSlinky.ejWebAll.ej.PdfViewer {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.PdfViewer.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.PdfViewer.Model) = this()
}
/* static members */
@JSGlobal("ej.PdfViewer")
@js.native
object PdfViewer extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.PdfViewer = js.native
  
  @js.native
  object AnnotationType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PdfViewer.AnnotationType with Double] = js.native
    
    /* 2 */ val Highlight: typingsSlinky.ejWebAll.ej.PdfViewer.AnnotationType.Highlight with Double = js.native
    
    /* 1 */ val Strikethrough: typingsSlinky.ejWebAll.ej.PdfViewer.AnnotationType.Strikethrough with Double = js.native
    
    /* 0 */ val Underline: typingsSlinky.ejWebAll.ej.PdfViewer.AnnotationType.Underline with Double = js.native
  }
  
  @js.native
  object BufferingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PdfViewer.BufferingMode with Double] = js.native
    
    /* 1 */ val Complete: typingsSlinky.ejWebAll.ej.PdfViewer.BufferingMode.Complete with Double = js.native
    
    /* 0 */ val Default: typingsSlinky.ejWebAll.ej.PdfViewer.BufferingMode.Default with Double = js.native
  }
  
  @js.native
  object InteractionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PdfViewer.InteractionMode with Double] = js.native
    
    /* 1 */ val Pan: typingsSlinky.ejWebAll.ej.PdfViewer.InteractionMode.Pan with Double = js.native
    
    /* 0 */ val TextSelection: typingsSlinky.ejWebAll.ej.PdfViewer.InteractionMode.TextSelection with Double = js.native
  }
  
  @js.native
  object LinkTarget extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PdfViewer.LinkTarget with Double] = js.native
    
    /* 0 */ val Default: typingsSlinky.ejWebAll.ej.PdfViewer.LinkTarget.Default with Double = js.native
    
    /* 1 */ val NewTab: typingsSlinky.ejWebAll.ej.PdfViewer.LinkTarget.NewTab with Double = js.native
    
    /* 2 */ val NewWindow: typingsSlinky.ejWebAll.ej.PdfViewer.LinkTarget.NewWindow with Double = js.native
  }
  
  @js.native
  object PdfService extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PdfViewer.PdfService with Double] = js.native
    
    /* 0 */ val Local: typingsSlinky.ejWebAll.ej.PdfViewer.PdfService.Local with Double = js.native
    
    /* 1 */ val Remote: typingsSlinky.ejWebAll.ej.PdfViewer.PdfService.Remote with Double = js.native
  }
  
  @js.native
  object ToolbarItems extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems with Double] = js.native
    
    /* 8 */ val All: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.All with Double = js.native
    
    /* 3 */ val DownloadTool: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.DownloadTool with Double = js.native
    
    /* 0 */ val MagnificationTools: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.MagnificationTools with Double = js.native
    
    /* 1 */ val PageNavigationTools: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.PageNavigationTools with Double = js.native
    
    /* 2 */ val PrintTools: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.PrintTools with Double = js.native
    
    /* 7 */ val SelectionTool: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.SelectionTool with Double = js.native
    
    /* 6 */ val SignatureTool: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.SignatureTool with Double = js.native
    
    /* 5 */ val TextMarkupAnnotationTools: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.TextMarkupAnnotationTools with Double = js.native
    
    /* 4 */ val TextSearchTool: typingsSlinky.ejWebAll.ej.PdfViewer.ToolbarItems.TextSearchTool with Double = js.native
  }
}
