package typingsSlinky.jupyterlabDocmanager.savehandlerMod.SaveHandler

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a save handler.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The context asssociated with the file.
    */
  var context: Context = js.native
  /**
    * The minimum save interval in seconds (default is two minutes).
    */
  var saveInterval: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply(context: Context): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveInterval")(js.undefined)
        ret
    }
  }
  
}

