package typingsSlinky.reactVirtualized.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Requireable
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esColumnSizerMod.SizedColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: Validator[js.Function1[/* props */ SizedColumnProps, ReactElement]] = js.native
  
  var columnCount: Validator[Double] = js.native
  
  var columnMaxWidth: Requireable[Double] = js.native
  
  var columnMinWidth: Requireable[Double] = js.native
  
  var width: Validator[Double] = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ SizedColumnProps, ReactElement]],
    columnCount: Validator[Double],
    columnMaxWidth: Requireable[Double],
    columnMinWidth: Requireable[Double],
    width: Validator[Double]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnMaxWidth = columnMaxWidth.asInstanceOf[js.Any], columnMinWidth = columnMinWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Validator[js.Function1[/* props */ SizedColumnProps, ReactElement]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Validator[Double]): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMaxWidth(value: Requireable[Double]): Self = StObject.set(x, "columnMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMinWidth(value: Requireable[Double]): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Validator[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
