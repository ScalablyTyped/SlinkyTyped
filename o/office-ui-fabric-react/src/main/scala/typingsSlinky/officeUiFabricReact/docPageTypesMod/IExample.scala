package typingsSlinky.officeUiFabricReact.docPageTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.AnonRoot
import typingsSlinky.officeUiFabricReact.AnonTheme
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExample extends js.Object {
  /** Raw source code of the example */
  var code: String = js.native
  /** JS String for codepen of the example */
  var codepenJS: js.UndefOr[String] = js.native
  var isScrollable: js.UndefOr[Boolean] = js.native
  /** Custom styles. Partial version of `IExampleCardProps['styles']`. */
  var styles: js.UndefOr[IStyleFunctionOrObject[AnonTheme, AnonRoot]] = js.native
  /** Title of the example */
  var title: String = js.native
  /** Working example of the example */
  var view: ReactElement = js.native
}

object IExample {
  @scala.inline
  def apply(code: String, title: String, view: ReactElement): IExample = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExample]
  }
  @scala.inline
  implicit class IExampleOps[Self <: IExample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodepenJS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepenJS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodepenJS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codepenJS")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: AnonTheme => Partial[AnonRoot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[AnonTheme, AnonRoot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

