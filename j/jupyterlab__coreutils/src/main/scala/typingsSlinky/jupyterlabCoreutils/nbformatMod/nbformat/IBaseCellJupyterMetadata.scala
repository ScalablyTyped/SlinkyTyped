package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Jupyter metadata namespace.
  */
@js.native
trait IBaseCellJupyterMetadata extends JSONObject {
  /**
    * Whether the source is hidden.
    */
  var source_hidden: Boolean = js.native
}

object IBaseCellJupyterMetadata {
  @scala.inline
  def apply(source_hidden: Boolean): IBaseCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(source_hidden = source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCellJupyterMetadata]
  }
  @scala.inline
  implicit class IBaseCellJupyterMetadataOps[Self <: IBaseCellJupyterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource_hidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_hidden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

