package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transferMod {
  type RenderResult = slinky.core.facade.ReactElement | typingsSlinky.antd.transferMod.RenderResultObject | java.lang.String | scala.Null
  type SelectAllLabel = slinky.core.facade.ReactElement | (js.Function1[/* info */ typingsSlinky.antd.anon.SelectedCount, slinky.core.facade.ReactElement])
  type TransferRender = js.Function1[
    /* item */ typingsSlinky.antd.transferMod.TransferItem, 
    typingsSlinky.antd.transferMod.RenderResult
  ]
}
