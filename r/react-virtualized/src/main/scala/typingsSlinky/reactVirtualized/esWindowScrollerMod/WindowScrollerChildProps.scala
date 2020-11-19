package typingsSlinky.reactVirtualized.esWindowScrollerMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactVirtualized.anon.ScrollTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowScrollerChildProps extends js.Object {
  
  var height: Double = js.native
  
  var isScrolling: Boolean = js.native
  
  def onChildScroll(params: ScrollTop): Unit = js.native
  
  def registerChild(): Unit = js.native
  def registerChild(element: ReactElement): Unit = js.native
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
  
  var width: Double = js.native
}
