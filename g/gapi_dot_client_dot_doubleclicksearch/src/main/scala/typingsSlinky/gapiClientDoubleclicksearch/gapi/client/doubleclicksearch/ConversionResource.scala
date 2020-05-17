package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDoubleclicksearch.anon.AdId
import typingsSlinky.gapiClientDoubleclicksearch.anon.AdvertiserId
import typingsSlinky.gapiClientDoubleclicksearch.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: AdId): Request[ConversionList] = js.native
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: Alt): Request[ConversionList] = js.native
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: AdvertiserId): Request[ConversionList] = js.native
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: Alt): Request[ConversionList] = js.native
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: Alt): Request[UpdateAvailabilityResponse] = js.native
}

object ConversionResource {
  @scala.inline
  def apply(
    get: AdId => Request[ConversionList],
    insert: Alt => Request[ConversionList],
    patch: AdvertiserId => Request[ConversionList],
    update: Alt => Request[ConversionList],
    updateAvailability: Alt => Request[UpdateAvailabilityResponse]
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
    def withGet(value: AdId => Request[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Alt => Request[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AdvertiserId => Request[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[ConversionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateAvailability(value: Alt => Request[UpdateAvailabilityResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAvailability")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

