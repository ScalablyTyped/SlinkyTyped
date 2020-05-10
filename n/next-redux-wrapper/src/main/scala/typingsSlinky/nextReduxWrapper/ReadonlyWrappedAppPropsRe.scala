package typingsSlinky.nextReduxWrapper

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-redux-wrapper.next-redux-wrapper.WrappedAppProps> & std.Readonly<{  children ? :react.react.ReactNode}> */
@js.native
trait ReadonlyWrappedAppPropsRe extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.native
  val initialProps: js.Any = js.native
  val initialState: js.Any = js.native
  val isServer: Boolean = js.native
}

object ReadonlyWrappedAppPropsRe {
  @scala.inline
  def apply(initialProps: js.Any, initialState: js.Any, isServer: Boolean): ReadonlyWrappedAppPropsRe = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyWrappedAppPropsRe]
  }
  @scala.inline
  implicit class ReadonlyWrappedAppPropsReOps[Self <: ReadonlyWrappedAppPropsRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
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
  }
  
}

