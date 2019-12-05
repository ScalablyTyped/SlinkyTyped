package typingsSlinky.lyricist.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LyricistTextFormat extends js.Object

@JSImport("lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends js.Object {
  @js.native
  sealed trait DOM extends LyricistTextFormat
  
  @js.native
  sealed trait HTML extends LyricistTextFormat
  
  @js.native
  sealed trait PLAIN extends LyricistTextFormat
  
  /* "dom" */ val DOM: typingsSlinky.lyricist.lyricistMod.LyricistTextFormat.DOM with String = js.native
  /* "html" */ val HTML: typingsSlinky.lyricist.lyricistMod.LyricistTextFormat.HTML with String = js.native
  /* "plain" */ val PLAIN: typingsSlinky.lyricist.lyricistMod.LyricistTextFormat.PLAIN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LyricistTextFormat with String] = js.native
}

