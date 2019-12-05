package typingsSlinky.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcBrowserPublicDashInterfacesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.angular.angularMod.IPromise
  import typingsSlinky.angular.angularMod.IScope
  import typingsSlinky.ngDashTable.Anon_Column

  type ColumnFieldContext = IScope with Anon_Column
  type DynamicTableColField[T] = IDynamicTableColFieldFunc[T] | T
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ ColumnFieldContext, T]
  type IFilterTemplateDefMap = StringDictionary[String | IFilterTemplateDef]
  type ISelectDataFunc = js.Function0[js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]]
  type SelectData = js.Array[ISelectOption] | ISelectDataFunc
}
