package typingsSlinky.reactImgix.components

import typingsSlinky.reactImgix.mod.SharedImigixAndSourceProps
import typingsSlinky.reactImgix.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImgix {
  
  @scala.inline
  def apply(src: String): SharedBuilder_SharedImigixAndSourceProps_1406058917[default] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_SharedImigixAndSourceProps_1406058917[default](js.Array(this.component, __props.asInstanceOf[SharedImigixAndSourceProps]))
  }
  
  @JSImport("react-imgix", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SharedImigixAndSourceProps): SharedBuilder_SharedImigixAndSourceProps_1406058917[default] = new SharedBuilder_SharedImigixAndSourceProps_1406058917[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
