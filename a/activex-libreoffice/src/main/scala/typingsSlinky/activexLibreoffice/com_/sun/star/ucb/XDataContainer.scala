package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a container for (binary) data.
  *
  * A data container may contain data and/or other data containers. A typical container with children is a MIME message with attachments.
  * @author Kai Sommerfeld
  * @deprecated Deprecated
  * @version 1.0
  */
@js.native
trait XDataContainer extends XIndexContainer {
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  var ContentType: String = js.native
  /**
    * returns the data of the data container.
    * @returns the data
    */
  var Data: SafeArray[Double] = js.native
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  var DataURL: String = js.native
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  def getContentType(): String = js.native
  /**
    * returns the data of the data container.
    * @returns the data
    */
  def getData(): SafeArray[Double] = js.native
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def getDataURL(): String = js.native
  /**
    * sets the content type (MIME Type) of the data container.
    * @param aType the content type
    */
  def setContentType(aType: String): Unit = js.native
  /**
    * sets the data of the data container.
    * @param aData the data
    */
  def setData(aData: SeqEquiv[Double]): Unit = js.native
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def setDataURL(aURL: String): Unit = js.native
}

object XDataContainer {
  @scala.inline
  def apply(
    ContentType: String,
    Count: Double,
    Data: SafeArray[Double],
    DataURL: String,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getContentType: () => String,
    getCount: () => Double,
    getData: () => SafeArray[Double],
    getDataURL: () => String,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setContentType: String => Unit,
    setData: SeqEquiv[Double] => Unit,
    setDataURL: String => Unit
  ): XDataContainer = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DataURL = DataURL.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getContentType = js.Any.fromFunction0(getContentType), getCount = js.Any.fromFunction0(getCount), getData = js.Any.fromFunction0(getData), getDataURL = js.Any.fromFunction0(getDataURL), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setContentType = js.Any.fromFunction1(setContentType), setData = js.Any.fromFunction1(setData), setDataURL = js.Any.fromFunction1(setDataURL))
    __obj.asInstanceOf[XDataContainer]
  }
  @scala.inline
  implicit class XDataContainerOps[Self <: XDataContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContentType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContentType(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetData(value: SeqEquiv[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDataURL(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDataURL")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

