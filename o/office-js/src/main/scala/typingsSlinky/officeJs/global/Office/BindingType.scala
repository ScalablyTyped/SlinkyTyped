package typingsSlinky.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the type of the binding object that should be returned.
  */
@JSGlobal("Office.BindingType")
@js.native
object BindingType extends js.Object {
  /* 1 */ val Matrix: typingsSlinky.officeJs.Office.BindingType.Matrix with Double = js.native
  /* 2 */ val Table: typingsSlinky.officeJs.Office.BindingType.Table with Double = js.native
  /* 0 */ val Text: typingsSlinky.officeJs.Office.BindingType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJs.Office.BindingType with Double] = js.native
}

