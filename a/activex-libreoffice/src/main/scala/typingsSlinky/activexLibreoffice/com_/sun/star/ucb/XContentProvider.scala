package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a content provider which creates and manages XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
@js.native
trait XContentProvider extends XInterface {
  /**
    * compares two XContentIdentifiers.
    * @param Id1 first content identifier.
    * @param Id2 second content identifier.
    * @returns `0` is returned, if the identifiers are equal. A value less than `0` indicates, that the Id1 is less than Id2. A value greater than `0` is return
    */
  def compareContentIds(Id1: XContentIdentifier, Id2: XContentIdentifier): Double = js.native
  /**
    * creates a new {@link XContent} instance, if the given {@link XContentIdentifier} matches a content provided by the implementation of this interface.
    * @param Identifier an identifier for the content to query.
    * @returns the content.
    * @throws IllegalIdentifierException if the given identifier does not match a content provided by the implementation of this interface
    */
  def queryContent(Identifier: XContentIdentifier): XContent = js.native
}

object XContentProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProvider]
  }
  @scala.inline
  implicit class XContentProviderOps[Self <: XContentProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompareContentIds(value: (XContentIdentifier, XContentIdentifier) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareContentIds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQueryContent(value: XContentIdentifier => XContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryContent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

