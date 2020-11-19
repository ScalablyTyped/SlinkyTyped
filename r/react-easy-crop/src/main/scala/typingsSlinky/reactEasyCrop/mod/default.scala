package typingsSlinky.reactEasyCrop.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Touch
import typingsSlinky.reactEasyCrop.anon.Aspect
import typingsSlinky.reactEasyCrop.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-easy-crop", JSImport.Default)
@js.native
class default () extends Cropper
/* static members */
@JSImport("react-easy-crop", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: Aspect = js.native
  
  def getMousePoint(e: SyntheticMouseEvent[Element]): X = js.native
  def getMousePoint(e: MouseEvent): X = js.native
  
  def getTouchPoint(touch: Touch): X = js.native
  def getTouchPoint(touch: org.scalajs.dom.raw.Touch): X = js.native
}
