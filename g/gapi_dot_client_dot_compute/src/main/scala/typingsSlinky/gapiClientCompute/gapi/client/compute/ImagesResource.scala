package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFamily
import typingsSlinky.gapiClientCompute.AnonFieldsImage
import typingsSlinky.gapiClientCompute.AnonForceCreate
import typingsSlinky.gapiClientCompute.AnonImage
import typingsSlinky.gapiClientCompute.AnonKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesResource extends js.Object {
  /** Deletes the specified image. */
  def delete(request: AnonImage): Request_[Operation] = js.native
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: AnonImage): Request_[Operation] = js.native
  /** Returns the specified image. Get a list of available images by making a list() request. */
  def get(request: AnonFieldsImage): Request_[Image] = js.native
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(request: AnonFamily): Request_[Image] = js.native
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: AnonForceCreate): Request_[Operation] = js.native
  /**
    * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method
    * does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of
    * publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
    */
  def list(request: AnonAlt): Request_[ImageList] = js.native
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonKeyOauthtoken): Request_[Operation] = js.native
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonImage => Request_[Operation],
    deprecate: AnonImage => Request_[Operation],
    get: AnonFieldsImage => Request_[Image],
    getFromFamily: AnonFamily => Request_[Image],
    insert: AnonForceCreate => Request_[Operation],
    list: AnonAlt => Request_[ImageList],
    setLabels: AnonKeyOauthtoken => Request_[Operation]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deprecate = js.Any.fromFunction1(deprecate), get = js.Any.fromFunction1(get), getFromFamily = js.Any.fromFunction1(getFromFamily), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[ImagesResource]
  }
  @scala.inline
  implicit class ImagesResourceOps[Self <: ImagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonImage => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeprecate(value: AnonImage => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsImage => Request_[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFromFamily(value: AnonFamily => Request_[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFromFamily")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonForceCreate => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ImageList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabels(value: AnonKeyOauthtoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

