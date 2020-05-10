package typingsSlinky.reactVirtualized.esAutoSizerMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSizerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /**
    * 	Optional custom CSS class name to attach to root AutoSizer element.
    * This is an advanced property and is not typically necessary.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Height passed to child for initial render; useful for server-side rendering.
    * This value will be overridden with an accurate height after mounting.
    */
  var defaultHeight: js.UndefOr[Double] = js.native
  /**
    * Width passed to child for initial render; useful for server-side rendering.
    * This value will be overridden with an accurate width after mounting.
    */
  var defaultWidth: js.UndefOr[Double] = js.native
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[Boolean] = js.native
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[Boolean] = js.native
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[String] = js.native
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* info */ Size, _]] = js.native
  /**
    * Optional custom inline style to attach to root AutoSizer element.
    * This is an advanced property and is not typically necessary.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, width }) => PropTypes.element
    */
  def children(props: Size): TagMod[Any] = js.native
}

object AutoSizerProps {
  @scala.inline
  def apply(children: Size => TagMod[Any]): AutoSizerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AutoSizerProps]
  }
  @scala.inline
  implicit class AutoSizerPropsOps[Self <: AutoSizerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Size => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* info */ Size => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

