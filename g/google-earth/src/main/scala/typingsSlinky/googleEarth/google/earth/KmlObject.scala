package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlObject extends GEEventEmitter {
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  def equals(compareTo: KmlObject): Boolean = js.native
  /**
    * The unique ID of the KML object.
    */
  def getId(): String = js.native
  /**
    * The document that owns the KML object.
    */
  def getOwnerDocument(): KmlDocument = js.native
  /**
    * The parent node of the KML object.
    */
  def getParentNode(): KmlObject = js.native
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  def getType(): String = js.native
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  def getUrl(): String = js.native
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  def release(): Unit = js.native
}

object KmlObject {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getId: () => String,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit
  ): KmlObject = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getId = js.Any.fromFunction0(getId), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[KmlObject]
  }
  @scala.inline
  implicit class KmlObjectOps[Self <: KmlObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(value: KmlObject => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOwnerDocument(value: () => KmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentNode(value: () => KmlObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

