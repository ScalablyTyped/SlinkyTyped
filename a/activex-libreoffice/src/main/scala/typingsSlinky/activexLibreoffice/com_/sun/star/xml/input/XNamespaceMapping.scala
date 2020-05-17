package typingsSlinky.activexLibreoffice.com_.sun.star.xml.input

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to map XML namespace URI strings to ordinals (URI-id, short uid). */
@js.native
trait XNamespaceMapping extends XInterface {
  /**
    * Creates a unique ordinal passing an XML namespace URI.
    * @param uri XML namespace URI
    * @returns uid
    */
  def getUidByUri(uri: String): Double = js.native
  /**
    * Gets the corresponding XML namespace URI passing a uid (created using {@link getUidByUri()} ).
    * @param uid uid
    * @returns XML namespace URI
    */
  def getUriByUid(uid: Double): String = js.native
}

object XNamespaceMapping {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getUidByUri: String => Double,
    getUriByUid: Double => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNamespaceMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getUidByUri = js.Any.fromFunction1(getUidByUri), getUriByUid = js.Any.fromFunction1(getUriByUid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNamespaceMapping]
  }
  @scala.inline
  implicit class XNamespaceMappingOps[Self <: XNamespaceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUidByUri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUidByUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUriByUid(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUriByUid")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

