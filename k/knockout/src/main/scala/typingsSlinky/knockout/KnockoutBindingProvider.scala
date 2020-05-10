package typingsSlinky.knockout

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingProvider extends js.Object {
  var getBindingAccessors: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* bindingContext */ KnockoutBindingContext, 
      StringDictionary[String]
    ]
  ] = js.native
  def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object = js.native
  def nodeHasBindings(node: Node): Boolean = js.native
}

object KnockoutBindingProvider {
  @scala.inline
  def apply(getBindings: (Node, KnockoutBindingContext) => js.Object, nodeHasBindings: Node => Boolean): KnockoutBindingProvider = {
    val __obj = js.Dynamic.literal(getBindings = js.Any.fromFunction2(getBindings), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    __obj.asInstanceOf[KnockoutBindingProvider]
  }
  @scala.inline
  implicit class KnockoutBindingProviderOps[Self <: KnockoutBindingProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBindings(value: (Node, KnockoutBindingContext) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBindings")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNodeHasBindings(value: Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeHasBindings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBindingAccessors(value: (/* node */ Node, /* bindingContext */ KnockoutBindingContext) => StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBindingAccessors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetBindingAccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBindingAccessors")(js.undefined)
        ret
    }
  }
  
}

