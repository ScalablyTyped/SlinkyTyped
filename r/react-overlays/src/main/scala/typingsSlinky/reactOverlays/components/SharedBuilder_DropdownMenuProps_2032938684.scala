package typingsSlinky.reactOverlays.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.anon.Placement
import typingsSlinky.reactOverlays.reactOverlaysStrings.enabled
import typingsSlinky.reactOverlays.reactOverlaysStrings.placement
import typingsSlinky.reactOverlays.usePopperMod.Offset
import typingsSlinky.reactOverlays.usePopperMod.OffsetValue
import typingsSlinky.reactOverlays.usePopperMod.UsePopperOptions
import typingsSlinky.reactOverlays.useRootCloseMod.MouseEvents
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DropdownMenuProps_2032938684 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
  
  @scala.inline
  def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
  
  @scala.inline
  def offsetFunction1(value: /* details */ Placement => OffsetValue): this.type = set("offset", js.Any.fromFunction1(value))
  
  @scala.inline
  def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popperConfig(value: Omit[UsePopperOptions, enabled | placement]): this.type = set("popperConfig", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootCloseEvent(value: MouseEvents): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  
  @scala.inline
  def usePopper(value: Boolean): this.type = set("usePopper", value.asInstanceOf[js.Any])
}
