package typingsSlinky.jestJasmine2.suiteMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var description: String = js.native
  var id: String = js.native
  var parentSuite: js.UndefOr[Suite] = js.native
  var throwOnExpectationFailure: js.UndefOr[Boolean] = js.native
  def getTestPath(): Path = js.native
}

object Attributes {
  @scala.inline
  def apply(description: String, getTestPath: () => Path, id: String): Attributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getTestPath = js.Any.fromFunction0(getTestPath), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTestPath(value: () => Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTestPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentSuite(value: Suite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnExpectationFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnExpectationFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnExpectationFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnExpectationFailure")(js.undefined)
        ret
    }
  }
  
}

