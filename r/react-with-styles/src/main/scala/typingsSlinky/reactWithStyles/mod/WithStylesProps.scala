package typingsSlinky.reactWithStyles.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStylesProps[T] extends js.Object {
  var styles: StringDictionary[js.Object] = js.native
  var theme: T = js.native
  /**
    * This function takes styles that were processed by `withStyles()`, plain objects, or arrays
    * of these things. It returns an object with an opaque structure that must be spread into a
    * JSX element.
    */
  def css(styles: js.Any*): js.Object = js.native
}

object WithStylesProps {
  @scala.inline
  def apply[T](css: /* repeated */ js.Any => js.Object, styles: StringDictionary[js.Object], theme: T): WithStylesProps[T] = {
    val __obj = js.Dynamic.literal(css = js.Any.fromFunction1(css), styles = styles.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesProps[T]]
  }
  @scala.inline
  implicit class WithStylesPropsOps[Self[t] <: WithStylesProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCss(value: /* repeated */ js.Any => js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

