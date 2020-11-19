package typingsSlinky.blueprintjsTable.selectableMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragSelectableProps extends ISelectableProps {
  
  /**
    * Whether the selection behavior is disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  
  /**
    * A list of CSS selectors that should _not_ trigger selection when a `mousedown` occurs inside of them.
    */
  var ignoredSelectors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A callback that determines a `Region` for the single `MouseEvent`. If
    * no valid region can be found, `null` may be returned.
    */
  def locateClick(event: MouseEvent): IRegion = js.native
  
  /**
    * A callback that determines a `Region` for the `MouseEvent` and
    * coordinate data representing a drag. If no valid region can be found,
    * `null` may be returned.
    */
  def locateDrag(event: MouseEvent, coords: ICoordinateData): IRegion = js.native
  def locateDrag(event: MouseEvent, coords: ICoordinateData, returnEndOnly: Boolean): IRegion = js.native
}
