package typingsSlinky.iitc

import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.LayerGroup_
import typingsSlinky.spectrum.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMiscMod {
  
  object global {
    
    /**
      * Show about dialog
      *
      * Plugins metadata come from 2 sources:
      * - buildName, pluginId, dateTimeVersion: inserted in plugin body by build script
      *   (only standard plugins)
      * - script.name/version/description: from GM_info object, passed to wrapper
      *   `script` may be not available if userscript manager does not provede GM_info
      *   (atm: IITC-Mobile for iOS)
      */
    @JSGlobal("aboutIITC")
    @js.native
    def aboutIITC(): Unit = js.native
    
    @JSGlobal("addLayerGroup")
    @js.native
    def addLayerGroup(name: String, layerGroup: LayerGroup_[_]): Unit = js.native
    @JSGlobal("addLayerGroup")
    @js.native
    def addLayerGroup(name: String, layerGroup: LayerGroup_[_], defaultDisplay: Boolean): Unit = js.native
    
    @JSGlobal("androidCopy")
    @js.native
    def androidCopy(text: String): Boolean = js.native
    
    /**
      * Given 3 sets of points in an array[3]{lat, lng} returns the area of the triangle
      * NOTE: not geodesic area!
      */
    @JSGlobal("calcTriArea")
    @js.native
    def calcTriArea(p: js.Tuple3[LatLng_, LatLng_, LatLng_]): Double = js.native
    
    @JSGlobal("clampLatLng")
    @js.native
    def clampLatLng(latlng: LatLng_): LatLng_ = js.native
    
    @JSGlobal("clampLatLngBounds")
    @js.native
    def clampLatLngBounds(bounds: LatLngBounds_): LatLngBounds_ = js.native
    
    /**
      * certain values were stored in cookies, but we're better off using localStorage instead - make it easy to convert
      */
    @JSGlobal("convertCookieToLocalStorage")
    @js.native
    def convertCookieToLocalStorage(name: String): Unit = js.native
    
    /** converts given text with newlines (\n) and tabs (\t) to a HTML table automatically. */
    @JSGlobal("convertTextToTableMagic")
    @js.native
    def convertTextToTableMagic(text: String): String = js.native
    
    @JSGlobal("digits")
    @js.native
    def digits(d: String): String = js.native
    /**
      * add thousand separators to given number.
      * http://stackoverflow.com/a/1990590/1684530 by Doug Neiner.
      */
    @JSGlobal("digits")
    @js.native
    def digits(d: Double): String = js.native
    
    @JSGlobal("eraseCookie")
    @js.native
    def eraseCookie(name: String): Unit = js.native
    
    /** escape special characters, such as tags */
    @JSGlobal("escapeHtmlSpecialChars")
    @js.native
    def escapeHtmlSpecialChars(str: String): String = js.native
    
    /**
      * escape a javascript string, so quotes and backslashes are escaped with a backslash
      * (for strings passed as parameters to html onclick="..." for example)
      */
    @JSGlobal("escapeJavascriptString")
    @js.native
    def escapeJavascriptString(str: String): String = js.native
    
    /** format time difference */
    @JSGlobal("formatInterval")
    @js.native
    def formatInterval(seconds: Double): String = js.native
    @JSGlobal("formatInterval")
    @js.native
    def formatInterval(seconds: Double, maxTerms: Double): String = js.native
    
    @JSGlobal("genFourColumnTable")
    @js.native
    def genFourColumnTable(blocks: js.Array[_]): String = js.native
    
    @JSGlobal("getCurrentZoomTileParameters")
    @js.native
    def getCurrentZoomTileParameters(): js.Any = js.native
    
    /** retrieves parameter from the URL?query=string. */
    @JSGlobal("getURLParam")
    @js.native
    def getURLParam(param: String): String = js.native
    
    /**
      * Read layerGroup status from window.overlayStatus if it was added to map,
      * read from cookie if it has not added to map yet.
      * @return 'defaultDisplay' if both overlayStatus and cookie didn't have the record
      */
    @JSGlobal("isLayerGroupDisplayed")
    @js.native
    def isLayerGroupDisplayed(name: String, defaultDisplay: Boolean): Boolean = js.native
    
    @JSGlobal("isTouchDevice")
    @js.native
    def isTouchDevice(): Boolean = js.native
    
    @JSGlobal("layerGroupLength")
    @js.native
    def layerGroupLength(layerGroup: LayerGroup_[_]): Double = js.native
    
    /**
      * Makes the permalink for the portal with specified latlng, possibly including current map view.
      * Portal latlng can be omitted to create mapview-only permalink.
      * @param option:
      * - includeMapView: Boolean = null
      * Use to add zoom level and latlng of current map center.
      * - fullURL: Boolean = null
      * Use to make absolute fully qualified URL (default: relative link).
      */
    @JSGlobal("makePermalink")
    @js.native
    def makePermalink(latlng: LatLng_): String = js.native
    @JSGlobal("makePermalink")
    @js.native
    def makePermalink(latlng: LatLng_, options: js.Object): String = js.native
    
    @JSGlobal("prettyEnergy")
    @js.native
    def prettyEnergy(nrg: Double): String = js.native
    
    @JSGlobal("rangeLinkClick")
    @js.native
    def rangeLinkClick(): Unit = js.native
    
    /**
      * read cookie by name.
      * http://stackoverflow.com/a/5639455/1684530 by cwolves
      */
    @JSGlobal("readCookie")
    @js.native
    def readCookie(name: String): String = js.native
    
    @JSGlobal("removeLayerGroup")
    @js.native
    def removeLayerGroup(layerGroup: LayerGroup_[_]): Unit = js.native
    
    // return getMapZoomTileParameters()
    /** returns number of pixels left to scroll down before reaching the bottom. */
    @JSGlobal("scrollBottom")
    @js.native
    def scrollBottom(element: String): Double = js.native
    @JSGlobal("scrollBottom")
    @js.native
    def scrollBottom(element: JQuery): Double = js.native
    
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: js.Tuple2[Double, Double]): Unit = js.native
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: js.Tuple2[Double, Double], lng: Double): Unit = js.native
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: Double): Unit = js.native
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: Double, lng: Double): Unit = js.native
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: LatLng_): Unit = js.native
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: LatLng_, lng: Double): Unit = js.native
    
    @JSGlobal("showPortalPosLinks")
    @js.native
    def showPortalPosLinks(lat: Double, lng: Double): Unit = js.native
    @JSGlobal("showPortalPosLinks")
    @js.native
    def showPortalPosLinks(lat: Double, lng: Double, name: String): Unit = js.native
    
    @JSGlobal("uniqueArray")
    @js.native
    def uniqueArray(arr: js.Array[_]): js.Array[_] = js.native
    
    @JSGlobal("unixTimeToDateTimeString")
    @js.native
    def unixTimeToDateTimeString(ticks: String): String = js.native
    @JSGlobal("unixTimeToDateTimeString")
    @js.native
    def unixTimeToDateTimeString(ticks: String, millisecond: Boolean): String = js.native
    @JSGlobal("unixTimeToDateTimeString")
    @js.native
    def unixTimeToDateTimeString(ticks: js.Date): String = js.native
    @JSGlobal("unixTimeToDateTimeString")
    @js.native
    def unixTimeToDateTimeString(ticks: js.Date, millisecond: Boolean): String = js.native
    /**
      * convert time to string
      * converts a javascript time to a precise date and time (optionally with millisecond precision)
      * formatted in ISO-style YYYY-MM-DD hh:mm:ss.mmm - but using local timezone
      */
    @JSGlobal("unixTimeToDateTimeString")
    @js.native
    def unixTimeToDateTimeString(ticks: Double): String = js.native
    @JSGlobal("unixTimeToDateTimeString")
    @js.native
    def unixTimeToDateTimeString(ticks: Double, millisecond: Boolean): String = js.native
    
    @JSGlobal("unixTimeToHHmm")
    @js.native
    def unixTimeToHHmm(time: String): String = js.native
    @JSGlobal("unixTimeToHHmm")
    @js.native
    def unixTimeToHHmm(time: js.Date): String = js.native
    /** convert time to string */
    @JSGlobal("unixTimeToHHmm")
    @js.native
    def unixTimeToHHmm(time: Double): String = js.native
    
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: js.UndefOr[scala.Nothing], full: Boolean): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: String): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: String, full: Boolean): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: js.Date): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: js.Date, full: Boolean): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: Double): String = js.native
    @JSGlobal("unixTimeToString")
    @js.native
    def unixTimeToString(time: Double, full: Boolean): String = js.native
    
    /** Update layerGroups display status to window.overlayStatus and localStorage 'ingress.intelmap.layergroupdisplayed' */
    @JSGlobal("updateDisplayedLayerGroup")
    @js.native
    def updateDisplayedLayerGroup(name: String, display: Boolean): Unit = js.native
    
    @JSGlobal("writeCookie")
    @js.native
    def writeCookie(name: String, `val`: String): Unit = js.native
    
    @JSGlobal("zeroPad")
    @js.native
    def zeroPad(num: Double, pad: Double): String = js.native
    
    @JSGlobal("zoomToAndShowPortal")
    @js.native
    def zoomToAndShowPortal(guid: String, latlng: LatLng_): Unit = js.native
  }
}
