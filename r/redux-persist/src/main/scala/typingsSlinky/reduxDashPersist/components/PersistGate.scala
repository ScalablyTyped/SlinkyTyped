package typingsSlinky.reduxDashPersist.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashPersist.esTypesMod.Persistor
import typingsSlinky.reduxDashPersist.integrationReactMod.PersistGateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PersistGate
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reduxDashPersist.integrationReactMod.PersistGate] {
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    persistor: Persistor,
    loading: TagMod[Any] = null,
    onBeforeLift: () => Unit | js.Promise[Unit] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reduxDashPersist.integrationReactMod.PersistGate] = {
    val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onBeforeLift != null) __obj.updateDynamic("onBeforeLift")(js.Any.fromFunction0(onBeforeLift))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PersistGateProps
}

