package typingsSlinky.blueprintjsCore.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.blueprintjsCore.iconMod.IIconProps
import typingsSlinky.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Icon")
@js.native
class Icon protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Icon {
  def this(props: IIconProps with DOMAttributes[HTMLElement]) = this()
  def this(props: IIconProps with DOMAttributes[HTMLElement], context: js.Any) = this()
}
/* static members */
object Icon {
  
  @JSImport("@blueprintjs/core", "Icon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Icon.SIZE_LARGE")
  @js.native
  val SIZE_LARGE: /* 20 */ Double = js.native
  
  @JSImport("@blueprintjs/core", "Icon.SIZE_STANDARD")
  @js.native
  val SIZE_STANDARD: /* 16 */ Double = js.native
  
  @JSImport("@blueprintjs/core", "Icon.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
