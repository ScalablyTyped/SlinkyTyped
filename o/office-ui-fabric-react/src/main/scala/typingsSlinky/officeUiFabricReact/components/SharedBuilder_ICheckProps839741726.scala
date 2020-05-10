package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.checkTypesMod.ICheckProps
import typingsSlinky.officeUiFabricReact.checkTypesMod.ICheckStyleProps
import typingsSlinky.officeUiFabricReact.checkTypesMod.ICheckStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ICheckProps839741726 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def alwaysShowCheck(value: Boolean): this.type = set("alwaysShowCheck", value.asInstanceOf[js.Any])
  @scala.inline
  def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def componentRefFunction1(value: /* ref */ ICheckProps | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
  @scala.inline
  def componentRefRefObject(value: ReactRef[ICheckProps]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  @scala.inline
  def componentRef(value: IRefObject[ICheckProps]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  @scala.inline
  def stylesFunction1(value: ICheckStyleProps => Partial[ICheckStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  @scala.inline
  def styles(value: IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  @scala.inline
  def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
}

