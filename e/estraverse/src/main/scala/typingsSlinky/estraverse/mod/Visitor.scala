package typingsSlinky.estraverse.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.estraverse.estraverseStrings.iteration
import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  var enter: js.UndefOr[
    js.Function2[/* node */ Node, /* parentNode */ Node | Null, VisitorOption | Node | Unit]
  ] = js.native
  var fallback: js.UndefOr[iteration | (js.Function1[/* node */ Node, js.Array[String]])] = js.native
  var keys: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var leave: js.UndefOr[
    js.Function2[/* node */ Node, /* parentNode */ Node | Null, VisitorOption | Node | Unit]
  ] = js.native
}

object Visitor {
  @scala.inline
  def apply(): Visitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visitor]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: (/* node */ Node, /* parentNode */ Node | Null) => VisitorOption | Node | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackFunction1(value: /* node */ Node => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFallback(value: iteration | (js.Function1[/* node */ Node, js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: (/* node */ Node, /* parentNode */ Node | Null) => VisitorOption | Node | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
  }
  
}

