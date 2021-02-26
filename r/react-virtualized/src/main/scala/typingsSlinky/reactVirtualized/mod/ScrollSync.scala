package typingsSlinky.reactVirtualized.mod

import typingsSlinky.reactVirtualized.anon.ChildrenValidator
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "ScrollSync")
@js.native
class ScrollSync protected ()
  extends typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSync {
  def this(props: ScrollSyncProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ScrollSyncProps, context: js.Any) = this()
}
/* static members */
object ScrollSync {
  
  @JSImport("react-virtualized", "ScrollSync")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "ScrollSync.propTypes")
  @js.native
  def propTypes: ChildrenValidator = js.native
  @scala.inline
  def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
