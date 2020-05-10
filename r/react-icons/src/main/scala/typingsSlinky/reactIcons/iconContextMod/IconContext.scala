package typingsSlinky.reactIcons.iconContextMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconContext extends js.Object {
  var attr: js.UndefOr[SVGAttributes[SVGElement]] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

@JSImport("react-icons/lib/esm/iconContext", "IconContext")
@js.native
object IconContext extends TopLevel[Context[IconContext]]

