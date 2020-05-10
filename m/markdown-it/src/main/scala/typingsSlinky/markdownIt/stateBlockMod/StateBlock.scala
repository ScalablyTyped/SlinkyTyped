package typingsSlinky.markdownIt.stateBlockMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typingsSlinky.markdownIt.tokenMod.^
  ] = js.native
  /**
    * line begin offsets for fast jumps
    */
  var bMarks: js.Array[Double] = js.native
  // block parser variables
  /**
    * required block content indent (for example, if we are
    * inside a list, it would be positioned after list marker)
    */
  var blkIndent: Double = js.native
  /**
    * An amount of virtual spaces (tabs expanded) between beginning
    * of each line (bMarks) and real beginning of that line.
    *
    * It exists only as a hack because blockquotes override bMarks
    * losing information in the process.
    *
    * It's used only when expanding tabs, you can think about it as
    * an initial tab length, e.g. bsCount=21 applied to string `\t123`
    * means first tab should be expanded to 4-21%4 === 3 spaces.
    */
  var bsCount: js.Array[Double] = js.native
  /**
    * indent of the current dd block (-1 if there isn't any)
    */
  var ddIndent: Double = js.native
  /**
    * line end offsets for fast jumps
    */
  var eMarks: js.Array[Double] = js.native
  var env: js.Any = js.native
  var level: Double = js.native
  /**
    * line index in src
    */
  var line: Double = js.native
  /**
    * lines count
    */
  var lineMax: Double = js.native
  /**
    * indent of the current list block (-1 if there isn't any)
    */
  var listIndent: Double = js.native
  /**
    * link to parser instance
    */
  var md: MarkdownIt = js.native
  /**
    * can be 'blockquote', 'list', 'root', 'paragraph' or 'reference'
    * used in lists to determine if they interrupt a paragraph
    */
  var parentType: ParentType = js.native
  /**
    * renderer
    */
  var result: String = js.native
  /**
    * indents for each line (tabs expanded)
    */
  var sCount: js.Array[Double] = js.native
  var src: String = js.native
  /**
    * offsets of the first non-space characters (tabs not expanded)
    */
  var tShift: js.Array[Double] = js.native
  /**
    * loose/tight mode for lists
    */
  var tight: Boolean = js.native
  //
  // Internal state vartiables
  //
  var tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
  /**
    * cut lines range from source.
    */
  def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
  def isEmpty(line: Double): Boolean = js.native
  /**
    * Push new token to "stream".
    */
  def push(`type`: String, tag: String, nesting: Nesting): typingsSlinky.markdownIt.tokenMod.^ = js.native
  /**
    * Skip char codes from given position
    */
  def skipChars(pos: Double, code: Double): Double = js.native
  /**
    * Skip char codes reverse from given position - 1
    */
  def skipCharsBack(pos: Double, code: Double, min: Double): Double = js.native
  def skipEmptyLines(from: Double): Double = js.native
  /**
    * Skip spaces from given position.
    */
  def skipSpaces(pos: Double): Double = js.native
  /**
    * Skip spaces from given position in reverse.
    */
  def skipSpacesBack(pos: Double, min: Double): Double = js.native
}

object StateBlock {
  @scala.inline
  def apply(
    Token: Instantiable3[
      /* type */ String, 
      /* tag */ String, 
      /* nesting */ Nesting, 
      typingsSlinky.markdownIt.tokenMod.^
    ],
    bMarks: js.Array[Double],
    blkIndent: Double,
    bsCount: js.Array[Double],
    ddIndent: Double,
    eMarks: js.Array[Double],
    env: js.Any,
    getLines: (Double, Double, Double, Boolean) => String,
    isEmpty: Double => Boolean,
    level: Double,
    line: Double,
    lineMax: Double,
    listIndent: Double,
    md: MarkdownIt,
    parentType: ParentType,
    push: (String, String, Nesting) => typingsSlinky.markdownIt.tokenMod.^,
    result: String,
    sCount: js.Array[Double],
    skipChars: (Double, Double) => Double,
    skipCharsBack: (Double, Double, Double) => Double,
    skipEmptyLines: Double => Double,
    skipSpaces: Double => Double,
    skipSpacesBack: (Double, Double) => Double,
    src: String,
    tShift: js.Array[Double],
    tight: Boolean,
    tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], bsCount = bsCount.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], listIndent = listIndent.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), result = result.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipCharsBack = js.Any.fromFunction3(skipCharsBack), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), skipSpacesBack = js.Any.fromFunction2(skipSpacesBack), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateBlock]
  }
  @scala.inline
  implicit class StateBlockOps[Self <: StateBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(
      value: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typingsSlinky.markdownIt.tokenMod.^
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBMarks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlkIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blkIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBsCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDdIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEMarks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLines(value: (Double, Double, Double, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLines")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: MarkdownIt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentType(value: ParentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: (String, String, Nesting) => typingsSlinky.markdownIt.tokenMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipChars(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChars")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSkipCharsBack(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCharsBack")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSkipEmptyLines(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyLines")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkipSpaces(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSpaces")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkipSpacesBack(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipSpacesBack")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTShift(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

