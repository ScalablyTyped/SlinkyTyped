package typingsSlinky.reactVirtualized.mod

import typingsSlinky.reactVirtualized.anon.ClassNameBottomLeftGrid
import typingsSlinky.reactVirtualized.anon.ClassNameBottomRightGrid
import typingsSlinky.reactVirtualized.esMultiGridMod.MultiGridProps
import typingsSlinky.reactVirtualized.esMultiGridMod.MultiGridState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "MultiGrid")
@js.native
class MultiGrid protected ()
  extends typingsSlinky.reactVirtualized.esMultiGridMod.MultiGrid {
  def this(props: MultiGridProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MultiGridProps, context: js.Any) = this()
}
/* static members */
object MultiGrid {
  
  @JSImport("react-virtualized", "MultiGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "MultiGrid.defaultProps")
  @js.native
  def defaultProps: ClassNameBottomRightGrid = js.native
  @scala.inline
  def defaultProps_=(x: ClassNameBottomRightGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized", "MultiGrid.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
  
  @JSImport("react-virtualized", "MultiGrid.propTypes")
  @js.native
  def propTypes: ClassNameBottomLeftGrid = js.native
  @scala.inline
  def propTypes_=(x: ClassNameBottomLeftGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
