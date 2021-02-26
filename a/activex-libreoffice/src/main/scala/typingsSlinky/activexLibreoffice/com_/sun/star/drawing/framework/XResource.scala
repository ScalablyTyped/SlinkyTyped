package typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base interface that provides functionality shared by all resource types of the drawing framework. */
@js.native
trait XResource extends StObject {
  
  /** Return an {@link XResourceId} object for the called resource. The returned id unambiguously identifies the resource. */
  val ResourceId: XResourceId = js.native
  
  /** Return an {@link XResourceId} object for the called resource. The returned id unambiguously identifies the resource. */
  def getResourceId(): XResourceId = js.native
  
  /**
    * Some resources must not be leafs, i.e. have to be anchor to at least one other resource. Most panes are examples for this. Views on the other hand are
    * in most cases no anchors. So the typical pane will return `TRUE` and the typical view will return `FALSE` .
    *
    * The return value is used to determine whether a resource has to be deactivated when it has no children, either because none is requested or because
    * none can be created.
    */
  def isAnchorOnly(): Boolean = js.native
}
object XResource {
  
  @scala.inline
  def apply(ResourceId: XResourceId, getResourceId: () => XResourceId, isAnchorOnly: () => Boolean): XResource = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], getResourceId = js.Any.fromFunction0(getResourceId), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly))
    __obj.asInstanceOf[XResource]
  }
  
  @scala.inline
  implicit class XResourceMutableBuilder[Self <: XResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetResourceId(value: () => XResourceId): Self = StObject.set(x, "getResourceId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAnchorOnly(value: () => Boolean): Self = StObject.set(x, "isAnchorOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResourceId(value: XResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
