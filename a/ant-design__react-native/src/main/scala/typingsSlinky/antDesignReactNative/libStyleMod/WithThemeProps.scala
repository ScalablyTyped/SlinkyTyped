package typingsSlinky.antDesignReactNative.libStyleMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithThemeProps[T, S] extends js.Object {
  var styles: js.UndefOr[S] = js.native
  def children(styles: T with StringDictionary[js.Any], theme: Theme): TagMod[Any] = js.native
  def themeStyles(theme: Theme): T = js.native
}

object WithThemeProps {
  @scala.inline
  def apply[T, S](children: (T with StringDictionary[js.Any], Theme) => TagMod[Any], themeStyles: Theme => T): WithThemeProps[T, S] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), themeStyles = js.Any.fromFunction1(themeStyles))
    __obj.asInstanceOf[WithThemeProps[T, S]]
  }
  @scala.inline
  implicit class WithThemePropsOps[Self[t, s] <: WithThemeProps[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withChildren(value: (T with StringDictionary[js.Any], Theme) => TagMod[Any]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withThemeStyles(value: Theme => T): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: S): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

