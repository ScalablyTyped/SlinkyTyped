package typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorable

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsSlinky.phosphorCommands.mod.CommandRegistry
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import typingsSlinky.phosphorDisposable.mod.IObservableDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state restoration configuration options.
  *
  * @typeparam T - The type of object held by the restorable collection.
  */
@js.native
trait IOptions[T /* <: IObservableDisposable */]
  extends typingsSlinky.jupyterlabCoreutils.interfacesMod.IRestorer.IOptions[T] {
  /**
    * The data connector to fetch restore data.
    */
  var connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String] = js.native
  /**
    * The command registry which holds the restore command.
    */
  var registry: CommandRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply[T](
    command: String,
    connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String],
    name: T => String,
    registry: CommandRegistry
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], name = js.Any.fromFunction1(name), registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConnector(value: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: CommandRegistry): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

