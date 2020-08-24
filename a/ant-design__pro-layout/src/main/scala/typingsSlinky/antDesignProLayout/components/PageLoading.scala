package typingsSlinky.antDesignProLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.Tip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageLoading {
  @JSImport("@ant-design/pro-layout", "PageLoading")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def tip(value: String): this.type = set("tip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Tip): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageLoading.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

