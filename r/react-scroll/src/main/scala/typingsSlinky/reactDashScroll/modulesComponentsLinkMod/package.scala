package typingsSlinky.reactDashScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modulesComponentsLinkMod {
  import org.scalajs.dom.raw.HTMLButtonElement
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.HTMLProps

  type Link = ReactComponentClass[LinkProps]
  type LinkProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}
