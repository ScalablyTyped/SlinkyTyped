package typingsSlinky.reactCssThemr.mod

import typingsSlinky.reactCssThemr.anon.Theme
import typingsSlinky.reactCssThemr.reactCssThemrBooleans.`false`
import typingsSlinky.reactCssThemr.reactCssThemrStrings.deeply
import typingsSlinky.reactCssThemr.reactCssThemrStrings.softly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemrOptions extends js.Object {
  /** @default "deeply" */
  var composeTheme: js.UndefOr[deeply | softly | `false`] = js.native
  //currently there's no way to lift decorated component's generic type argument (P) to upper decorator
  //that's why just {}
  var mapThemrProps: js.UndefOr[TMapThemrProps[js.Object]] = js.native
}

object IThemrOptions {
  @scala.inline
  def apply(): IThemrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemrOptions]
  }
  @scala.inline
  implicit class IThemrOptionsOps[Self <: IThemrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposeTheme(value: deeply | softly | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composeTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposeTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composeTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withMapThemrProps(value: (js.Object, /* theme */ TReactCSSThemrTheme) => js.Object with Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapThemrProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMapThemrProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapThemrProps")(js.undefined)
        ret
    }
  }
  
}

