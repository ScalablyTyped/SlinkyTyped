package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sources extends js.Object {
  var excludeSources: js.UndefOr[js.Array[String]] = js.native
  var scope: js.UndefOr[typingsSlinky.atom.mod.ScopeDescriptor] = js.native
  var sources: js.UndefOr[js.Array[String]] = js.native
}

object Sources {
  @scala.inline
  def apply(): Sources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sources]
  }
  @scala.inline
  implicit class SourcesOps[Self <: Sources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeSources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeSources")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
  }
  
}

