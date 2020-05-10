package typingsSlinky.dojo.dojox.string

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/BidiComplex.html
  *
  *
  */
@js.native
trait BidiComplex extends js.Object {
  /**
    * Attach key listeners to the INPUT field to accomodate dynamic complex BiDi expressions
    *
    * @param field
    * @param pattern
    */
  def attachInput(field: HTMLElement, pattern: String): Unit = js.native
  /**
    * Create the display string by adding the Unicode direction Markers
    *
    * @param str
    * @param pattern
    */
  def createDisplayString(str: String, pattern: String): Unit = js.native
  /**
    * removes all Unicode directional markers from the string
    *
    * @param str
    */
  def stripSpecialCharacters(str: js.Any): Unit = js.native
}

object BidiComplex {
  @scala.inline
  def apply(
    attachInput: (HTMLElement, String) => Unit,
    createDisplayString: (String, String) => Unit,
    stripSpecialCharacters: js.Any => Unit
  ): BidiComplex = {
    val __obj = js.Dynamic.literal(attachInput = js.Any.fromFunction2(attachInput), createDisplayString = js.Any.fromFunction2(createDisplayString), stripSpecialCharacters = js.Any.fromFunction1(stripSpecialCharacters))
    __obj.asInstanceOf[BidiComplex]
  }
  @scala.inline
  implicit class BidiComplexOps[Self <: BidiComplex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachInput(value: (HTMLElement, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachInput")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateDisplayString(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDisplayString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStripSpecialCharacters(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripSpecialCharacters")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

