package typingsSlinky.reactJsonTree.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactJsonTree.mod.JSONTreeProps
import typingsSlinky.reactJsonTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonTree {
  @JSImport("react-json-tree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def collectionLimit(value: Double): this.type = set("collectionLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def getItemString(
      value: (/* type */ String, /* data */ js.Array[_] | js.Object, /* itemType */ String, /* itemString */ String) => ReactElement
    ): this.type = set("getItemString", js.Any.fromFunction4(value))
    @scala.inline
    def hideRoot(value: Boolean): this.type = set("hideRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def invertTheme(value: Boolean): this.type = set("invertTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def isCustomNode(value: () => Boolean): this.type = set("isCustomNode", js.Any.fromFunction0(value))
    @scala.inline
    def keyPath(value: js.Array[String | Double]): this.type = set("keyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def labelRenderer(
      value: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => ReactElement
    ): this.type = set("labelRenderer", js.Any.fromFunction4(value))
    @scala.inline
    def postprocessValue(value: /* raw */ String => ReactElement): this.type = set("postprocessValue", js.Any.fromFunction1(value))
    @scala.inline
    def shouldExpandNode(
      value: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[_] | js.Object, /* level */ Double) => Boolean
    ): this.type = set("shouldExpandNode", js.Any.fromFunction3(value))
    @scala.inline
    def sortObjectKeys(value: js.Function | Boolean): this.type = set("sortObjectKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: js.Object | String): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def valueRenderer(
      value: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => ReactElement
    ): this.type = set("valueRenderer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: JSONTreeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[_] | js.Object): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[JSONTreeProps]))
  }
}

