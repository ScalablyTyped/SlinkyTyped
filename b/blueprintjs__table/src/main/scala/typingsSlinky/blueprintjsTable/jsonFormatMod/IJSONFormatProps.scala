package typingsSlinky.blueprintjsTable.jsonFormatMod

import typingsSlinky.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJSONFormatProps extends ITruncatedFormatProps {
  @JSName("children")
  var children_IJSONFormatProps: js.UndefOr[js.Any] = js.native
  /**
    * By default, we omit stringifying native JavaScript strings since
    * `JSON.stringify` awkwardly adds double-quotes to the display value.
    * This behavior can be turned off by setting this boolean to `false`.
    * @default true
    */
  var omitQuotesOnStrings: js.UndefOr[Boolean] = js.native
  /**
    * Optionally specify the stringify method. Default is `JSON.stringify`
    * with 2-space indentation.
    */
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.native
}

object IJSONFormatProps {
  @scala.inline
  def apply(): IJSONFormatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJSONFormatProps]
  }
  @scala.inline
  implicit class IJSONFormatPropsOps[Self <: IJSONFormatProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Any): Self = {
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
    def withOmitQuotesOnStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitQuotesOnStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitQuotesOnStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitQuotesOnStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(value: /* obj */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
  }
  
}

