package typingsSlinky.reactSvgMorph.components

import typingsSlinky.reactSvgMorph.anon.From
import typingsSlinky.reactSvgMorph.mod.MorphTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MorphTransition {
  
  @scala.inline
  def apply(children: From): SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition](js.Array(this.component, __props.asInstanceOf[MorphTransitionProps]))
  }
  
  @JSImport("react-svg-morph", "MorphTransition")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MorphTransitionProps): SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition] = new SharedBuilder_MorphTransitionProps_603375426[typingsSlinky.reactSvgMorph.mod.MorphTransition](js.Array(this.component, p.asInstanceOf[js.Any]))
}
