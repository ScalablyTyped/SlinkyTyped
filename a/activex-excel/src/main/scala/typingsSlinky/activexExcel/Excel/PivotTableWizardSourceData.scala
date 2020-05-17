package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - scala.Nothing
  - typingsSlinky.activexExcel.Excel.Range
  - typingsSlinky.std.SafeArray[typingsSlinky.activexExcel.Excel.Range | java.lang.String]
  - java.lang.String
*/
trait PivotTableWizardSourceData[TSourceType] extends js.Object

object PivotTableWizardSourceData {
  @scala.inline
  implicit def apply[TSourceType](value: scala.Nothing): PivotTableWizardSourceData[TSourceType] = value.asInstanceOf[PivotTableWizardSourceData[TSourceType]]
  @scala.inline
  implicit def apply[TSourceType](value: Range): PivotTableWizardSourceData[TSourceType] = value.asInstanceOf[PivotTableWizardSourceData[TSourceType]]
  @scala.inline
  implicit def apply[TSourceType](value: SafeArray[Range | String]): PivotTableWizardSourceData[TSourceType] = value.asInstanceOf[PivotTableWizardSourceData[TSourceType]]
  @scala.inline
  implicit def apply[TSourceType](value: String): PivotTableWizardSourceData[TSourceType] = value.asInstanceOf[PivotTableWizardSourceData[TSourceType]]
  @scala.inline
  implicit def fromUndef[TSourceType, T](value: js.UndefOr[T])(implicit ev: T => PivotTableWizardSourceData[TSourceType]): PivotTableWizardSourceData[TSourceType] = value.asInstanceOf[PivotTableWizardSourceData[TSourceType]]
}

