package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies methods for obtaining information on a content in different levels.
  *
  * For example, if there is a cursor which points to XContents, this interface could be used to give the user access to the content under the cursor. If
  * the client only needs the identifier string of the content, there is no need to first create the content object, then to obtain the string from it and
  * after that to release the content.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
@js.native
trait XContentAccess extends XInterface {
  /**
    * returns the content ( "most expensive method" ).
    * @returns the content.
    */
  def queryContent(): XContent = js.native
  /**
    * returns the identifier object of the content.
    * @returns the identifier object.
    */
  def queryContentIdentifier(): XContentIdentifier = js.native
  /**
    * returns the identifier string of the content ( "cheap method" ).
    *
    * Note that this string can be used later to recreate the content.
    * @returns the identifier string.
    */
  def queryContentIdentifierString(): String = js.native
}

object XContentAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryContent: () => XContent,
    queryContentIdentifier: () => XContentIdentifier,
    queryContentIdentifierString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryContent = js.Any.fromFunction0(queryContent), queryContentIdentifier = js.Any.fromFunction0(queryContentIdentifier), queryContentIdentifierString = js.Any.fromFunction0(queryContentIdentifierString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentAccess]
  }
  @scala.inline
  implicit class XContentAccessOps[Self <: XContentAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryContent(value: () => XContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryContentIdentifier(value: () => XContentIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryContentIdentifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryContentIdentifierString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryContentIdentifierString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

