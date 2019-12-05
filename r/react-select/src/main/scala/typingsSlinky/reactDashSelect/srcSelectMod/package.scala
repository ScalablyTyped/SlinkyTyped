package typingsSlinky.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcSelectMod {
  import org.scalajs.dom.raw.HTMLElement
  import slinky.web.SyntheticMouseEvent
  import slinky.web.SyntheticTouchEvent
  import typingsSlinky.react.reactMod.Ref

  type ElRef = Ref[js.Any]
  type MouseOrTouchEvent = SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement]
  type SelectComponentsProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typingsSlinky.reactDashSelect.reactDashSelectStrings.SelectComponentsProps with js.Any
}
