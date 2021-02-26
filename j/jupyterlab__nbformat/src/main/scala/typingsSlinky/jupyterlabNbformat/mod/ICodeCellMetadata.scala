package typingsSlinky.jupyterlabNbformat.mod

import typingsSlinky.jupyterlabNbformat.anon.PartialICodeCellJupyterMe
import typingsSlinky.jupyterlabNbformat.jupyterlabNbformatStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.jupyterlabNbformat.mod.ICellMetadata because Already inherited */ @js.native
trait ICodeCellMetadata extends IBaseCellMetadata {
  
  /**
    * Whether the cell is collapsed/expanded.
    */
  var collapsed: Boolean = js.native
  
  /**
    * The Jupyter metadata namespace
    */
  @JSName("jupyter")
  var jupyter_ICodeCellMetadata: PartialICodeCellJupyterMe = js.native
  
  /**
    * Whether the cell's output is scrolled, unscrolled, or autoscrolled.
    */
  var scrolled: Boolean | auto = js.native
}
object ICodeCellMetadata {
  
  @scala.inline
  def apply(
    collapsed: Boolean,
    jupyter: PartialICodeCellJupyterMe,
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): ICodeCellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellMetadata]
  }
  
  @scala.inline
  implicit class ICodeCellMetadataMutableBuilder[Self <: ICodeCellMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJupyter(value: PartialICodeCellJupyterMe): Self = StObject.set(x, "jupyter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrolled(value: Boolean | auto): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
  }
}
