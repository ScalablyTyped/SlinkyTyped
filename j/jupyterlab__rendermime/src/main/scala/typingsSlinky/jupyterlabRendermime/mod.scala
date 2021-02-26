package typingsSlinky.jupyterlabRendermime

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabNbformat.mod.IMimeBundle
import typingsSlinky.jupyterlabNbformat.mod.IOutput
import typingsSlinky.jupyterlabRendermime.anon.Math
import typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry.IUrlResolverOptions
import typingsSlinky.jupyterlabRendermime.renderersMod.renderImage.IRenderOptions
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/rendermime", "AttachmentModel")
  @js.native
  class AttachmentModel protected ()
    extends typingsSlinky.jupyterlabRendermime.attachmentmodelMod.AttachmentModel {
    /**
      * Construct a new attachment model.
      */
    def this(options: IOptions) = this()
  }
  object AttachmentModel {
    
    /**
      * Get the data for an attachment.
      *
      * @params bundle - A kernel attachment MIME bundle.
      *
      * @returns - The data for the payload.
      */
    @JSImport("@jupyterlab/rendermime", "AttachmentModel.getData")
    @js.native
    def getData(bundle: IMimeBundle): PartialJSONObject = js.native
  }
  
  @JSImport("@jupyterlab/rendermime", "ILatexTypesetter")
  @js.native
  val ILatexTypesetter: Token[typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter] = js.native
  
  object IRenderMimeRegistry extends Shortcut {
    
    @JSImport("@jupyterlab/rendermime", "IRenderMimeRegistry")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry]
    
    /* This means you don't have to write `^`, but can instead just say `IRenderMimeRegistry.foo` */
    override def _to: Token[typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry] = ^
  }
  
  @JSImport("@jupyterlab/rendermime", "MimeModel")
  @js.native
  /**
    * Construct a new mime model.
    */
  class MimeModel ()
    extends typingsSlinky.jupyterlabRendermime.mimemodelMod.MimeModel {
    def this(options: typingsSlinky.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "OutputModel")
  @js.native
  class OutputModel protected ()
    extends typingsSlinky.jupyterlabRendermime.outputmodelMod.OutputModel {
    /**
      * Construct a new output model.
      */
    def this(options: typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions) = this()
  }
  object OutputModel {
    
    /**
      * Get the data for an output.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The data for the payload.
      */
    @JSImport("@jupyterlab/rendermime", "OutputModel.getData")
    @js.native
    def getData(output: IOutput): PartialJSONObject = js.native
    
    /**
      * Get the metadata from an output message.
      *
      * @params output - A kernel output message payload.
      *
      * @returns - The metadata for the payload.
      */
    @JSImport("@jupyterlab/rendermime", "OutputModel.getMetadata")
    @js.native
    def getMetadata(output: IOutput): PartialJSONObject = js.native
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
  @js.native
  /**
    * Construct a new rendermime.
    *
    * @param options - The options for initializing the instance.
    */
  class RenderMimeRegistry ()
    extends typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry {
    def this(options: typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions) = this()
  }
  object RenderMimeRegistry {
    
    /**
      * A default resolver that uses a given reference path and a contents manager.
      */
    @JSImport("@jupyterlab/rendermime", "RenderMimeRegistry.UrlResolver")
    @js.native
    class UrlResolver protected ()
      extends typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry.UrlResolver {
      /**
        * Create a new url resolver.
        */
      def this(options: IUrlResolverOptions) = this()
    }
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedCommon")
  @js.native
  abstract class RenderedCommon protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedCommon {
    /**
      * Construct a new rendered common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedHTML")
  @js.native
  class RenderedHTML protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedHTML {
    /**
      * Construct a new rendered HTML widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedHTMLCommon")
  @js.native
  abstract class RenderedHTMLCommon protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedHTMLCommon {
    /**
      * Construct a new rendered HTML common widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedImage")
  @js.native
  class RenderedImage protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedImage {
    /**
      * Construct a new rendered image widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedJavaScript")
  @js.native
  class RenderedJavaScript protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedJavaScript {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedLatex")
  @js.native
  class RenderedLatex protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedLatex {
    /**
      * Construct a new rendered LaTeX widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedMarkdown")
  @js.native
  class RenderedMarkdown protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedMarkdown {
    /**
      * Construct a new rendered markdown widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedSVG")
  @js.native
  class RenderedSVG protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedSVG {
    /**
      * Construct a new rendered SVG widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "RenderedText")
  @js.native
  class RenderedText protected ()
    extends typingsSlinky.jupyterlabRendermime.widgetsMod.RenderedText {
    /**
      * Construct a new rendered text widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: IRendererOptions) = this()
  }
  
  @JSImport("@jupyterlab/rendermime", "htmlRendererFactory")
  @js.native
  val htmlRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "imageRendererFactory")
  @js.native
  val imageRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "javaScriptRendererFactory")
  @js.native
  val javaScriptRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "latexRendererFactory")
  @js.native
  val latexRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "markdownRendererFactory")
  @js.native
  val markdownRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "removeMath")
  @js.native
  def removeMath(text: String): Math = js.native
  
  object renderHTML {
    
    @JSImport("@jupyterlab/rendermime", "renderHTML")
    @js.native
    def apply(options: typingsSlinky.jupyterlabRendermime.renderersMod.renderHTML.IOptions): js.Promise[Unit] = js.native
  }
  
  object renderImage {
    
    @JSImport("@jupyterlab/rendermime", "renderImage")
    @js.native
    def apply(options: IRenderOptions): js.Promise[Unit] = js.native
  }
  
  object renderLatex {
    
    @JSImport("@jupyterlab/rendermime", "renderLatex")
    @js.native
    def apply(options: typingsSlinky.jupyterlabRendermime.renderersMod.renderLatex.IRenderOptions): js.Promise[Unit] = js.native
  }
  
  object renderMarkdown {
    
    @JSImport("@jupyterlab/rendermime", "renderMarkdown")
    @js.native
    def apply(options: typingsSlinky.jupyterlabRendermime.renderersMod.renderMarkdown.IRenderOptions): js.Promise[Unit] = js.native
  }
  
  object renderSVG {
    
    @JSImport("@jupyterlab/rendermime", "renderSVG")
    @js.native
    def apply(options: typingsSlinky.jupyterlabRendermime.renderersMod.renderSVG.IRenderOptions): js.Promise[Unit] = js.native
  }
  
  object renderText {
    
    @JSImport("@jupyterlab/rendermime", "renderText")
    @js.native
    def apply(options: typingsSlinky.jupyterlabRendermime.renderersMod.renderText.IRenderOptions): js.Promise[Unit] = js.native
  }
  
  @JSImport("@jupyterlab/rendermime", "replaceMath")
  @js.native
  def replaceMath(text: String, math: js.Array[String]): String = js.native
  
  @JSImport("@jupyterlab/rendermime", "standardRendererFactories")
  @js.native
  val standardRendererFactories: js.Array[IRendererFactory] = js.native
  
  @JSImport("@jupyterlab/rendermime", "svgRendererFactory")
  @js.native
  val svgRendererFactory: IRendererFactory = js.native
  
  @JSImport("@jupyterlab/rendermime", "textRendererFactory")
  @js.native
  val textRendererFactory: IRendererFactory = js.native
  
  object IRenderMime {
    
    /**
      * The namespace for IMimeModel associated interfaces.
      */
    object IMimeModel
  }
}
