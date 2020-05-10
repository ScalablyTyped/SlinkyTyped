package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDoubleclicksearch.AnonAdId
import typingsSlinky.gapiClientDoubleclicksearch.AnonAdvertiserId
import typingsSlinky.gapiClientDoubleclicksearch.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: AnonAdId): Request_[ConversionList] = js.native
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: AnonAlt): Request_[ConversionList] = js.native
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: AnonAdvertiserId): Request_[ConversionList] = js.native
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: AnonAlt): Request_[ConversionList] = js.native
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: AnonAlt): Request_[UpdateAvailabilityResponse] = js.native
}

object ConversionResource {
  @scala.inline
  def apply(
    get: AnonAdId => Request_[ConversionList],
    insert: AnonAlt => Request_[ConversionList],
    patch: AnonAdvertiserId => Request_[ConversionList],
    update: AnonAlt => Request_[ConversionList],
    updateAvailability: AnonAlt => Request_[UpdateAvailabilityResponse]
  ): ConversionResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), updateAvailability = js.Any.fromFunction1(updateAvailability))
    __obj.asInstanceOf[ConversionResource]
  }
  @scala.inline
  implicit class ConversionResourceOps[Self <: ConversionResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAdId => Request_[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAlt => Request_[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAdvertiserId => Request_[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateAvailability(value: AnonAlt => Request_[UpdateAvailabilityResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAvailability")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

