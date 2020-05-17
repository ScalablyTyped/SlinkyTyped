package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a supplier for a content provider.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
@js.native
trait XContentProviderSupplier extends XInterface {
  /**
    * returns a content provider.
    * @returns a content provider.
    */
  val ContentProvider: XContentProvider = js.native
  /**
    * returns a content provider.
    * @returns a content provider.
    */
  def getContentProvider(): XContentProvider = js.native
}

object XContentProviderSupplier {
  @scala.inline
  def apply(
    ContentProvider: XContentProvider,
    acquire: () => Unit,
    getContentProvider: () => XContentProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentProviderSupplier = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContentProvider = js.Any.fromFunction0(getContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProviderSupplier]
  }
  @scala.inline
  implicit class XContentProviderSupplierOps[Self <: XContentProviderSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentProvider(value: XContentProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContentProvider(value: () => XContentProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentProvider")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

