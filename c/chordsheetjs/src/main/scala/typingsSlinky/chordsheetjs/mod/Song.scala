package typingsSlinky.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chordsheetjs", "Song")
@js.native
class Song protected () extends js.Object {
  def this(metadata: js.Object) = this()
  
  def addChordLyricsPair(): ChordLyricsPair = js.native
  
  def addLine(): Line = js.native
  
  def addParagraph(): Paragraph = js.native
  
  def addTag(tagContents: String): Tag = js.native
  
  def assignMetaData(metadata: js.Object): Unit = js.native
  
  /**
    * Returns the song lines, skipping the leading empty lines (empty as in not rendering any content). This is useful
    * if you want to skip the "header lines": the lines that only contain meta data.
    */
  var bodyLines: js.Array[Line] = js.native
  
  def chords(chr: String): Unit = js.native
  
  var currentLine: Line = js.native
  
  var currentParagraph: Paragraph = js.native
  
  def ensureLine(): Unit = js.native
  
  def ensureParagraph(): Unit = js.native
  
  def finish(): Unit = js.native
  
  def flushLine(): Unit = js.native
  
  def getMetaData(name: String): String | Null = js.native
  
  def getOptimizedMetaData(): js.Object = js.native
  
  /**
    * The Line items of which the song consists
    */
  var lines: js.Array[Line] = js.native
  
  def lyrics(chr: String): Unit = js.native
  
  var metaData: js.Object = js.native
  
  def optimizeMetaDataValue(): String | js.Array[String] | Null = js.native
  def optimizeMetaDataValue(valueSet: js.Array[String]): String | js.Array[String] | Null = js.native
  
  var optimizedMetaData: js.Object = js.native
  
  /**
    * The Paragraph items of which the song consists
    */
  var paragraphs: js.Array[Paragraph] = js.native
  
  def setCurrentLineType(`type`: String): Unit = js.native
  
  def setMetaData(name: String, value: String): Unit = js.native
}
