package typingsSlinky.rcSelect

import typingsSlinky.rcSelect.anon.OptionFilterProp
import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcSelect.generatorMod.GetLabeledValue
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.FlattenOptionData
import typingsSlinky.rcSelect.interfaceMod.OptionData
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-select/lib/utils/valueUtil", JSImport.Namespace)
@js.native
object valueUtilMod extends js.Object {
  
  def fillOptionsWithMissingValue(options: OptionsType, value: DefaultValueType, optionLabelProp: String, labelInValue: Boolean): OptionsType = js.native
  
  def filterOptions(searchValue: String, options: OptionsType, hasOptionFilterPropFilterOption: OptionFilterProp): OptionsType = js.native
  
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenOptionData]): js.Array[OptionData] = js.native
  
  def flattenOptions(options: OptionsType): js.Array[FlattenOptionData] = js.native
  
  val getLabeledValue: GetLabeledValue[js.Array[FlattenOptionData]] = js.native
  
  def getSeparatedContent(text: String, tokens: js.Array[String]): js.Array[String] = js.native
  
  def isValueDisabled(value: RawValueType, options: js.Array[FlattenOptionData]): Boolean = js.native
}
