package typingsSlinky.react.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.SuspenseProps
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Suspense {
  @JSImport("react", "Suspense")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def fallback(value: NonNullable[TagMod[Any]]): this.type = set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def fallbackNull: this.type = set("fallback", null)
    @scala.inline
    def unstable_avoidThisFallback(value: Boolean): this.type = set("unstable_avoidThisFallback", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SuspenseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Suspense.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

