package typingsSlinky.forgeDi.inspectorMod

import typingsSlinky.forgeDi.constructorMod.Constructor
import typingsSlinky.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inspector extends js.Object {
  def findConstructor(func: Constructor): Constructor = js.native
  def getDependencies(func: js.Function): js.Array[Dependency] = js.native
}

object Inspector {
  @scala.inline
  def apply(findConstructor: Constructor => Constructor, getDependencies: js.Function => js.Array[Dependency]): Inspector = {
    val __obj = js.Dynamic.literal(findConstructor = js.Any.fromFunction1(findConstructor), getDependencies = js.Any.fromFunction1(getDependencies))
    __obj.asInstanceOf[Inspector]
  }
  @scala.inline
  implicit class InspectorOps[Self <: Inspector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindConstructor(value: Constructor => Constructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findConstructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDependencies(value: js.Function => js.Array[Dependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDependencies")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

