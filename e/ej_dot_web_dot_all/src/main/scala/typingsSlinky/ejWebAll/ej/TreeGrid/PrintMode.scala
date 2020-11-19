package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintMode extends js.Object
@JSGlobal("ej.TreeGrid.PrintMode")
@js.native
object PrintMode extends js.Object {
  
  ///To print all the pages
  @js.native
  sealed trait AllPages extends PrintMode
  
  ///To print only the current page content.
  @js.native
  sealed trait CurrentPage extends PrintMode
}
