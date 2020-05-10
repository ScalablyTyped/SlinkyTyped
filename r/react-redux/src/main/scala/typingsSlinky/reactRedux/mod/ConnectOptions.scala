package typingsSlinky.reactRedux.mod

import typingsSlinky.react.mod.Context
import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  /**
    * The react context to get the store from.
    *
    * @default ReactReduxContext
    */
  var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.native
  /**
    * Computes the connector component's displayName property relative to that of the wrapped component. Usually
    * overridden by wrapper functions.
    *
    * @default name => 'ConnectAdvanced('+name+')'
    * @param componentName
    */
  var getDisplayName: js.UndefOr[js.Function1[/* componentName */ String, String]] = js.native
  /**
    * Shown in error messages. Usually overridden by wrapper functions.
    *
    * @default 'connectAdvanced'
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * If defined, a property named this value will be added to the props passed to the wrapped component. Its value
    * will be the number of times the component has been rendered, which can be useful for tracking down unnecessary
    * re-renders.
    *
    * @default undefined
    */
  var renderCountProp: js.UndefOr[String] = js.native
  /**
    * Controls whether the connector component subscribes to redux store state changes. If set to false, it will only
    * re-render on <code>componentWillReceiveProps</code>.
    *
    * @default true
    */
  var shouldHandleStateChanges: js.UndefOr[Boolean] = js.native
  /**
    * The key of props/context to get the store. You probably only need this if you are in the inadvisable position of
    * having multiple stores.
    *
    * @default 'store'
    */
  var storeKey: js.UndefOr[String] = js.native
  /**
    * @deprecated Use forwardRef
    *
    * @default false
    */
  var withRef: js.UndefOr[Boolean] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Context[ReactReduxContextValue[_, AnyAction]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisplayName(value: /* componentName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCountProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCountProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderCountProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCountProp")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHandleStateChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHandleStateChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldHandleStateChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHandleStateChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(js.undefined)
        ret
    }
  }
  
}

