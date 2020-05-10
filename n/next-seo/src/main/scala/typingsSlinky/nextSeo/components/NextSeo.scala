package typingsSlinky.nextSeo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextSeo.mod.Config
import typingsSlinky.nextSeo.mod.NextSeoProps
import typingsSlinky.nextSeo.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NextSeo {
  @JSImport("next-seo", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: NextSeoProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(config: Config): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[NextSeoProps]))
  }
}

