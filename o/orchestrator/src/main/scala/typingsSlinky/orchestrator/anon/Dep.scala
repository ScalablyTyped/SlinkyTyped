package typingsSlinky.orchestrator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dep extends js.Object {
  var dep: js.Array[String] = js.native
}

object Dep {
  @scala.inline
  def apply(dep: js.Array[String]): Dep = {
    val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dep]
  }
  @scala.inline
  implicit class DepOps[Self <: Dep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDep(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dep")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

