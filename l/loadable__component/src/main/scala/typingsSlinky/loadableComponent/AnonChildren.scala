package typingsSlinky.loadableComponent

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren[TModule] extends js.Object {
  var children: js.UndefOr[js.Function1[/* module */ TModule, TagMod[Any]]] = js.native
  var fallback: js.UndefOr[ReactElement] = js.native
  var ref: js.UndefOr[Ref[TModule]] = js.native
}

object AnonChildren {
  @scala.inline
  def apply[TModule](): AnonChildren[TModule] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChildren[TModule]]
  }
  @scala.inline
  implicit class AnonChildrenOps[Self[tmodule] <: AnonChildren[tmodule], TModule] (val x: Self[TModule]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TModule] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TModule]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TModule] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TModule] with Other]
    @scala.inline
    def withChildren(value: /* module */ TModule => TagMod[Any]): Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: ReactElement): Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[TModule]): Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ TModule | Null => Unit): Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[TModule]): Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self[TModule] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
  }
  
}

