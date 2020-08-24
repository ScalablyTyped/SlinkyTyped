package typingsSlinky.reduxPersist.integrationReactMod

import slinky.core.facade.ReactElement
import typingsSlinky.reduxPersist.typesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see PersistGate */
@js.native
trait PersistGateProps extends js.Object {
  var children: js.UndefOr[ReactElement | (js.Function1[/* bootstrapped */ Boolean, ReactElement])] = js.native
  var loading: js.UndefOr[ReactElement] = js.native
  var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  var persistor: Persistor = js.native
}

object PersistGateProps {
  @scala.inline
  def apply(persistor: Persistor): PersistGateProps = {
    val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistGateProps]
  }
  @scala.inline
  implicit class PersistGatePropsOps[Self <: PersistGateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPersistor(value: Persistor): Self = this.set("persistor", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenFunction1(value: /* bootstrapped */ Boolean => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactElement | (js.Function1[/* bootstrapped */ Boolean, ReactElement])): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setLoadingReactElement(value: ReactElement): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: ReactElement): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setOnBeforeLift(value: () => Unit | js.Promise[Unit]): Self = this.set("onBeforeLift", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBeforeLift: Self = this.set("onBeforeLift", js.undefined)
  }
  
}

