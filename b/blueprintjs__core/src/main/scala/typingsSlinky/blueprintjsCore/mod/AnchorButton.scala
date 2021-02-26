package typingsSlinky.blueprintjsCore.mod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.blueprintjsCore.abstractButtonMod.IButtonProps
import typingsSlinky.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "AnchorButton")
@js.native
class AnchorButton protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.AnchorButton {
  def this(props: IButtonProps with AnchorHTMLAttributes[HTMLAnchorElement]) = this()
  def this(props: IButtonProps with AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
}
/* static members */
object AnchorButton {
  
  @JSImport("@blueprintjs/core", "AnchorButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "AnchorButton.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
