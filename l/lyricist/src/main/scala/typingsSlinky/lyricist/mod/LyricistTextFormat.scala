package typingsSlinky.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LyricistTextFormat extends StObject
@JSImport("lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LyricistTextFormat with String] = js.native
  
  @js.native
  sealed trait DOM extends LyricistTextFormat
  /* "dom" */ val DOM: typingsSlinky.lyricist.mod.LyricistTextFormat.DOM with String = js.native
  
  @js.native
  sealed trait HTML extends LyricistTextFormat
  /* "html" */ val HTML: typingsSlinky.lyricist.mod.LyricistTextFormat.HTML with String = js.native
  
  @js.native
  sealed trait PLAIN extends LyricistTextFormat
  /* "plain" */ val PLAIN: typingsSlinky.lyricist.mod.LyricistTextFormat.PLAIN with String = js.native
}
