package typingsSlinky.reactWindow.mod

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedSizeListProps extends ListProps {
  
  /**
    * Size of a item in the direction being windowed. For vertical lists, this is the row height. For horizontal lists, this is the column width.
    */
  var itemSize: Double = js.native
}
object FixedSizeListProps {
  
  @scala.inline
  def apply(
    children: ReactComponentClass[ListChildComponentProps],
    height: Double | String,
    itemCount: Double,
    itemSize: Double,
    width: Double | String
  ): FixedSizeListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedSizeListProps]
  }
  
  @scala.inline
  implicit class FixedSizeListPropsMutableBuilder[Self <: FixedSizeListProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
  }
}
