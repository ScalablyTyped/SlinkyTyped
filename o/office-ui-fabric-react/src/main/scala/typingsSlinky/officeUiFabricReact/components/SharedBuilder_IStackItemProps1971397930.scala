package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.auto
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.initial
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.unset
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemStyles
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemTokens
import typingsSlinky.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IStackItemProps1971397930 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def align(value: auto | stretch | baseline | start | center | end): this.type = set("align", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableShrink(value: Boolean): this.type = set("disableShrink", value.asInstanceOf[js.Any])
  
  @scala.inline
  def grow(value: Boolean | Double | inherit | initial | unset): this.type = set("grow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def order(value: Double | String): this.type = set("order", value.asInstanceOf[js.Any])
  
  @scala.inline
  def root(value: IHTMLSlot): this.type = set("root", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shrink(value: Boolean | Double | inherit | initial | unset): this.type = set("shrink", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stylesFunction3(value: (IStackItemProps, /* theme */ ITheme, IStackItemTokens) => IStackItemStyles): this.type = set("styles", js.Any.fromFunction3(value))
  
  @scala.inline
  def styles(value: IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tokens(value: ITokenFunctionOrObject[IStackItemProps, IStackItemTokens]): this.type = set("tokens", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalFill(value: Boolean): this.type = set("verticalFill", value.asInstanceOf[js.Any])
}
