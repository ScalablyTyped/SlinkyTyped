package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.ratingMod.StyledRatingItemProps
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_PropsWithChildren_115721362 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def $asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
  @scala.inline
  def $asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
  @scala.inline
  def $as(value: StyletronBase): this.type = set("$as", value.asInstanceOf[js.Any])
  @scala.inline
  def $styleFunction1(value: StyledRatingItemProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  @scala.inline
  def $style(value: StyleProp[StyledRatingItemProps]): this.type = set("$style", value.asInstanceOf[js.Any])
}

