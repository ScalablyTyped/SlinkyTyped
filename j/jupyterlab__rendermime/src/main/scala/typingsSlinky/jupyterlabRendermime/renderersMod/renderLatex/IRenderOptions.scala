package typingsSlinky.jupyterlabRendermime.renderersMod.renderLatex

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderLatex` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  /**
    * The host node for the rendered LaTeX.
    */
  var host: HTMLElement = js.native
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: Boolean = js.native
  /**
    * The LaTeX source to render.
    */
  var source: String = js.native
}

object IRenderOptions {
  @scala.inline
  def apply(host: HTMLElement, shouldTypeset: Boolean, source: String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
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
  }
  
}

