package typingsSlinky.antDesignProUtils

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProUtils.anon.Id
import typingsSlinky.antDesignProUtils.anon.Label
import typingsSlinky.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typingsSlinky.antDesignProUtils.conversionSubmitValueMod.DateFormatter
import typingsSlinky.antDesignProUtils.fieldLabelMod.FieldLabelProps
import typingsSlinky.antDesignProUtils.filterDropdownMod.DropdownProps
import typingsSlinky.antDesignProUtils.parseValueToMomentMod.DateValue
import typingsSlinky.antDesignProUtils.typingMod.SearchTransformKeyFn
import typingsSlinky.antDesignProUtils.useDebounceFnMod.ReturnValue
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-utils", "FieldLabel")
  @js.native
  val FieldLabel: ReactComponentClass[FieldLabelProps] = js.native
  
  @JSImport("@ant-design/pro-utils", "FilterDropdown")
  @js.native
  val FilterDropdown: ReactComponentClass[DropdownProps] = js.native
  
  /**
    * 在 form 的 label 后面增加一个 tips 来展示一些说明文案
    * @param props
    */
  @JSImport("@ant-design/pro-utils", "LabelIconTip")
  @js.native
  val LabelIconTip: ReactComponentClass[Label] = js.native
  
  /**
    * 这里主要是来转化一下数据
    * 将 moment 转化为 string
    * 将 all 默认删除
    * @param value
    * @param dateFormatter
    * @param proColumnsMap
    */
  @JSImport("@ant-design/pro-utils", "conversionSubmitValue")
  @js.native
  def conversionSubmitValue[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any]): T = js.native
  @JSImport("@ant-design/pro-utils", "conversionSubmitValue")
  @js.native
  def conversionSubmitValue[T](value: T, dateFormatter: DateFormatter, valueTypeMap: StringDictionary[js.Any], parentKey: String): T = js.native
  
  @JSImport("@ant-design/pro-utils", "isBrowser")
  @js.native
  def isBrowser(): Boolean = js.native
  
  @JSImport("@ant-design/pro-utils", "isDropdownValueType")
  @js.native
  def isDropdownValueType(valueType: String): Boolean = js.native
  
  @JSImport("@ant-design/pro-utils", "isImg")
  @js.native
  def isImg(path: String): Boolean = js.native
  
  @JSImport("@ant-design/pro-utils", "isNil")
  @js.native
  def isNil(value: js.Any): Boolean = js.native
  
  @JSImport("@ant-design/pro-utils", "isUrl")
  @js.native
  def isUrl(path: String): Boolean = js.native
  
  @JSImport("@ant-design/pro-utils", "omitUndefined")
  @js.native
  def omitUndefined[T](obj: T): T = js.native
  
  @JSImport("@ant-design/pro-utils", "omitUndefinedAndEmptyArr")
  @js.native
  def omitUndefinedAndEmptyArr[T](obj: T): T = js.native
  
  @JSImport("@ant-design/pro-utils", "parseValueToMoment")
  @js.native
  def parseValueToMoment(value: DateValue): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  @JSImport("@ant-design/pro-utils", "parseValueToMoment")
  @js.native
  def parseValueToMoment(value: DateValue, formatter: String): js.UndefOr[Moment | js.Array[Moment] | Null] = js.native
  
  @JSImport("@ant-design/pro-utils", "pickProFormItemProps")
  @js.native
  def pickProFormItemProps(props: js.Object): js.Object = js.native
  
  @JSImport("@ant-design/pro-utils", "pickProProps")
  @js.native
  def pickProProps(props: js.Object): js.Object = js.native
  
  @JSImport("@ant-design/pro-utils", "transformKeySubmitValue")
  @js.native
  def transformKeySubmitValue[T](values: T, dataFormatMap: StringDictionary[js.UndefOr[SearchTransformKeyFn]]): T = js.native
  
  @JSImport("@ant-design/pro-utils", "useDebounceFn")
  @js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: Double): ReturnValue[T] = js.native
  @JSImport("@ant-design/pro-utils", "useDebounceFn")
  @js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: Double, wait: Double): ReturnValue[T] = js.native
  @JSImport("@ant-design/pro-utils", "useDebounceFn")
  @js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: DependencyList): ReturnValue[T] = js.native
  @JSImport("@ant-design/pro-utils", "useDebounceFn")
  @js.native
  def useDebounceFn[T /* <: js.Array[_] */](fn: js.Function1[/* args */ T, js.Promise[_]], deps: DependencyList, wait: Double): ReturnValue[T] = js.native
  
  @JSImport("@ant-design/pro-utils", "useDeepCompareEffect")
  @js.native
  def useDeepCompareEffect(effect: EffectCallback): Unit = js.native
  @JSImport("@ant-design/pro-utils", "useDeepCompareEffect")
  @js.native
  def useDeepCompareEffect(effect: EffectCallback, dependencies: DependencyList): Unit = js.native
  
  @JSImport("@ant-design/pro-utils", "useDocumentTitle")
  @js.native
  def useDocumentTitle(titleInfo: Id, appDefaultTitle: String): Unit = js.native
  @JSImport("@ant-design/pro-utils", "useDocumentTitle")
  @js.native
  def useDocumentTitle_false(titleInfo: Id, appDefaultTitle: `false`): Unit = js.native
  
  @JSImport("@ant-design/pro-utils", "usePrevious")
  @js.native
  def usePrevious[T](state: T): js.UndefOr[T] = js.native
}
