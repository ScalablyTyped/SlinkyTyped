package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typingsSlinky.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerPropsStyles
import typingsSlinky.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_IVerticalDividerProps_601226333 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def getClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): this.type = set("getClassNames", js.Any.fromFunction1(value))
  @scala.inline
  def stylesFunction1(value: IVerticalDividerPropsStyles => DeepPartial[IVerticalDividerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  @scala.inline
  def styles(value: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  @scala.inline
  def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
}

