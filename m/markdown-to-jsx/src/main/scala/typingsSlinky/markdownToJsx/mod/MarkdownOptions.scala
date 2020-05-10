package typingsSlinky.markdownToJsx.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.markdownToJsx.AnonDictkey
import typingsSlinky.react.mod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownOptions extends js.Object {
  /** Custom React.createElement behavior. */
  var createElement: js.UndefOr[
    js.Function3[
      /* type */ ReactComponentClass[js.Object] | String, 
      /* props */ js.UndefOr[(Attributes with js.Object) | Null], 
      /* repeated */ TagMod[Any], 
      ReactElement
    ]
  ] = js.native
  /** Force all input strings to use block layout. */
  var forceBlock: js.UndefOr[Boolean] = js.native
  /** Force all input strings to use inline layout. */
  var forceInline: js.UndefOr[Boolean] = js.native
  /** Override representation of any HTML tag or custom component. */
  var overrides: js.UndefOr[AnonDictkey] = js.native
  /** Custom function to generate an HTML id from headings. */
  var slugify: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
}

object MarkdownOptions {
  @scala.inline
  def apply(): MarkdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownOptions]
  }
  @scala.inline
  implicit class MarkdownOptionsOps[Self <: MarkdownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateElement(
      value: (/* type */ ReactComponentClass[js.Object] | String, /* props */ js.UndefOr[(Attributes with js.Object) | Null], /* repeated */ TagMod[Any]) => ReactElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.undefined)
        ret
    }
    @scala.inline
    def withForceBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withForceInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceInline")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withSlugify(value: /* text */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slugify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSlugify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slugify")(js.undefined)
        ret
    }
  }
  
}

