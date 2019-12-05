package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MetadataType extends js.Object

@JSGlobal("chrome.cast.media.MetadataType")
@js.native
object MetadataType extends js.Object {
  @js.native
  sealed trait GENERIC extends MetadataType
  
  @js.native
  sealed trait MOVIE extends MetadataType
  
  @js.native
  sealed trait MUSIC_TRACK extends MetadataType
  
  @js.native
  sealed trait PHOTO extends MetadataType
  
  @js.native
  sealed trait TV_SHOW extends MetadataType
  
  /* 0 */ val GENERIC: typingsSlinky.chrome.chrome.cast.media.MetadataType.GENERIC with Double = js.native
  /* 2 */ val MOVIE: typingsSlinky.chrome.chrome.cast.media.MetadataType.MOVIE with Double = js.native
  /* 3 */ val MUSIC_TRACK: typingsSlinky.chrome.chrome.cast.media.MetadataType.MUSIC_TRACK with Double = js.native
  /* 4 */ val PHOTO: typingsSlinky.chrome.chrome.cast.media.MetadataType.PHOTO with Double = js.native
  /* 1 */ val TV_SHOW: typingsSlinky.chrome.chrome.cast.media.MetadataType.TV_SHOW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataType with Double] = js.native
}

