package typingsSlinky.officeJsPreview.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how to coerce data returned or set by the invoked method.
  *
  * @remarks
  *
  * PowerPoint supports only `Office.CoercionType.Text`, `Office.CoercionType.Image`, `Office.CoercionType.SlideRange`, and `Office.CoercionType.XmlSvg`.
  *
  * Project supports only `Office.CoercionType.Text`.
  */
@JSGlobal("Office.CoercionType")
@js.native
object CoercionType extends js.Object {
  /* 3 */ val Html: typingsSlinky.officeJsPreview.Office.CoercionType.Html with Double = js.native
  /* 6 */ val Image: typingsSlinky.officeJsPreview.Office.CoercionType.Image with Double = js.native
  /* 1 */ val Matrix: typingsSlinky.officeJsPreview.Office.CoercionType.Matrix with Double = js.native
  /* 4 */ val Ooxml: typingsSlinky.officeJsPreview.Office.CoercionType.Ooxml with Double = js.native
  /* 5 */ val SlideRange: typingsSlinky.officeJsPreview.Office.CoercionType.SlideRange with Double = js.native
  /* 2 */ val Table: typingsSlinky.officeJsPreview.Office.CoercionType.Table with Double = js.native
  /* 0 */ val Text: typingsSlinky.officeJsPreview.Office.CoercionType.Text with Double = js.native
  /* 7 */ val XmlSvg: typingsSlinky.officeJsPreview.Office.CoercionType.XmlSvg with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.officeJsPreview.Office.CoercionType with Double] = js.native
}

