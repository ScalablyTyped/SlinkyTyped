package typingsSlinky.rcTreeSelect

import slinky.core.facade.ReactElement
import typingsSlinky.rcTreeSelect.anon.FilterOption
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.DefaultValueType
import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.LabelValueType
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.rcTreeSelect.useKeyValueMappingMod.SkipType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/es/utils/valueUtil", JSImport.Namespace)
@js.native
object valueUtilMod extends js.Object {
  def addValue(rawValues: js.Array[RawValueType], value: RawValueType): js.Array[String | Double] = js.native
  def filterOptions(searchValue: String, options: js.Array[DataNode], hasOptionFilterPropFilterOption: FilterOption): js.Array[DataNode] = js.native
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenDataNode]): js.Array[DataNode] = js.native
  def flattenOptions(options: js.Array[DataNode]): js.Array[FlattenDataNode] = js.native
  def getRawValueLabeled(
    values: js.Array[RawValueType],
    prevValue: DefaultValueType,
    getEntityByValue: js.Function3[
      /* value */ RawValueType, 
      /* skipType */ js.UndefOr[SkipType], 
      /* ignoreDisabledCheck */ js.UndefOr[Boolean], 
      FlattenDataNode
    ],
    getLabelProp: js.Function1[/* node */ DataNode, ReactElement]
  ): js.Array[LabelValueType] = js.native
  def isCheckDisabled(node: DataNode): Boolean = js.native
  def isValueDisabled(value: RawValueType, options: js.Array[FlattenDataNode]): Boolean = js.native
  def removeValue(rawValues: js.Array[RawValueType], value: RawValueType): js.Array[String | Double] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
}

