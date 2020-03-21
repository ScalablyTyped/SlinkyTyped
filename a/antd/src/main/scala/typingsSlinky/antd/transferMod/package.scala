package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transferMod {
  type RenderResult = slinky.core.facade.ReactElement | typingsSlinky.antd.transferMod.RenderResultObject | java.lang.String | scala.Null
  type SelectAllLabel = slinky.core.TagMod[scala.Any] | (js.Function1[/* info */ typingsSlinky.antd.AnonSelectedCount, slinky.core.TagMod[scala.Any]])
  type TransferRender = js.Function1[
    /* item */ typingsSlinky.antd.transferMod.TransferItem, 
    typingsSlinky.antd.transferMod.RenderResult
  ]
}
