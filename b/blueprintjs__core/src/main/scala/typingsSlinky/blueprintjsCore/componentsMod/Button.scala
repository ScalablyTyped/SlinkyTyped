package typingsSlinky.blueprintjsCore.componentsMod

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.blueprintjsCore.abstractButtonMod.IButtonProps
import typingsSlinky.react.mod.ButtonHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Button")
@js.native
class Button protected ()
  extends typingsSlinky.blueprintjsCore.buttonsMod.Button {
  def this(props: IButtonProps with ButtonHTMLAttributes[HTMLButtonElement]) = this()
  def this(props: IButtonProps with ButtonHTMLAttributes[HTMLButtonElement], context: js.Any) = this()
}
/* static members */
object Button {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Button.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
