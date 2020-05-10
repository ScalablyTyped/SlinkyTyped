package typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a output area model.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The output content factory used by the model.
    *
    * If not given, a default factory will be used.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * Whether the output is trusted.  The default is false.
    */
  var trusted: js.UndefOr[Boolean] = js.native
  /**
    * The initial values for the model.
    */
  var values: js.UndefOr[js.Array[IOutput]] = js.native
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
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[IOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

