package typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing

import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file contents model thunk.
  *
  * Note: The content of the model will be empty.
  * To get the contents, call and await the `withContent`
  * method.
  */
@js.native
trait IContentsThunk extends js.Object {
  /**
    * The contents model.
    */
  var model: IModel = js.native
  /**
    * Fetches the model with contents.
    */
  def withContent(): js.Promise[IModel] = js.native
}

object IContentsThunk {
  @scala.inline
  def apply(model: IModel, withContent: () => js.Promise[IModel]): IContentsThunk = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], withContent = js.Any.fromFunction0(withContent))
    __obj.asInstanceOf[IContentsThunk]
  }
  @scala.inline
  implicit class IContentsThunkOps[Self <: IContentsThunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithContent(value: () => js.Promise[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

