package typingsSlinky.lyricParser

import typingsSlinky.lyricParser.anon.Album
import typingsSlinky.lyricParser.anon.LineNum
import typingsSlinky.lyricParser.anon.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lyric-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Lyric extends js.Object {
    var curLine: Double = js.native
    var lines: js.Array[Time] = js.native
    var lrc: String = js.native
    var state: Double = js.native
    var tags: Album = js.native
    def handler(params: LineNum): Unit = js.native
    def play(startTime: Double): Unit = js.native
    def play(startTime: Double, skipLast: Boolean): Unit = js.native
    def seek(offset: Double): Unit = js.native
    def stop(): Unit = js.native
    def togglePlay(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Lyric {
    def this(lrc: String, handler: js.Function1[/* params */ LineNum, Unit]) = this()
  }
  
}

