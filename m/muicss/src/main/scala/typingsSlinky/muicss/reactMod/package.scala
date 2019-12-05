package typingsSlinky.muicss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLOptionElement
  import typingsSlinky.react.reactMod.HTMLAttributes
  import typingsSlinky.react.reactMod.OptionHTMLAttributes

  type DivProps = HTMLAttributes[HTMLDivElement]
  type DividerProps = DivProps
  type OptionProps = OptionHTMLAttributes[HTMLOptionElement]
  type PanelProps = DivProps
  type RadioProps = CheckboxProps
}
