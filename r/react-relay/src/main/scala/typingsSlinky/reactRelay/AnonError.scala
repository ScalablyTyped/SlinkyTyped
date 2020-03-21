package typingsSlinky.reactRelay

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[TOperation /* <: OperationType */] extends js.Object {
  var error: js.Error | Null
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null
  var retry: js.Function0[Unit] | Null
}

object AnonError {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    error: js.Error = null,
    props: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any = null,
    retry: () => Unit = null
  ): AnonError[TOperation] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(js.Any.fromFunction0(retry))
    __obj.asInstanceOf[AnonError[TOperation]]
  }
}

