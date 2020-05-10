package typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for an inspection handler.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The connector used to make inspection requests.
    *
    * #### Notes
    * The only method of this connector that will ever be called is `fetch`, so
    * it is acceptable for the other methods to be simple functions that return
    * rejected promises.
    */
  var connector: IDataConnector[IReply, Unit, IRequest] = js.native
  /**
    * The mime renderer for the inspection handler.
    */
  var rendermime: IRenderMimeRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest], rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnector(value: IDataConnector[IReply, Unit, IRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

