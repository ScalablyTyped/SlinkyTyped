package typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry

import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to clone a rendermime instance.
  */
@js.native
trait ICloneOptions extends js.Object {
  /**
    * The new LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.native
  /**
    * The new path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.native
  /**
    * The new resolver object.
    */
  var resolver: js.UndefOr[IResolver] = js.native
  /**
    * The new sanitizer used to sanitize untrusted html inputs.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.native
}

object ICloneOptions {
  @scala.inline
  def apply(): ICloneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICloneOptions]
  }
  @scala.inline
  implicit class ICloneOptionsOps[Self <: ICloneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

