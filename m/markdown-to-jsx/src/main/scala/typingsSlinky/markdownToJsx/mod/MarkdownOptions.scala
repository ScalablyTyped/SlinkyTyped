package typingsSlinky.markdownToJsx.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.markdownToJsx.anon.Dictkey
import typingsSlinky.react.mod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownOptions extends js.Object {
  /** Custom React.createElement behavior. */
  var createElement: js.UndefOr[
    js.Function3[
      /* type */ ReactComponentClass[js.Object] | String, 
      /* props */ js.UndefOr[(Attributes with js.Object) | Null], 
      /* repeated */ TagMod[Any], 
      ReactElement
    ]
  ] = js.undefined
  /** Force all input strings to use block layout. */
  var forceBlock: js.UndefOr[Boolean] = js.undefined
  /** Force all input strings to use inline layout. */
  var forceInline: js.UndefOr[Boolean] = js.undefined
  /** Override representation of any HTML tag or custom component. */
  var overrides: js.UndefOr[Dictkey] = js.undefined
  /** Custom function to generate an HTML id from headings. */
  var slugify: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
}

object MarkdownOptions {
  @scala.inline
  def apply(
    createElement: (/* type */ ReactComponentClass[js.Object] | String, /* props */ js.UndefOr[(Attributes with js.Object) | Null], /* repeated */ TagMod[Any]) => ReactElement = null,
    forceBlock: js.UndefOr[Boolean] = js.undefined,
    forceInline: js.UndefOr[Boolean] = js.undefined,
    overrides: Dictkey = null,
    slugify: /* text */ String => String = null
  ): MarkdownOptions = {
    val __obj = js.Dynamic.literal()
    if (createElement != null) __obj.updateDynamic("createElement")(js.Any.fromFunction3(createElement))
    if (!js.isUndefined(forceBlock)) __obj.updateDynamic("forceBlock")(forceBlock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceInline)) __obj.updateDynamic("forceInline")(forceInline.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (slugify != null) __obj.updateDynamic("slugify")(js.Any.fromFunction1(slugify))
    __obj.asInstanceOf[MarkdownOptions]
  }
}

