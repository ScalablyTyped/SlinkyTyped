package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.list
import typingsSlinky.remarkable.remarkableStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock extends js.Object {
  var bMarks: js.Array[Double] = js.native
  /** required block content indent */
  var blkIndent: Double = js.native
  /** Indent of the current dd block, -1 if there isn't any */
  var ddIndent: Double = js.native
  var eMarks: js.Array[Double] = js.native
  var env: Env = js.native
  var level: Double = js.native
  /** line index in src */
  var line: Double = js.native
  /** lines count */
  var lineMax: Double = js.native
  var options: Options = js.native
  /** If `list`, block parser stops on two newlines */
  var parentType: root | list = js.native
  /** Shortcuts to simplify nested calls */
  var parser: ParserBlock = js.native
  var result: String = js.native
  var src: String = js.native
  var tShift: js.Array[Double] = js.native
  /** loose/tight mode for lists */
  var tight: Boolean = js.native
  var tokens: js.Array[BlockContentToken] = js.native
  def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
  def isEmpty(line: Double): Boolean = js.native
  def skipChars(pos: Double, code: Double): Double = js.native
  def skipEmptyLines(from: Double): Double = js.native
  def skipSpaces(pos: Double): Double = js.native
}

object StateBlock {
  @scala.inline
  def apply(
    bMarks: js.Array[Double],
    blkIndent: Double,
    ddIndent: Double,
    eMarks: js.Array[Double],
    env: Env,
    getLines: (Double, Double, Double, Boolean) => String,
    isEmpty: Double => Boolean,
    level: Double,
    line: Double,
    lineMax: Double,
    options: Options,
    parentType: root | list,
    parser: ParserBlock,
    result: String,
    skipChars: (Double, Double) => Double,
    skipEmptyLines: Double => Double,
    skipSpaces: Double => Double,
    src: String,
    tShift: js.Array[Double],
    tight: Boolean,
    tokens: js.Array[BlockContentToken]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateBlock]
  }
  @scala.inline
  implicit class StateBlockOps[Self <: StateBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnv(value: Env): Self = {
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
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentType(value: root | list): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParser(value: ParserBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipChars(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChars")(js.Any.fromFunction2(value))
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
    def withTokens(value: js.Array[BlockContentToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

