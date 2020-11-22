package typingsSlinky.jupyterlabRendermime

import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime/lib/widgets", JSImport.Namespace)
@js.native
object widgetsMod extends js.Object {
  
  @js.native
  abstract class RenderedCommon protected () extends IRenderer {
    /**
      * Construct a new rendered common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
    
    /**
      * The latexTypesetter.
      */
    val latexTypesetter: ILatexTypesetter | Null = js.native
    
    /**
      * The link handler.
      */
    val linkHandler: ILinkHandler | Null = js.native
    
    /**
      * The mimetype being rendered.
      */
    val mimeType: String = js.native
    
    /**
      * Render the mime model.
      *
      * @param model - The mime model to render.
      *
      * @returns A promise which resolves when rendering is complete.
      */
    def render(model: IMimeModel): js.Promise[Unit] = js.native
    
    /**
      * The resolver object.
      */
    val resolver: IResolver | Null = js.native
    
    /**
      * The sanitizer used to sanitize untrusted html inputs.
      */
    val sanitizer: ISanitizer = js.native
    
    /**
      * Set the URI fragment identifier.
      *
      * @param fragment - The URI fragment identifier.
      */
    /* protected */ def setFragment(fragment: String): Unit = js.native
  }
  
  @js.native
  class RenderedHTML protected () extends RenderedHTMLCommon {
    /**
      * Construct a new rendered HTML widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  abstract class RenderedHTMLCommon protected () extends RenderedCommon {
    /**
      * Construct a new rendered HTML common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  class RenderedImage protected () extends RenderedCommon {
    /**
      * Construct a new rendered image widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  class RenderedJavaScript protected () extends RenderedCommon {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  class RenderedLatex protected () extends RenderedCommon {
    /**
      * Construct a new rendered LaTeX widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  class RenderedMarkdown protected () extends RenderedHTMLCommon {
    /**
      * Construct a new rendered markdown widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  class RenderedSVG protected () extends RenderedCommon {
    /**
      * Construct a new rendered SVG widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @js.native
  class RenderedText protected () extends RenderedCommon {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
}
