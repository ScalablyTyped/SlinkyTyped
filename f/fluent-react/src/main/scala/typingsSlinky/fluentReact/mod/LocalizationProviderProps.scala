package typingsSlinky.fluentReact.mod

import typingsSlinky.fluent.mod.FluentBundle
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizationProviderProps extends js.Object {
  var bundles: IterableIterator[FluentBundle] = js.native
  var parseMarkup: js.UndefOr[MarkupParser] = js.native
}

object LocalizationProviderProps {
  @scala.inline
  def apply(bundles: IterableIterator[FluentBundle]): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizationProviderProps]
  }
  @scala.inline
  implicit class LocalizationProviderPropsOps[Self <: LocalizationProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundles(value: IterableIterator[FluentBundle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseMarkup(value: /* str */ String => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseMarkup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseMarkup")(js.undefined)
        ret
    }
  }
  
}

