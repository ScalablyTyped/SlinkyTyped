package typingsSlinky.apolloReactSsr.getDataFromTreeMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMarkupFromTreeOptions extends js.Object {
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  var renderFunction: js.UndefOr[js.Function1[/* tree */ ReactElement, String]] = js.native
  var tree: TagMod[Any] = js.native
}

object GetMarkupFromTreeOptions {
  @scala.inline
  def apply(): GetMarkupFromTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMarkupFromTreeOptions]
  }
  @scala.inline
  implicit class GetMarkupFromTreeOptionsOps[Self <: GetMarkupFromTreeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFunction(value: /* tree */ ReactElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTree(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(js.undefined)
        ret
    }
  }
  
}

