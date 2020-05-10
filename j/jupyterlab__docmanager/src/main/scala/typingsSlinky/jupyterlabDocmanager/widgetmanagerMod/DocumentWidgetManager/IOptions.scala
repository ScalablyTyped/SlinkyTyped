package typingsSlinky.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager

import typingsSlinky.jupyterlabDocregistry.mod.DocumentRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document widget manager.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * A document registry instance.
    */
  var registry: DocumentRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(registry: DocumentRegistry): IOptions = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistry(value: DocumentRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

