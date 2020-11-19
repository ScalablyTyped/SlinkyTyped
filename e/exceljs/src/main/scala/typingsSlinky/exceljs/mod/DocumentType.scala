package typingsSlinky.exceljs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentType extends js.Object
@JSImport("exceljs", "DocumentType")
@js.native
object DocumentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType with Double] = js.native
  
  @js.native
  sealed trait Xlsx extends DocumentType
  /* 1 */ @js.native
  object Xlsx
    extends TopLevel[typingsSlinky.exceljs.mod.DocumentType.Xlsx with Double]
}
