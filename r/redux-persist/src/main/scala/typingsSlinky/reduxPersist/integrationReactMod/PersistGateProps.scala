package typingsSlinky.reduxPersist.integrationReactMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reduxPersist.typesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see PersistGate */
@js.native
trait PersistGateProps extends js.Object {
  var children: js.UndefOr[TagMod[Any] | (js.Function1[/* bootstrapped */ Boolean, TagMod[Any]])] = js.native
  var loading: js.UndefOr[TagMod[Any]] = js.native
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
    def withPersistor(value: Persistor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* bootstrapped */ Boolean => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | (js.Function1[/* bootstrapped */ Boolean, TagMod[Any]])): Self = {
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
    @scala.inline
    def withLoadingReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoading(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeLift(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLift")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeLift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLift")(js.undefined)
        ret
    }
  }
  
}

