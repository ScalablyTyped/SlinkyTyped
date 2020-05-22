package typingsSlinky.reactRelay.anon

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error[TOperation /* <: OperationType */] extends js.Object {
  var error: js.Error | Null
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null
  var retry: js.Function0[Unit] | Null
}

object Error {
  @scala.inline
  def apply[TOperation](
    error: js.Error = null,
    props: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any = null,
    retry: () => Unit = null
  ): Error[TOperation] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry))
    __obj.asInstanceOf[Error[TOperation]]
  }
}

