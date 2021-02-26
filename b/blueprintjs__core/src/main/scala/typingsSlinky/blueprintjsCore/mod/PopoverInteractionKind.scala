package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`click-target`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.click
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverInteractionKind {
  
  @JSImport("@blueprintjs/core", "PopoverInteractionKind")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "PopoverInteractionKind.CLICK")
  @js.native
  def CLICK: click = js.native
  @scala.inline
  def CLICK_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "PopoverInteractionKind.CLICK_TARGET_ONLY")
  @js.native
  def CLICK_TARGET_ONLY: `click-target` = js.native
  @scala.inline
  def CLICK_TARGET_ONLY_=(x: `click-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_TARGET_ONLY")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "PopoverInteractionKind.HOVER")
  @js.native
  def HOVER: hover = js.native
  @scala.inline
  def HOVER_=(x: hover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "PopoverInteractionKind.HOVER_TARGET_ONLY")
  @js.native
  def HOVER_TARGET_ONLY: `hover-target` = js.native
  @scala.inline
  def HOVER_TARGET_ONLY_=(x: `hover-target`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOVER_TARGET_ONLY")(x.asInstanceOf[js.Any])
}
