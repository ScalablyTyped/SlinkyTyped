package typingsSlinky.recoil.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.recoil.anon.Set
import typingsSlinky.recoil.mod.RecoilRootProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RecoilRoot {
  @JSImport("recoil", "RecoilRoot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def initializeState(value: /* options */ Set => Unit): this.type = set("initializeState", js.Any.fromFunction1(value))
  }
  
  def withProps(p: RecoilRootProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RecoilRoot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

