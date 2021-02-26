package typingsSlinky.recast

import typingsSlinky.astTypes.namedTypesMod.namedTypes.Position
import typingsSlinky.recast.anon.Column
import typingsSlinky.recast.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linesMod {
  
  @JSImport("recast/lib/lines", "Lines")
  @js.native
  class Lines protected () extends StObject {
    def this(infos: js.Array[LineInfo]) = this()
    def this(infos: js.Array[LineInfo], sourceFileName: String) = this()
    
    def bootstrapCharAt(pos: Pos): String = js.native
    
    def bootstrapSlice(start: Pos, end: Pos): Lines = js.native
    
    def bootstrapSliceString(start: Pos, end: Pos): String = js.native
    def bootstrapSliceString(start: Pos, end: Pos, options: Options): String = js.native
    
    var cachedSourceMap: js.Any = js.native
    
    var cachedTabWidth: js.Any = js.native
    
    def charAt(pos: Pos): String = js.native
    
    def concat(args: (String | Lines)*): Lines = js.native
    
    def eachPos(callback: js.Function1[/* pos */ Pos, _]): Unit = js.native
    def eachPos(callback: js.Function1[/* pos */ Pos, _], startPos: js.UndefOr[scala.Nothing], skipSpaces: Boolean): Unit = js.native
    def eachPos(callback: js.Function1[/* pos */ Pos, _], startPos: Pos): Unit = js.native
    def eachPos(callback: js.Function1[/* pos */ Pos, _], startPos: Pos, skipSpaces: Boolean): Unit = js.native
    
    def firstPos(): Column = js.native
    
    def getIndentAt(line: Double): Double = js.native
    
    def getLineLength(line: Double): Double = js.native
    
    def getSourceMap(sourceMapName: String): js.Any = js.native
    def getSourceMap(sourceMapName: String, sourceRoot: String): js.Any = js.native
    
    def guessTabWidth(): Double = js.native
    
    def indent(by: Double): Lines = js.native
    
    def indentTail(by: Double): Lines = js.native
    
    var infos: js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isOnlyWhitespace(): Boolean = js.native
    
    def isPrecededOnlyByWhitespace(pos: Pos): Boolean = js.native
    
    def join(elements: js.Array[String | Lines]): Lines = js.native
    
    def lastPos(): Column = js.native
    
    val length: Double = js.native
    
    def lockIndentTail(): Lines = js.native
    
    var mappings: js.Any = js.native
    
    val name: String | Null = js.native
    
    def nextPos(pos: Pos): Boolean = js.native
    def nextPos(pos: Pos, skipSpaces: Boolean): Boolean = js.native
    
    def prevPos(pos: Pos): Boolean = js.native
    def prevPos(pos: Pos, skipSpaces: Boolean): Boolean = js.native
    
    def skipSpaces(pos: Pos): Position | Null = js.native
    def skipSpaces(pos: Pos, backward: js.UndefOr[scala.Nothing], modifyInPlace: Boolean): Position | Null = js.native
    def skipSpaces(pos: Pos, backward: Boolean): Position | Null = js.native
    def skipSpaces(pos: Pos, backward: Boolean, modifyInPlace: Boolean): Position | Null = js.native
    
    def slice(): Lines = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Pos): Lines = js.native
    def slice(start: Pos): Lines = js.native
    def slice(start: Pos, end: Pos): Lines = js.native
    
    def sliceString(): String = js.native
    def sliceString(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], options: Options): String = js.native
    def sliceString(start: js.UndefOr[scala.Nothing], end: Pos): String = js.native
    def sliceString(start: js.UndefOr[scala.Nothing], end: Pos, options: Options): String = js.native
    def sliceString(start: Pos): String = js.native
    def sliceString(start: Pos, end: js.UndefOr[scala.Nothing], options: Options): String = js.native
    def sliceString(start: Pos, end: Pos): String = js.native
    def sliceString(start: Pos, end: Pos, options: Options): String = js.native
    
    def startsWithComment(): Boolean = js.native
    
    def stripMargin(width: Double, skipFirstLine: Boolean): Lines = js.native
    
    def toString(options: Options): String = js.native
    
    def trim(): Lines = js.native
    
    def trimLeft(): Lines = js.native
    
    def trimRight(): Lines = js.native
  }
  
  @JSImport("recast/lib/lines", "concat")
  @js.native
  def concat(elements: js.Any): Lines = js.native
  
  @JSImport("recast/lib/lines", "countSpaces")
  @js.native
  def countSpaces(spaces: js.Any): Double = js.native
  @JSImport("recast/lib/lines", "countSpaces")
  @js.native
  def countSpaces(spaces: js.Any, tabWidth: Double): Double = js.native
  
  @JSImport("recast/lib/lines", "fromString")
  @js.native
  def fromString(string: String): Lines = js.native
  @JSImport("recast/lib/lines", "fromString")
  @js.native
  def fromString(string: String, options: Options): Lines = js.native
  @JSImport("recast/lib/lines", "fromString")
  @js.native
  def fromString(string: Lines): Lines = js.native
  @JSImport("recast/lib/lines", "fromString")
  @js.native
  def fromString(string: Lines, options: Options): Lines = js.native
  
  @js.native
  trait LineInfo extends StObject {
    
    val indent: Double = js.native
    
    val line: String = js.native
    
    val locked: Boolean = js.native
    
    val sliceEnd: Double = js.native
    
    val sliceStart: Double = js.native
  }
  object LineInfo {
    
    @scala.inline
    def apply(indent: Double, line: String, locked: Boolean, sliceEnd: Double, sliceStart: Double): LineInfo = {
      val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], sliceEnd = sliceEnd.asInstanceOf[js.Any], sliceStart = sliceStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineInfo]
    }
    
    @scala.inline
    implicit class LineInfoMutableBuilder[Self <: LineInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceEnd(value: Double): Self = StObject.set(x, "sliceEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceStart(value: Double): Self = StObject.set(x, "sliceStart", value.asInstanceOf[js.Any])
    }
  }
  
  type Pos = Position
}
