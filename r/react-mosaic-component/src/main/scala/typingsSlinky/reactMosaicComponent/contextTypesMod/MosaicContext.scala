package typingsSlinky.reactMosaicComponent.contextTypesMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Context
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MosaicContext[T /* <: MosaicKey */] extends js.Object {
  var mosaicActions: MosaicRootActions[T] = js.native
  var mosaicId: String = js.native
}

@JSImport("react-mosaic-component/lib/contextTypes", "MosaicContext")
@js.native
object MosaicContext extends TopLevel[Context[MosaicContext[String | Double]]]

