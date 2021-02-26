package typingsSlinky.reactOverlays.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.anon.OmitUsePopperOptionsenabl
import typingsSlinky.reactOverlays.anon.Popper
import typingsSlinky.reactOverlays.esmUsePopperMod.Offset
import typingsSlinky.reactOverlays.esmUsePopperMod.OffsetValue
import typingsSlinky.reactOverlays.esmUseRootCloseMod.MouseEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DropdownMenuProps1532764967 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
  
  @scala.inline
  def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def offsetFunction1(value: /* details */ Popper => OffsetValue): this.type = set("offset", js.Any.fromFunction1(value))
  
  @scala.inline
  def popperConfig(value: OmitUsePopperOptionsenabl): this.type = set("popperConfig", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootCloseEvent(value: MouseEvents): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  
  @scala.inline
  def usePopper(value: Boolean): this.type = set("usePopper", value.asInstanceOf[js.Any])
}
