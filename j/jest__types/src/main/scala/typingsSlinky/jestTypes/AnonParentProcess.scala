package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.Process
import typingsSlinky.jestTypes.jestTypesStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParentProcess extends Event {
  var name: setup = js.native
  var parentProcess: Process = js.native
  var testNamePattern: js.UndefOr[String] = js.native
}

object AnonParentProcess {
  @scala.inline
  def apply(name: setup, parentProcess: Process): AnonParentProcess = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentProcess]
  }
  @scala.inline
  implicit class AnonParentProcessOps[Self <: AnonParentProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: setup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentProcess(value: Process): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestNamePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestNamePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(js.undefined)
        ret
    }
  }
  
}

