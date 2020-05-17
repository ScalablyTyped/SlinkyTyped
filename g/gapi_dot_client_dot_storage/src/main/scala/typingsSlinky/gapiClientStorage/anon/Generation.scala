package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generation extends js.Object {
  /** The generation of this object to use as the source. */
  var generation: js.UndefOr[String] = js.native
  /** The source object's name. The source object's bucket is implicitly the destination bucket. */
  var name: js.UndefOr[String] = js.native
  /** Conditions that must be met for this operation to execute. */
  var objectPreconditions: js.UndefOr[IfGenerationMatch] = js.native
}

object Generation {
  @scala.inline
  def apply(): Generation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generation]
  }
  @scala.inline
  implicit class GenerationOps[Self <: Generation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withObjectPreconditions(value: IfGenerationMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPreconditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPreconditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPreconditions")(js.undefined)
        ret
    }
  }
  
}

