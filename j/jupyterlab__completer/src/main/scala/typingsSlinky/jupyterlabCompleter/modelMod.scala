package typingsSlinky.jupyterlabCompleter

import typingsSlinky.jupyterlabCompleter.widgetMod.Completer.IModel
import typingsSlinky.jupyterlabCompleter.widgetMod.Completer.TypeMap
import typingsSlinky.phosphorAlgorithm.iterMod.IterableOrArrayLike
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/model", JSImport.Namespace)
@js.native
object modelMod extends js.Object {
  @js.native
  class CompleterModel () extends IModel {
    var _current: js.Any = js.native
    var _cursor: js.Any = js.native
    /**
      * Apply the query to the complete options list to return the matching subset.
      */
    var _filter: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _options: js.Any = js.native
    var _orderedTypes: js.Any = js.native
    var _original: js.Any = js.native
    var _query: js.Any = js.native
    /**
      * Reset the state of the model.
      */
    var _reset: js.Any = js.native
    var _stateChanged: js.Any = js.native
    var _subsetMatch: js.Any = js.native
    var _typeMap: js.Any = js.native
    /**
      * A signal emitted when state of the completer menu changes.
      */
    @JSName("stateChanged")
    val stateChanged_CompleterModel: ISignal[this.type, Unit] = js.native
    def setOptions(newValue: IterableOrArrayLike[String], typeMap: TypeMap): Unit = js.native
  }
  
}

