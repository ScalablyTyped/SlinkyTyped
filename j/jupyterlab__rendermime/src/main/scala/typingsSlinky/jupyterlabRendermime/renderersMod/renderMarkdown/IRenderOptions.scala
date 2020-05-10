package typingsSlinky.jupyterlabRendermime.renderersMod.renderMarkdown

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.sanitizerMod.ISanitizer
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderMarkdown` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  /**
    * The host node for the rendered Markdown.
    */
  var host: HTMLElement = js.native
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null = js.native
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null = js.native
  /**
    * The html sanitizer for untrusted source.
    */
  var sanitizer: ISanitizer = js.native
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: Boolean = js.native
  /**
    * The Markdown source to render.
    */
  var source: String = js.native
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean = js.native
}

object IRenderOptions {
  @scala.inline
  def apply(host: HTMLElement, sanitizer: ISanitizer, shouldTypeset: Boolean, source: String, trusted: Boolean): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
  @scala.inline
  implicit class IRenderOptionsOps[Self <: IRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizer(value: ISanitizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldTypeset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldTypeset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatexTypesetter(value: ILatexTypesetter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latexTypesetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatexTypesetterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latexTypesetter")(null)
        ret
    }
    @scala.inline
    def withLinkHandler(value: ILinkHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkHandlerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHandler")(null)
        ret
    }
    @scala.inline
    def withResolver(value: IResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(null)
        ret
    }
  }
  
}

