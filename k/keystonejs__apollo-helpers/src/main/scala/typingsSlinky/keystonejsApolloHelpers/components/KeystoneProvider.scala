package typingsSlinky.keystonejsApolloHelpers.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeystoneProvider {
  @JSImport("@keystonejs/apollo-helpers", "KeystoneProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.KeystoneProvider] = new Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.KeystoneProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: KeystoneProvider.type): Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.KeystoneProvider] = new Default[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.KeystoneProvider](js.Array(this.component, js.Dictionary.empty))()
}

