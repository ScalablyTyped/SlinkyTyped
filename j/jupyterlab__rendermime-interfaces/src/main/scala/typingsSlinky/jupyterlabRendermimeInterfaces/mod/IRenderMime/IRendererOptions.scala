package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a renderer.
  */
@js.native
trait IRendererOptions extends js.Object {
  /**
    * The LaTeX typesetter.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null = js.native
  /**
    * The preferred mimeType to render.
    */
  var mimeType: String = js.native
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null = js.native
  /**
    * The html sanitizer.
    */
  var sanitizer: ISanitizer = js.native
}

object IRendererOptions {
  @scala.inline
  def apply(mimeType: String, sanitizer: ISanitizer): IRendererOptions = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
  @scala.inline
  implicit class IRendererOptionsOps[Self <: IRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizer(value: ISanitizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(value.asInstanceOf[js.Any])
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

