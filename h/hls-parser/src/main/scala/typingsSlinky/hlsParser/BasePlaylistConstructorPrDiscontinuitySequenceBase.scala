package typingsSlinky.hlsParser

import typingsSlinky.hlsParser.hlsParserStrings.EVENT
import typingsSlinky.hlsParser.hlsParserStrings.VOD
import typingsSlinky.hlsParser.mod.types.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  targetDuration  :number,   mediaSequenceBase ? :number,   discontinuitySequenceBase ? :number,   endlist ? :boolean,   playlistType ? :'EVENT' | 'VOD',   isIFrame ? :boolean,   segments ? :std.Array<hls-parser.hls-parser.types.Segment>,   source ? :string} */
@js.native
trait BasePlaylistConstructorPrDiscontinuitySequenceBase extends js.Object {
  var discontinuitySequenceBase: js.UndefOr[Double] = js.native
  var endlist: js.UndefOr[Boolean] = js.native
  var independentSegments: js.UndefOr[Boolean] = js.native
  var isIFrame: js.UndefOr[Boolean] = js.native
  var mediaSequenceBase: js.UndefOr[Double] = js.native
  var playlistType: js.UndefOr[EVENT | VOD] = js.native
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  var source: js.UndefOr[String] = js.native
  var start: js.UndefOr[AnonOffset] = js.native
  var targetDuration: Double = js.native
  var uri: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

object BasePlaylistConstructorPrDiscontinuitySequenceBase {
  @scala.inline
  def apply(targetDuration: Double): BasePlaylistConstructorPrDiscontinuitySequenceBase = {
    val __obj = js.Dynamic.literal(targetDuration = targetDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPrDiscontinuitySequenceBase]
  }
  @scala.inline
  implicit class BasePlaylistConstructorPrDiscontinuitySequenceBaseOps[Self <: BasePlaylistConstructorPrDiscontinuitySequenceBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscontinuitySequenceBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discontinuitySequenceBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscontinuitySequenceBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discontinuitySequenceBase")(js.undefined)
        ret
    }
    @scala.inline
    def withEndlist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endlist")(js.undefined)
        ret
    }
    @scala.inline
    def withIndependentSegments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("independentSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndependentSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("independentSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsIFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaSequenceBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSequenceBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaSequenceBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSequenceBase")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylistType(value: EVENT | VOD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylistType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistType")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[Segment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: AnonOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

