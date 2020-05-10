package typingsSlinky.materialUiStyles.getThemePropsGetThemePropsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeWithProps[Components] extends js.Object {
  var props: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Components ]: std.Partial<Components[K]>}
    */ typingsSlinky.materialUiStyles.materialUiStylesStrings.ThemeWithProps with TopLevel[Components]
  ] = js.native
}

object ThemeWithProps {
  @scala.inline
  def apply[Components](): ThemeWithProps[Components] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeWithProps[Components]]
  }
  @scala.inline
  implicit class ThemeWithPropsOps[Self[components] <: ThemeWithProps[components], Components] (val x: Self[Components]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Components] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Components]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Components] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Components] with Other]
    @scala.inline
    def withProps(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Components ]: std.Partial<Components[K]>}
      */ typingsSlinky.materialUiStyles.materialUiStylesStrings.ThemeWithProps with TopLevel[Components]
    ): Self[Components] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[Components] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
  }
  
}

