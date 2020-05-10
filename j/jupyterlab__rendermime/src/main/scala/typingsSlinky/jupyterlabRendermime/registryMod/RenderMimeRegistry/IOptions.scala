package typingsSlinky.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a rendermime instance.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Initial factories to add to the rendermime instance.
    */
  var initialFactories: js.UndefOr[js.Array[IRendererFactory]] = js.native
  /**
    * An optional LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.native
  /**
    * An optional path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.native
  /**
    * The initial resolver object.
    *
    * The default is `null`.
    */
  var resolver: js.UndefOr[IResolver] = js.native
  /**
    * The sanitizer used to sanitize untrusted html inputs.
    *
    * If not given, a default sanitizer will be used.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialFactories(value: js.Array[IRendererFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFactories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFactories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFactories")(js.undefined)
        ret
    }
    @scala.inline
    def withLatexTypesetter(value: ILatexTypesetter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latexTypesetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatexTypesetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latexTypesetter")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkHandler(value: ILinkHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withResolver(value: IResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitizer(value: ISanitizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.undefined)
        ret
    }
  }
  
}

