package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.jupyterlabNbformat.anon.PartialIBaseCellJupyterMe
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseCellMetadata
  extends PartialJSONObject
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
  implicit class IBaseCellMetadataMutableBuilder[Self <: IBaseCellMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJupyter(value: PartialIBaseCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
}
