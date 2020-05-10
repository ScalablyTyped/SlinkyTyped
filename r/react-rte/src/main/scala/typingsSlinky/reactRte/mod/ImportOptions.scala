package typingsSlinky.reactRte.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportOptions extends js.Object {
  var customBlockFn: js.UndefOr[CustomBlockFn] = js.native
  var customInlineFn: js.UndefOr[CustomInlineFn] = js.native
  var elementStyles: js.UndefOr[StringDictionary[String]] = js.native
  var parser: js.UndefOr[js.Function1[/* html */ String, HTMLBodyElement]] = js.native
}

object ImportOptions {
  @scala.inline
  def apply(): ImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportOptions]
  }
  @scala.inline
  implicit class ImportOptionsOps[Self <: ImportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomBlockFn(value: /* element */ Element => js.UndefOr[Null | CustomBlockObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBlockFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomBlockFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBlockFn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomInlineFn(
      value: (/* element */ Element, /* inlineCreators */ InlineCreators) => js.UndefOr[
          Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInlineFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomInlineFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInlineFn")(js.undefined)
        ret
    }
    @scala.inline
    def withElementStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: /* html */ String => HTMLBodyElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
  }
  
}

