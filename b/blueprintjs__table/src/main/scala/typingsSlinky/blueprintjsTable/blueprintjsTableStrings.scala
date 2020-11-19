package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsTable.tableQuadrantStackCacheMod.ScrollKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blueprintjsTableStrings {
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @scala.inline
  def scrollLeft: scrollLeft = "scrollLeft".asInstanceOf[scrollLeft]
  
  @scala.inline
  def scrollTop: scrollTop = "scrollTop".asInstanceOf[scrollTop]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait scrollLeft extends ScrollKey
  
  @js.native
  sealed trait scrollTop extends ScrollKey
  
  @js.native
  sealed trait vertical extends js.Object
}
