package typingsSlinky.rcSelect

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcSelect.anon.Combobox
import typingsSlinky.rcSelect.anon.GetLabeledValue
import typingsSlinky.rcSelect.anon.RemovedValue
import typingsSlinky.rcSelect.anon.`0`
import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcSelect.generatorMod.FlattenOptionsType
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-select/lib/utils/commonUtil", JSImport.Namespace)
@js.native
object commonUtilMod extends js.Object {
  val isBrowserClient: HTMLElement = js.native
  val isClient: HTMLElement = js.native
  def getUUID(): Double | String = js.native
  def removeLastEnabledValue[T /* <: `0` */, P /* <: RawValueType | js.Object */](measureValues: js.Array[T], values: js.Array[P]): RemovedValue[P] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toInnerValue(value: DefaultValueType, hasLabelInValueCombobox: Combobox): js.Array[RawValueType] = js.native
  def toOuterValues[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */](
    valueList: js.Array[RawValueType],
    hasOptionLabelPropLabelInValuePrevValueOptionsGetLabeledValue: GetLabeledValue[FOT]
  ): js.Array[LabelValueType | RawValueType] = js.native
}

