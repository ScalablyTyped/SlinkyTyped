package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the options for Render jobs.
  * @since OOo 1.1.2
  */
@js.native
trait RenderOptions extends StObject {
  
  /**
    * indicates that the current page is the first page to be exported.
    *
    * Hyperlinks, notes, and outlines cannot be exported on a per page base. They have to be exported once **before** the first page is exported. Therefore
    * the IsFirstPage property has been introduced. It is evaluated in the render function and indicates that the current page is the first page to be
    * exported.
    * @see XRenderable
    */
  var IsFirstPage: Boolean = js.native
  
  /**
    * indicates that the current page is the last page to be exported.
    *
    * Hyperlinks from the EditEngine have to be exported once **after** the last page has been processed. Therefore the IsLastPage property has been
    * introduced. It is evaluated in the render function and indicates that the current page is the last page to be exported.
    * @see XRenderable
    */
  var IsLastPage: Boolean = js.native
  
  /**
    * specifies if empty pages should be skipped.
    *
    * Tells the PDF export to skip empty pages. This flag also has to be passed to the render function, in order to calculate to correct page numbers during
    * the export of hyperlinks, notes, and outlines.
    * @see XRenderable
    */
  var IsSkipEmptyPages: Boolean = js.native
  
  /**
    * specifies the page ranges to be rendered.
    *
    * Tells the PDF export to skip empty pages. This flag also has to be passed to the render function, in order to calculate to correct page numbers during
    * the export of hyperlinks, notes, and outlines.
    * @see XRenderable
    */
  var PageRange: String = js.native
  
  /** specifies the device the page should be rendered to */
  var RenderDevice: XDevice = js.native
}
object RenderOptions {
  
  @scala.inline
  def apply(
    IsFirstPage: Boolean,
    IsLastPage: Boolean,
    IsSkipEmptyPages: Boolean,
    PageRange: String,
    RenderDevice: XDevice
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(IsFirstPage = IsFirstPage.asInstanceOf[js.Any], IsLastPage = IsLastPage.asInstanceOf[js.Any], IsSkipEmptyPages = IsSkipEmptyPages.asInstanceOf[js.Any], PageRange = PageRange.asInstanceOf[js.Any], RenderDevice = RenderDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFirstPage(value: Boolean): Self = StObject.set(x, "IsFirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastPage(value: Boolean): Self = StObject.set(x, "IsLastPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSkipEmptyPages(value: Boolean): Self = StObject.set(x, "IsSkipEmptyPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRange(value: String): Self = StObject.set(x, "PageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDevice(value: XDevice): Self = StObject.set(x, "RenderDevice", value.asInstanceOf[js.Any])
  }
}
