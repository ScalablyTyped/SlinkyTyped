package typingsSlinky.jupyterlabApplication.layoutrestorerMod.LayoutRestorer

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsSlinky.phosphorCommands.mod.CommandRegistry
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for layout restorer instantiation.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The data connector used for layout saving and fetching.
    */
  var connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String] = js.native
  /**
    * The initial promise that has to be resolved before restoration.
    *
    * #### Notes
    * This promise should equal the JupyterLab application `started` notifier.
    */
  var first: js.Promise[_] = js.native
  /**
    * The application command registry.
    */
  var registry: CommandRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(
    connector: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String],
    first: js.Promise[_],
    registry: CommandRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnector(value: IDataConnector[ReadonlyJSONValue, ReadonlyJSONValue, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: CommandRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

