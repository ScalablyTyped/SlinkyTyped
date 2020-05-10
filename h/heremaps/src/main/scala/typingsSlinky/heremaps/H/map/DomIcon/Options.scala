package typingsSlinky.heremaps.H.map.DomIcon

import org.scalajs.dom.raw.Element
import typingsSlinky.heremaps.H.map.DomMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a DomIcon
  * @property onAttach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked before a clone of the icon's element is appended and displayed on the map.
  * This callback can be used to setup the clone.
  * @property onDetach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked after a clone of the icon's element is removed from the map.
  * This callback can be used to clean up the clone.
  */
@js.native
trait Options extends js.Object {
  var onAttach: js.UndefOr[
    js.Function3[
      /* el */ Element, 
      /* icon */ typingsSlinky.heremaps.H.map.DomIcon, 
      /* marker */ DomMarker, 
      Unit
    ]
  ] = js.native
  var onDetach: js.UndefOr[
    js.Function3[
      /* el */ Element, 
      /* icon */ typingsSlinky.heremaps.H.map.DomIcon, 
      /* marker */ DomMarker, 
      Unit
    ]
  ] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAttach(
      value: (/* el */ Element, /* icon */ typingsSlinky.heremaps.H.map.DomIcon, /* marker */ DomMarker) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttach")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAttach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttach")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDetach(
      value: (/* el */ Element, /* icon */ typingsSlinky.heremaps.H.map.DomIcon, /* marker */ DomMarker) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(js.undefined)
        ret
    }
  }
  
}

