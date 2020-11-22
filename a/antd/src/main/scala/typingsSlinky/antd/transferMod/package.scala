package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transferMod {
  
  type KeyWise[T] = T with typingsSlinky.antd.anon.Key
  
  type RenderResult = slinky.core.facade.ReactElement | typingsSlinky.antd.transferMod.RenderResultObject | java.lang.String | scala.Null
  
  type SelectAllLabel = slinky.core.facade.ReactElement | (js.Function1[/* info */ typingsSlinky.antd.anon.SelectedCount, slinky.core.facade.ReactElement])
  
  type TransferRender[RecordType] = js.Function1[/* item */ RecordType, typingsSlinky.antd.transferMod.RenderResult]
}
