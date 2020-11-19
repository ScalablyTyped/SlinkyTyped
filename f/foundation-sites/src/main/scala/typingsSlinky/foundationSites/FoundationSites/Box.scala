package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Utilities
// ---------
@js.native
trait Box extends js.Object {
  
  def GetDimensions(element: js.Object): js.Object = js.native
  
  def GetOffsets(
    element: js.Object,
    anchor: js.Object,
    position: String,
    vOffset: Double,
    hOffset: Double,
    isOverflow: Boolean
  ): js.Object = js.native
  
  def ImNotTouchingYou(element: js.Object): Boolean = js.native
  def ImNotTouchingYou(
    element: js.Object,
    parent: js.UndefOr[scala.Nothing],
    lrOnly: js.UndefOr[scala.Nothing],
    tbOnly: Boolean
  ): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.UndefOr[scala.Nothing], lrOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.UndefOr[scala.Nothing], lrOnly: Boolean, tbOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: js.UndefOr[scala.Nothing], tbOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Boolean, tbOnly: Boolean): Boolean = js.native
}
