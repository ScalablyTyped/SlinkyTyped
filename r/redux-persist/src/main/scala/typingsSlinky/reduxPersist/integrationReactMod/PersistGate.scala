package typingsSlinky.reduxPersist.integrationReactMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
  * @see Persistor
  * @see PersistGateProps
  * @see PersistGateState
  */
@JSImport("redux-persist/integration/react", "PersistGate")
@js.native
class PersistGate ()
  extends Component[PersistGateProps, PersistorGateState, js.Any]
