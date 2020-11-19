package typingsSlinky.antdMobileRn.indexNativeMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accordion
  extends Component[AccordionNativeProps, js.Any, js.Any] {
  
  def onChange(idx: Double): Unit = js.native
  
  def renderContent(section: AccordionHeader): ReactElement = js.native
  
  def renderHeader(section: AccordionHeader, _underscore: Double, isActive: Boolean): ReactElement = js.native
}
