package typingsSlinky.reactLatexNext.anon

import typingsSlinky.reactLatexNext.typesMod.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-latex-next.react-latex-next/dist/Latex.LatexProps> */
@js.native
trait PartialLatexProps extends js.Object {
  var children: js.UndefOr[String] = js.native
  var delimiters: js.UndefOr[js.Array[Delimiter]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object PartialLatexProps {
  @scala.inline
  def apply(): PartialLatexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLatexProps]
  }
  @scala.inline
  implicit class PartialLatexPropsOps[Self <: PartialLatexProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiters(value: js.Array[Delimiter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

