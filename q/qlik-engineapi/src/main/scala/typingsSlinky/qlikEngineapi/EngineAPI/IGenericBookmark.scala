package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.anon.QEndIndex
import typingsSlinky.qlikEngineapi.anon.QFieldValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at bookmark level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the bookmark.
  */
@js.native
trait IGenericBookmark extends js.Object {
  /**
    * Applies a bookmark.
    * @returns - A promise true or false
    */
  @JSName("apply")
  def apply(): js.Promise[Boolean] = js.native
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit] = js.native
  /**
    * Get the selected values in the bookmark for a specific field.
    *
    * Note: from shema file
    * @param qField - Name of the field
    * @param qGetExcludedValues - Get Excluded Values
    * @param qDataPage - Start and End of DataPage
    * @returns - A promise of Array of FieldValues.
    */
  def getFieldValues(qField: String, qGetExcludedValues: Boolean, qDataPage: QEndIndex): js.Promise[QFieldValues] = js.native
  /**
    * Returns:
    *
    * - the type of the object
    * - the identifier of the object
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @returns - A promise InfoObject
    */
  def getInfo(): js.Promise[INxInfo] = js.native
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated..
    * @returns - A promise of GenericBookmarkLayout
    */
  def getLayout(): js.Promise[IGenericBookmarkLayout] = js.native
  /**
    * Shows the properties of an object.
    * If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A promise of GenericBookmarkProperties
    */
  def getProperties(): js.Promise[IGenericBookmarkProperties] = js.native
  /**
    * Publishes a bookmark.
    * @returns - A promise of a Qlik engine reply.
    */
  def publish(): js.Promise[Unit] = js.native
  /**
    * Sets some properties for a bookmark.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qProp - Information about the bookmark
    * >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def setProperties(qProp: IGenericBookmarkProperties): js.Promise[Unit] = js.native
  /**
    * Unpublishes a bookmark.
    * @returns - A promise of a Qlik engine reply.
    */
  def unPublish(): js.Promise[Unit] = js.native
}

object IGenericBookmark {
  @scala.inline
  def apply(
    apply: () => js.Promise[Boolean],
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getFieldValues: (String, Boolean, QEndIndex) => js.Promise[QFieldValues],
    getInfo: () => js.Promise[INxInfo],
    getLayout: () => js.Promise[IGenericBookmarkLayout],
    getProperties: () => js.Promise[IGenericBookmarkProperties],
    publish: () => js.Promise[Unit],
    setProperties: IGenericBookmarkProperties => js.Promise[Unit],
    unPublish: () => js.Promise[Unit]
  ): IGenericBookmark = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), applyPatches = js.Any.fromFunction1(applyPatches), getFieldValues = js.Any.fromFunction3(getFieldValues), getInfo = js.Any.fromFunction0(getInfo), getLayout = js.Any.fromFunction0(getLayout), getProperties = js.Any.fromFunction0(getProperties), publish = js.Any.fromFunction0(publish), setProperties = js.Any.fromFunction1(setProperties), unPublish = js.Any.fromFunction0(unPublish))
    __obj.asInstanceOf[IGenericBookmark]
  }
  @scala.inline
  implicit class IGenericBookmarkOps[Self <: IGenericBookmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyPatches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFieldValues(value: (String, Boolean, QEndIndex) => js.Promise[QFieldValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldValues")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetInfo(value: () => js.Promise[INxInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLayout(value: () => js.Promise[IGenericBookmarkLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetProperties(value: () => js.Promise[IGenericBookmarkProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPublish(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetProperties(value: IGenericBookmarkProperties => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnPublish(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unPublish")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

