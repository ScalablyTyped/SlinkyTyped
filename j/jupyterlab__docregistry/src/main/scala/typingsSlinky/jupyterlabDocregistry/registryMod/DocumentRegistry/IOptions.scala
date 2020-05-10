package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a document registry.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The initial file types for the registry.
    * The [[DocumentRegistry.defaultFileTypes]] will be used if not given.
    */
  var initialFileTypes: js.UndefOr[js.Array[IFileType]] = js.native
  /**
    * The text model factory for the registry.  A default instance will
    * be used if not given.
    */
  var textModelFactory: js.UndefOr[ModelFactory] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialFileTypes(value: js.Array[IFileType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTextModelFactory(value: ModelFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textModelFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextModelFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textModelFactory")(js.undefined)
        ret
    }
  }
  
}

