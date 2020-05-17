package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlFeature extends KmlObject {
  /**
    * Stores either the lookAt or camera view.
    */
  def getAbstractView(): KmlAbstractView = js.native
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def getAddress(): String = js.native
  /**
    * Retrieves the contents of the feature's <ExtendedData> element.
    * The retrieved contents are scrubbed to remove JavaScript; CSS; and iframe, embed, and object tags. 
    * 
    * It should be safe to insert the resulting HTML into your page without concern for malicious content embedded in the feature data;
    * however any feature depending on CSS or Javascript will not work.
    */
  def getBalloonHtml(): String = js.native
  /**
    * Retrieves the contents of the feature's <ExtendedData> element. The contents are not scrubbed.
    * Use this method only if you trust the source of the feature data.
    */
  def getBalloonHtmlUnsafe(): String = js.native
  /**
    * Returns the computed style of a feature, merging any inline styles with styles imported from setHref() or a StyleUrl.
    *
    * Note: Modifying the returned KmlStyle object is undefined and not recommended.
    */
  def getComputedStyle(): KmlStyle = js.native
  /**
    * User-supplied text that appears in the description balloon.
    */
  def getDescription(): String = js.native
  /**
    * Returns the KML for a feature.
    */
  def getKml(): String = js.native
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def getName(): String = js.native
  /**
    * Returns the next sibling node within the container.
    */
  def getNextSibling(): KmlFeature = js.native
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def getOpacity(): Double = js.native
  /**
    * Default state of left panel.
    */
  def getOpen(): Boolean = js.native
  /**
    * Returns previous sibling node within the container.
    */
  def getPreviousSibling(): KmlFeature = js.native
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getRegion(): KmlRegion = js.native
  /**
    * Specifies a short description of the feature.
    */
  def getSnippet(): String = js.native
  /**
    * The style based on the current mode of the Placemark.
    */
  def getStyleSelector(): KmlStyleSelector = js.native
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def getStyleUrl(): String = js.native
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this feature.
    */
  def getTimePrimitive(): KmlTimePrimitive = js.native
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def getVisibility(): Boolean = js.native
  /**
    * Stores either the lookAt or camera view.
    */
  def setAbstractView(abstractView: KmlAbstractView): Unit = js.native
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def setAddress(address: String): Unit = js.native
  /**
    * User-supplied text that appears in the description balloon.
    */
  def setDescription(description: String): Unit = js.native
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def setName(name: String): Unit = js.native
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def setOpacity(opacity: Double): Unit = js.native
  /**
    * Default state of left panel.
    */
  def setOpen(open: Boolean): Unit = js.native
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setRegion(region: KmlRegion): Unit = js.native
  /**
    * Specifies a short description of the feature.
    */
  def setSnippet(snippet: String): Unit = js.native
  /**
    * The style based on the current mode of the Placemark.
    */
  def setStyleSelector(styleSelector: KmlStyleSelector): Unit = js.native
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def setStyleUrl(styleUrl: String): Unit = js.native
  /**
    * Attach a KmlTimeStamp or KmlTimeSpan object to this feature.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit = js.native
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def setVisibility(visibility: Boolean): Unit = js.native
}

object KmlFeature {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getId: () => String,
    getKml: () => String,
    getName: () => String,
    getNextSibling: () => KmlFeature,
    getOpacity: () => Double,
    getOpen: () => Boolean,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPreviousSibling: () => KmlFeature,
    getRegion: () => KmlRegion,
    getSnippet: () => String,
    getStyleSelector: () => KmlStyleSelector,
    getStyleUrl: () => String,
    getTimePrimitive: () => KmlTimePrimitive,
    getType: () => String,
    getUrl: () => String,
    getVisibility: () => Boolean,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAbstractView: KmlAbstractView => Unit,
    setAddress: String => Unit,
    setDescription: String => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlFeature = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.asInstanceOf[KmlFeature]
  }
  @scala.inline
  implicit class KmlFeatureOps[Self <: KmlFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAbstractView(value: () => KmlAbstractView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAbstractView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAddress(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBalloonHtml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBalloonHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBalloonHtmlUnsafe(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBalloonHtmlUnsafe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetComputedStyle(value: () => KmlStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComputedStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextSibling(value: () => KmlFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviousSibling(value: () => KmlFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRegion(value: () => KmlRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSnippet(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnippet")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyleSelector(value: () => KmlStyleSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStyleUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyleUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimePrimitive(value: () => KmlTimePrimitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimePrimitive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibility(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibility")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAbstractView(value: KmlAbstractView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAbstractView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAddress(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAddress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpacity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpen(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRegion(value: KmlRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSnippet(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSnippet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyleSelector(value: KmlStyleSelector => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyleUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTimePrimitive(value: KmlTimePrimitive => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimePrimitive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisibility(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibility")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

