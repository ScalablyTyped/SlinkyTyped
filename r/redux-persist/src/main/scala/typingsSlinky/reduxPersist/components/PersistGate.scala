package typingsSlinky.reduxPersist.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reduxPersist.integrationReactMod.PersistGateProps
import typingsSlinky.reduxPersist.typesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PersistGate {
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reduxPersist.integrationReactMod.PersistGate] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenFunction1(value: /* bootstrapped */ Boolean => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def children(value: ReactElement | (js.Function1[/* bootstrapped */ Boolean, ReactElement])): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingReactElement(value: ReactElement): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: ReactElement): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def onBeforeLift(value: () => Unit | js.Promise[Unit]): this.type = set("onBeforeLift", js.Any.fromFunction0(value))
  }
  
  def withProps(p: PersistGateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(persistor: Persistor): Builder = {
    val __props = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PersistGateProps]))
  }
}

