package typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions

import typingsSlinky.jupyterlabServices.mod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a RunningSessions item.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The application service manager.
    */
  var serviceManager: ServiceManager = js.native
  /**
    * A click handler for the item. By defult this is used
    * to activate the running sessions side panel.
    */
  def onClick(): Unit = js.native
}

object IOptions {
  @scala.inline
  def apply(onClick: () => Unit, serviceManager: ServiceManager): IOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), serviceManager = serviceManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withServiceManager(value: ServiceManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

