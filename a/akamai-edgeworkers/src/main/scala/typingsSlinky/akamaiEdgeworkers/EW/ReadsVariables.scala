package typingsSlinky.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadsVariables extends js.Object {
  /**
    * Gets the value of a metadata variable
    */
  def getVariable(name: String): js.UndefOr[String] = js.native
}

object ReadsVariables {
  @scala.inline
  def apply(getVariable: String => js.UndefOr[String]): ReadsVariables = {
    val __obj = js.Dynamic.literal(getVariable = js.Any.fromFunction1(getVariable))
    __obj.asInstanceOf[ReadsVariables]
  }
  @scala.inline
  implicit class ReadsVariablesOps[Self <: ReadsVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetVariable(value: String => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariable")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

