package typingsSlinky.markdownIt.tokenMod

import typingsSlinky.markdownIt.markdownItNumbers.`-1`
import typingsSlinky.markdownIt.markdownItNumbers.`0`
import typingsSlinky.markdownIt.markdownItNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create new token and fill passed properties.
  */
@js.native
trait Token extends js.Object {
  /**
    * HTML attributes. Format: `[[name1, value1], [name2, value2]]`
    */
  var attrs: (js.Array[js.Tuple2[String, String]]) | Null = js.native
  /**
    * True for block-level tokens, false for inline tokens.
    * Used in renderer to calculate line breaks
    */
  var block: Boolean = js.native
  /**
    * An array of child nodes (inline and img tokens)
    */
  var children: js.Array[Token] | Null = js.native
  /**
    * In a case of self-closing tag (code, html, fence, etc.),
    * it has contents of this tag.
    */
  var content: String = js.native
  /**
    * If it's true, ignore this element when rendering. Used for tight lists
    * to hide paragraphs.
    */
  var hidden: Boolean = js.native
  /**
    * Fence info string
    */
  var info: String = js.native
  /**
    * nesting level, the same as `state.level`
    */
  var level: Double = js.native
  /**
    * Source map info. Format: `[line_begin, line_end]`
    */
  var map: (js.Tuple2[Double, Double]) | Null = js.native
  /**
    * '*' or '_' for emphasis, fence string for fence, etc.
    */
  var markup: String = js.native
  /**
    * A place for plugins to store an arbitrary data
    */
  var meta: js.Any = js.native
  /**
    * Level change (number in {-1, 0, 1} set), where:
    *
    * - `1` means the tag is opening
    * - `0` means the tag is self-closing
    * - `-1` means the tag is closing
    */
  var nesting: `1` | `0` | `-1` = js.native
  /**
    * HTML tag name, e.g. "p"
    */
  var tag: String = js.native
  /**
    * Type of the token, e.g. "paragraph_open"
    */
  var `type`: String = js.native
  /**
    * Get the value of attribute `name`, or null if it does not exist.
    */
  def attrGet(name: String): String | Null = js.native
  /**
    * Search attribute index by name.
    */
  def attrIndex(name: String): Double = js.native
  /**
    *
    * Join value to existing attribute via space. Or create new attribute if not
    * exists. Useful to operate with token classes.
    */
  def attrJoin(name: String, value: String): Unit = js.native
  /**
    * Add `[name, value]` attribute to list. Init attrs if necessary
    */
  def attrPush(attrData: js.Tuple2[String, String]): Unit = js.native
  /**
    * Set `name` attribute to `value`. Override old value if exists.
    */
  def attrSet(name: String, value: String): Unit = js.native
}

object Token {
  @scala.inline
  def apply(
    attrGet: String => String | Null,
    attrIndex: String => Double,
    attrJoin: (String, String) => Unit,
    attrPush: js.Tuple2[String, String] => Unit,
    attrSet: (String, String) => Unit,
    block: Boolean,
    content: String,
    hidden: Boolean,
    info: String,
    level: Double,
    markup: String,
    meta: js.Any,
    nesting: `1` | `0` | `-1`,
    tag: String,
    `type`: String
  ): Token = {
    val __obj = js.Dynamic.literal(attrGet = js.Any.fromFunction1(attrGet), attrIndex = js.Any.fromFunction1(attrIndex), attrJoin = js.Any.fromFunction2(attrJoin), attrPush = js.Any.fromFunction1(attrPush), attrSet = js.Any.fromFunction2(attrSet), block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], markup = markup.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrGet(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrGet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttrIndex(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttrJoin(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrJoin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttrPush(value: js.Tuple2[String, String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrPush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttrSet(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrSet")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNesting(value: `1` | `0` | `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrs(value: js.Array[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttrsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(null)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[Token]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withMap(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(null)
        ret
    }
  }
  
}

