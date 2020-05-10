package typingsSlinky.jupyterlabNotebook.modelMod.NotebookModel

import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a notebook model.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * A factory for creating cell models.
    *
    * The default is a shared factory instance.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * The language preference for the model.
    */
  var languagePreference: js.UndefOr[String] = js.native
  /**
    * A modelDB for storing notebook data.
    */
  var modelDB: js.UndefOr[IModelDB] = js.native
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
    def withContentFactory(value: IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguagePreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languagePreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguagePreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languagePreference")(js.undefined)
        ret
    }
    @scala.inline
    def withModelDB(value: IModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelDB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDB")(js.undefined)
        ret
    }
  }
  
}

