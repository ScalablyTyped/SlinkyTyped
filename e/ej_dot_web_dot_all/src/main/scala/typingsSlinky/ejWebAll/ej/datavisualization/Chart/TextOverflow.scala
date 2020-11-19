package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextOverflow extends js.Object
@JSGlobal("ej.datavisualization.Chart.TextOverflow")
@js.native
object TextOverflow extends js.Object {
  
  //string
  @js.native
  sealed trait None extends TextOverflow
  
  //string
  @js.native
  sealed trait Trim extends TextOverflow
  
  //string
  @js.native
  sealed trait Wrap extends TextOverflow
  
  //string
  @js.native
  sealed trait WrapAndTrim extends TextOverflow
}
