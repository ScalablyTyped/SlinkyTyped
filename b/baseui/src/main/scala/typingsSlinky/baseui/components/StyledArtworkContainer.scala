package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.listMod.ArtworkSizesT
import typingsSlinky.baseui.listMod.StyledArtworkContainerPropsT
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledArtworkContainer {
  @JSImport("baseui/list", "StyledArtworkContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def $asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $as(value: StyletronBase): this.type = set("$as", value.asInstanceOf[js.Any])
    @scala.inline
    def $styleFunction1(value: StyledArtworkContainerPropsT => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    @scala.inline
    def $style(value: StyleProp[StyledArtworkContainerPropsT]): this.type = set("$style", value.asInstanceOf[js.Any])
    @scala.inline
    def $sublist(value: Boolean): this.type = set("$sublist", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: PropsWithChildren[
      StyledArtworkContainerPropsT with StyletronComponentInjectedProps[StyledArtworkContainerPropsT]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply($artworkSize: ArtworkSizesT): Builder = {
    val __props = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[
      StyledArtworkContainerPropsT with StyletronComponentInjectedProps[StyledArtworkContainerPropsT]
    ]]))
  }
}

