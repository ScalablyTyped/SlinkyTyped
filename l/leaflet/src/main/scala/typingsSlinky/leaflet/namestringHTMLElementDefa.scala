package typingsSlinky.leaflet

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[name: string] : std.HTMLElement} & leaflet.leaflet.DefaultMapPanes */
trait namestringHTMLElementDefa extends /* name */ StringDictionary[HTMLElement] {
  var mapPane: org.scalajs.dom.raw.HTMLElement
  var markerPane: org.scalajs.dom.raw.HTMLElement
  var overlayPane: org.scalajs.dom.raw.HTMLElement
  var popupPane: org.scalajs.dom.raw.HTMLElement
  var shadowPane: org.scalajs.dom.raw.HTMLElement
  var tilePane: org.scalajs.dom.raw.HTMLElement
  var tooltipPane: org.scalajs.dom.raw.HTMLElement
}

object namestringHTMLElementDefa {
  @scala.inline
  def apply(
    mapPane: org.scalajs.dom.raw.HTMLElement,
    markerPane: org.scalajs.dom.raw.HTMLElement,
    overlayPane: org.scalajs.dom.raw.HTMLElement,
    popupPane: org.scalajs.dom.raw.HTMLElement,
    shadowPane: org.scalajs.dom.raw.HTMLElement,
    tilePane: org.scalajs.dom.raw.HTMLElement,
    tooltipPane: org.scalajs.dom.raw.HTMLElement,
    StringDictionary: /* name */ StringDictionary[org.scalajs.dom.raw.HTMLElement] = null
  ): namestringHTMLElementDefa = {
    val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[namestringHTMLElementDefa]
  }
}

