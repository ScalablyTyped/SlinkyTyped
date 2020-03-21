package typingsSlinky.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object publicInterfacesMod {
  type DynamicTableColField[T] = typingsSlinky.ngTable.publicInterfacesMod.IDynamicTableColFieldFunc[T] | T
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ typingsSlinky.ngTable.publicInterfacesMod.ColumnFieldContext, T]
  type IFilterTemplateDefMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.ngTable.publicInterfacesMod.IFilterTemplateDef]
  type ISelectDataFunc = js.Function0[
    js.Array[typingsSlinky.ngTable.publicInterfacesMod.ISelectOption] | typingsSlinky.angular.mod.IPromise[js.Array[typingsSlinky.ngTable.publicInterfacesMod.ISelectOption]]
  ]
  type SelectData = js.Array[typingsSlinky.ngTable.publicInterfacesMod.ISelectOption] | typingsSlinky.ngTable.publicInterfacesMod.ISelectDataFunc
}
