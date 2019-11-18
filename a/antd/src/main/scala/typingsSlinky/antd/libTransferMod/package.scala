package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransferMod {
  import typingsSlinky.react.reactMod.ReactElement

  type RenderResult = ReactElement | RenderResultObject | String | Null
  type TransferRender = js.Function1[/* item */ TransferItem, RenderResult]
}
