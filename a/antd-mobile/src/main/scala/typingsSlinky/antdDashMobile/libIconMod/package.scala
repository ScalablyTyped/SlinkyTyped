package typingsSlinky.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIconMod {
  import org.scalajs.dom.raw.SVGSVGElement
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.`type`
  import typingsSlinky.antdDashMobile.antdDashMobileStrings.size
  import typingsSlinky.antdDashMobile.libUnderscoreUtilTypesMod.Omit
  import typingsSlinky.react.reactMod.HTMLProps

  type SvgProps = Omit[HTMLProps[SVGSVGElement], size | `type`]
}
