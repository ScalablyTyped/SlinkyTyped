package typingsSlinky.reactSvgMorph.components

import typingsSlinky.reactSvgMorph.anon.From
import typingsSlinky.reactSvgMorph.mod.MorphTransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MorphTransition {
  
  @JSImport("react-svg-morph", "MorphTransition")
  @js.native
  object component extends js.Object
  
  def withProps(p: MorphTransitionProps): SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition] = new SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: From): SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition](js.Array(this.component, __props.asInstanceOf[MorphTransitionProps]))
  }
}
