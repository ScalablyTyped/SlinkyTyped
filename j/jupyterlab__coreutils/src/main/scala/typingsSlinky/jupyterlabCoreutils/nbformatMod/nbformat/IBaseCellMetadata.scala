package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.anon.PartialIBaseCellJupyterMe
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cell-level metadata.
  */
@js.native
trait IBaseCellMetadata
  extends JSONObject
     with ICellMetadata {
  /**
    * The Jupyter metadata namespace
    */
  var jupyter: PartialIBaseCellJupyterMe = js.native
  /**
    * The cell's name. If present, must be a non-empty string.
    */
  var name: String = js.native
  /**
    * The cell's tags. Tags must be unique, and must not contain commas.
    */
  var tags: js.Array[String] = js.native
  /**
    * Whether the cell is trusted.
    *
    * #### Notes
    * This is not strictly part of the nbformat spec, but it is added by
    * the contents manager.
    *
    * See https://jupyter-notebook.readthedocs.io/en/latest/security.html.
    */
  var trusted: Boolean = js.native
}

object IBaseCellMetadata {
  @scala.inline
  def apply(jupyter: PartialIBaseCellJupyterMe, name: String, tags: js.Array[String], trusted: Boolean): IBaseCellMetadata = {
    val __obj = js.Dynamic.literal(jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCellMetadata]
  }
  @scala.inline
  implicit class IBaseCellMetadataOps[Self <: IBaseCellMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJupyter(value: PartialIBaseCellJupyterMe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jupyter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

