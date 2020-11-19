package typingsSlinky.reactImgix.components

import typingsSlinky.reactImgix.mod.SharedImigixAndSourceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Source {
  
  @JSImport("react-imgix", "Source")
  @js.native
  object component extends js.Object
  
  def withProps(p: SharedImigixAndSourceProps): SharedBuilder_SharedImigixAndSourceProps_1406058917[typingsSlinky.reactImgix.mod.Source] = new SharedBuilder_SharedImigixAndSourceProps_1406058917[typingsSlinky.reactImgix.mod.Source](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(src: String): SharedBuilder_SharedImigixAndSourceProps_1406058917[typingsSlinky.reactImgix.mod.Source] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_SharedImigixAndSourceProps_1406058917[typingsSlinky.reactImgix.mod.Source](js.Array(this.component, __props.asInstanceOf[SharedImigixAndSourceProps]))
  }
}
