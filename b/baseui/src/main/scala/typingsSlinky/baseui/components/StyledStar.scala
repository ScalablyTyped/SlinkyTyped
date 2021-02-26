package typingsSlinky.baseui.components

import typingsSlinky.baseui.ratingMod.StyledRatingItemProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledStar {
  
  @scala.inline
  def apply(
    $index: Double,
    $isActive: Boolean,
    $isSelected: Boolean,
    $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): SharedBuilder_PropsWithChildren_115721362 = {
    val __props = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren_115721362(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[
    StyledRatingItemProps with StyletronComponentInjectedProps[StyledRatingItemProps]
  ]]))
  }
  
  @JSImport("baseui/rating", "StyledStar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(
    p: PropsWithChildren[
      StyledRatingItemProps with StyletronComponentInjectedProps[StyledRatingItemProps]
    ]
  ): SharedBuilder_PropsWithChildren_115721362 = new SharedBuilder_PropsWithChildren_115721362(js.Array(this.component, p.asInstanceOf[js.Any]))
}
