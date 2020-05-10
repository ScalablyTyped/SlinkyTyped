package typingsSlinky.alt.altContainerMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.alt.AltJS.Alt
import typingsSlinky.alt.AltJS.AltStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerProps extends js.Object {
  var actions: js.UndefOr[StringDictionary[js.Object]] = js.native
  var component: js.UndefOr[ReactComponentClass[_]] = js.native
  var flux: js.UndefOr[Alt] = js.native
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.native
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, ReactElement]] = js.native
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.native
  var store: js.UndefOr[AltStore[_]] = js.native
  var stores: js.UndefOr[js.Array[AltStore[_]]] = js.native
  var transform: js.UndefOr[js.Function2[/* store */ AltStore[_], /* actions */ js.Any, _]] = js.native
}

object ContainerProps {
  @scala.inline
  def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  @scala.inline
  implicit class ContainerPropsOps[Self <: ContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withFlux(value: Alt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlux: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flux")(js.undefined)
        ret
    }
    @scala.inline
    def withInject(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* repeated */ js.Any => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldComponentUpdate(value: /* props */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldComponentUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldComponentUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldComponentUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: AltStore[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withStores(value: js.Array[AltStore[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* store */ AltStore[_], /* actions */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

