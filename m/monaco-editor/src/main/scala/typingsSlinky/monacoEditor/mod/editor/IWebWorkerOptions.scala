package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebWorkerOptions extends js.Object {
  /**
    * The data to send over when calling create on the module.
    */
  var createData: js.UndefOr[js.Any] = js.native
  /**
    * An object that can be used by the web worker to make calls back to the main thread.
    */
  var host: js.UndefOr[js.Any] = js.native
  /**
    * A label to be used to identify the web worker for debugging purposes.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The AMD moduleId to load.
    * It should export a function `create` that should return the exported proxy.
    */
  var moduleId: String = js.native
}

object IWebWorkerOptions {
  @scala.inline
  def apply(moduleId: String): IWebWorkerOptions = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebWorkerOptions]
  }
  @scala.inline
  implicit class IWebWorkerOptionsOps[Self <: IWebWorkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createData")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

