package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swan {
  type AccelerometerChangeCallback = js.Function1[/* res */ typingsSlinky.baiduApp.swan.AccelerometerData, scala.Unit]
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
  type BuiltInEvent[T /* <: typingsSlinky.baiduApp.swan.EventType */, Detail] = typingsSlinky.baiduApp.swan.BaseEvent[T, Detail]
  type CheckSessionOption = typingsSlinky.baiduApp.swan.BaseOptions[js.Any, js.Any]
  // CombinedInstance models the `this`, i.e. instance type for (user defined) component
  type CombinedInstance[Instance /* <: typingsSlinky.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = Methods with Instance
  type CompassChangeCallback = js.Function1[/* res */ typingsSlinky.baiduApp.swan.CompassData, scala.Unit]
  type CompassOptions = typingsSlinky.baiduApp.swan.BaseOptions[js.Any, js.Any]
  type CustomEvent[T /* <: java.lang.String */, Detail] = typingsSlinky.baiduApp.swan.BaseEvent[T, Detail]
  /**
    * There are two valid ways to define the type of data / properties:
    *
    * 1. { name: valueType }
    * 2. { name: { type: valueType, value?: value } }
    *
    * and this conditional type will extract that out so the call-site will typecheck.
    *
    * Note this is different from PropOptions as it is the definitions you passed to Component function
    * whereas this type is for call-site.
    */
  type DataValueType[Def] = js.Any
  // #endregion
  // #region Compontent组件
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = js.Object | (typingsSlinky.std.Record[java.lang.String, js.Any])
  type ExtendedComponent[Instance /* <: typingsSlinky.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = (typingsSlinky.baiduApp.swan.CombinedInstance[Instance, Data, Methods, Props]) with (typingsSlinky.baiduApp.swan.Component[Data, Props])
  type FormEvent = typingsSlinky.baiduApp.swan.BuiltInEvent[typingsSlinky.baiduApp.baiduAppStrings.form, typingsSlinky.baiduApp.anon.Value]
  /**
    * 指定focus时的光标位置
    * @version 1.5.0
    */
  type InputEvent = typingsSlinky.baiduApp.swan.BuiltInEvent[typingsSlinky.baiduApp.baiduAppStrings.input, typingsSlinky.baiduApp.anon.Cursor]
  type Prop[T] = js.Function0[T] | typingsSlinky.baiduApp.anon.Instantiable[T]
  type PropValidator[T] = typingsSlinky.baiduApp.swan.PropOptions[T] | typingsSlinky.baiduApp.swan.Prop[T] | js.Array[typingsSlinky.baiduApp.swan.Prop[T]]
  type PropsDefinition[T] = typingsSlinky.baiduApp.swan.ArrayPropsDefinition[T] | typingsSlinky.baiduApp.swan.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: baidu-app.swan.PropValidator<T[K]>}
    */ typingsSlinky.baiduApp.baiduAppStrings.RecordPropsDefinition with org.scalablytyped.runtime.TopLevel[T]
  // #endregion
  // #region 网络API列表
  // 发起请求
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ScrollEvent = typingsSlinky.baiduApp.swan.BuiltInEvent[typingsSlinky.baiduApp.baiduAppStrings.scroll, js.Object]
  type TapEvent = typingsSlinky.baiduApp.swan.TouchEvent[typingsSlinky.baiduApp.baiduAppStrings.tap]
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typingsSlinky.baiduApp.swan.Component[Data, Props] */, Data, Methods, Props] = js.Object with (typingsSlinky.baiduApp.swan.ComponentOptions[V, Data, Methods, Props]) with (typingsSlinky.std.ThisType[typingsSlinky.baiduApp.swan.CombinedInstance[V, Data, Methods, Props]])
  type TouchCancelEvent = typingsSlinky.baiduApp.swan.TouchEvent[typingsSlinky.baiduApp.baiduAppStrings.touchcancel]
  type TouchEndEvent = typingsSlinky.baiduApp.swan.TouchEvent[typingsSlinky.baiduApp.baiduAppStrings.touchend]
  type TouchForceChangeEvent = typingsSlinky.baiduApp.swan.TouchEvent[typingsSlinky.baiduApp.baiduAppStrings.touchforcechange]
  type TouchMoveEvent = typingsSlinky.baiduApp.swan.TouchEvent[typingsSlinky.baiduApp.baiduAppStrings.touchmove]
  type TouchStartEvent = typingsSlinky.baiduApp.swan.TouchEvent[typingsSlinky.baiduApp.baiduAppStrings.touchstart]
}
