package typingsSlinky.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderFooter extends js.Object {
  /**
  	 * Set the value of differentFirst as true, which indicates that headers/footers for first page are different from the other pages, `false` by default
  	 */
  var differentFirst: Boolean = js.native
  /**
  	 * Set the value of differentOddEven as true, which indicates that headers/footers for odd and even pages are different, `false` by default
  	 */
  var differentOddEven: Boolean = js.native
  /**
  	 * Set footer string for even pages, could format the string and `null` by default
  	 */
  var evenFooter: String = js.native
  /**
  	 * Set header string for even pages, could format the string and `null` by default
  	 */
  var evenHeader: String = js.native
  /**
  	 * Set footer string for the first page, could format the string and `null` by default
  	 */
  var firstFooter: String = js.native
  /**
  	 * Set header string for the first page, could format the string and `null` by default
  	 */
  var firstHeader: String = js.native
  /**
  	 * Set footer string for odd pages, could format the string and `null` by default
  	 */
  var oddFooter: String = js.native
  /**
  	 * Set header string for odd pages, could format the string and `null` by default
  	 */
  var oddHeader: String = js.native
}

object HeaderFooter {
  @scala.inline
  def apply(
    differentFirst: Boolean,
    differentOddEven: Boolean,
    evenFooter: String,
    evenHeader: String,
    firstFooter: String,
    firstHeader: String,
    oddFooter: String,
    oddHeader: String
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(differentFirst = differentFirst.asInstanceOf[js.Any], differentOddEven = differentOddEven.asInstanceOf[js.Any], evenFooter = evenFooter.asInstanceOf[js.Any], evenHeader = evenHeader.asInstanceOf[js.Any], firstFooter = firstFooter.asInstanceOf[js.Any], firstHeader = firstHeader.asInstanceOf[js.Any], oddFooter = oddFooter.asInstanceOf[js.Any], oddHeader = oddHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDifferentFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("differentFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDifferentOddEven(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("differentOddEven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvenFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvenHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOddFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOddHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddHeader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

