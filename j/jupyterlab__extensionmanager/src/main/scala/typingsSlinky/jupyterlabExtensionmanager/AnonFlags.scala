package typingsSlinky.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlags extends js.Object {
  /**
    * Metadata about the found package.
    */
  @JSName("package")
  var _package: AnonDate = js.native
  /**
    * Flags about the package.
    */
  var flags: AnonInsecure = js.native
  /**
    * Object detailing the normalized search score.
    */
  var score: AnonDetail = js.native
  /**
    * The search score.
    */
  var searchScore: Double = js.native
}

object AnonFlags {
  @scala.inline
  def apply(_package: AnonDate, flags: AnonInsecure, score: AnonDetail, searchScore: Double): AnonFlags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlags]
  }
  @scala.inline
  implicit class AnonFlagsOps[Self <: AnonFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: AnonDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: AnonInsecure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: AnonDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchScore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

