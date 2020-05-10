package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a LevelDetails object contains level details retrieved after level playlist parsing
  */
@js.native
trait LevelDetails extends js.Object {
  /**
    * average fragment duration
    */
  var averagetargetduration: Double = js.native
  /**
    * end sequence number
    */
  var endSN: Double = js.native
  /**
    * array of fragments info
    */
  var fragments: js.Array[Fragment] = js.native
  /**
    * is this level a live playlist or not?
    */
  var live: Boolean = js.native
  /**
    * start sequence number
    */
  var startSN: Double = js.native
  /**
    * level fragment target duration
    */
  var targetduration: Double = js.native
  /**
    * level total duration
    */
  var totalduration: Double = js.native
  /**
    * playlist type
    */
  var `type`: String = js.native
  /**
    * protocol version
    */
  var version: Double = js.native
}

object LevelDetails {
  @scala.inline
  def apply(
    averagetargetduration: Double,
    endSN: Double,
    fragments: js.Array[Fragment],
    live: Boolean,
    startSN: Double,
    targetduration: Double,
    totalduration: Double,
    `type`: String,
    version: Double
  ): LevelDetails = {
    val __obj = js.Dynamic.literal(averagetargetduration = averagetargetduration.asInstanceOf[js.Any], endSN = endSN.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], startSN = startSN.asInstanceOf[js.Any], targetduration = targetduration.asInstanceOf[js.Any], totalduration = totalduration.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDetails]
  }
  @scala.inline
  implicit class LevelDetailsOps[Self <: LevelDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAveragetargetduration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averagetargetduration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndSN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endSN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragments(value: js.Array[Fragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartSN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startSN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetduration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetduration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalduration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalduration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

