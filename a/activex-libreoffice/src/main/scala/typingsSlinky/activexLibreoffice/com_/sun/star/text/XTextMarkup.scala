package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to markup text.
  * @since OOo 2.3
  */
@js.native
trait XTextMarkup extends js.Object {
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  val MarkupInfoContainer: XStringKeyMap = js.native
  /**
    * submits a new markup range.
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param aIdentifier A string used to identify the caller.
    * @param nStart Start of the markup range.
    * @param nLength Length of the markup range.
    * @param xMarkupInfoContainer contains additional information about the markup.
    */
  def commitStringMarkup(
    nType: Double,
    aIdentifier: String,
    nStart: Double,
    nLength: Double,
    xMarkupInfoContainer: XStringKeyMap
  ): Unit = js.native
  def commitTextRangeMarkup(nType: Double, aIdentifier: String, xRange: XTextRange, xMarkupInfoContainer: XStringKeyMap): Unit = js.native
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  def getMarkupInfoContainer(): XStringKeyMap = js.native
}

object XTextMarkup {
  @scala.inline
  def apply(
    MarkupInfoContainer: XStringKeyMap,
    commitStringMarkup: (Double, String, Double, Double, XStringKeyMap) => Unit,
    commitTextRangeMarkup: (Double, String, XTextRange, XStringKeyMap) => Unit,
    getMarkupInfoContainer: () => XStringKeyMap
  ): XTextMarkup = {
    val __obj = js.Dynamic.literal(MarkupInfoContainer = MarkupInfoContainer.asInstanceOf[js.Any], commitStringMarkup = js.Any.fromFunction5(commitStringMarkup), commitTextRangeMarkup = js.Any.fromFunction4(commitTextRangeMarkup), getMarkupInfoContainer = js.Any.fromFunction0(getMarkupInfoContainer))
    __obj.asInstanceOf[XTextMarkup]
  }
  @scala.inline
  implicit class XTextMarkupOps[Self <: XTextMarkup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkupInfoContainer(value: XStringKeyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarkupInfoContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitStringMarkup(value: (Double, String, Double, Double, XStringKeyMap) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitStringMarkup")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCommitTextRangeMarkup(value: (Double, String, XTextRange, XStringKeyMap) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitTextRangeMarkup")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetMarkupInfoContainer(value: () => XStringKeyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkupInfoContainer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

