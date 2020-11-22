package typingsSlinky.reactNative.mod

import typingsSlinky.react.mod.ComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListStatic[ItemT, SectionT]
  extends ComponentClass[SectionListProps[ItemT, SectionT], js.Object] {
  
  /**
    * Scrolls to the item at the specified sectionIndex and itemIndex (within the section)
    * positioned in the viewable area such that viewPosition 0 places it at the top
    * (and may be covered by a sticky header), 1 at the bottom, and 0.5 centered in the middle.
    */
  var scrollToLocation: js.UndefOr[js.Function1[/* params */ SectionListScrollParams, Unit]] = js.native
}
