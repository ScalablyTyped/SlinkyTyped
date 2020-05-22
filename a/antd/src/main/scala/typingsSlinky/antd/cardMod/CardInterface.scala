package typingsSlinky.antd.cardMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.gridMod.CardGridProps
import typingsSlinky.antd.metaMod.CardMetaProps
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardInterface extends FunctionComponent[CardProps] {
  var Grid: ReactComponentClass[CardGridProps] = js.native
  var Meta: ReactComponentClass[CardMetaProps] = js.native
}

