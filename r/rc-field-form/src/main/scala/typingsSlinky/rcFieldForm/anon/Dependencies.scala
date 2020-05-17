package typingsSlinky.rcFieldForm.anon

import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependencies extends js.Object {
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.native
  var name: js.UndefOr[NamePath] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
}

object Dependencies {
  @scala.inline
  def apply(): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependencies]
  }
  @scala.inline
  implicit class DependenciesOps[Self <: Dependencies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: js.Array[NamePath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NamePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

