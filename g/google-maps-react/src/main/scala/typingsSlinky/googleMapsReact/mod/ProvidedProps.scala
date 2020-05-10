package typingsSlinky.googleMapsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvidedProps extends js.Object {
  var google: GoogleAPI = js.native
  var loaded: js.UndefOr[Boolean] = js.native
}

object ProvidedProps {
  @scala.inline
  def apply(google: GoogleAPI): ProvidedProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedProps]
  }
  @scala.inline
  implicit class ProvidedPropsOps[Self <: ProvidedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogle(value: GoogleAPI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
  }
  
}

