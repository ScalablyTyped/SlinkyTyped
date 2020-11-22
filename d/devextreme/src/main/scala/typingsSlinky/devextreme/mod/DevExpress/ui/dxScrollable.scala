package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.DevExpress.DOMComponent
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScrollable extends DOMComponent {
  
  /**
    * [descr:dxScrollable.clientHeight()]
    */
  def clientHeight(): Double = js.native
  
  /**
    * [descr:dxScrollable.clientWidth()]
    */
  def clientWidth(): Double = js.native
  
  /**
    * [descr:dxScrollable.content()]
    */
  def content(): dxElement = js.native
  
  /**
    * [descr:dxScrollable.scrollBy(distanceObject)]
    */
  def scrollBy(distanceObject: js.Any): Unit = js.native
  /**
    * [descr:dxScrollable.scrollBy(distance)]
    */
  def scrollBy(distance: Double): Unit = js.native
  
  /**
    * [descr:dxScrollable.scrollHeight()]
    */
  def scrollHeight(): Double = js.native
  
  /**
    * [descr:dxScrollable.scrollLeft()]
    */
  def scrollLeft(): Double = js.native
  
  /**
    * [descr:dxScrollable.scrollOffset()]
    */
  def scrollOffset(): js.Any = js.native
  
  /**
    * [descr:dxScrollable.scrollTo(targetLocationObject)]
    */
  def scrollTo(targetLocation: js.Any): Unit = js.native
  /**
    * [descr:dxScrollable.scrollTo(targetLocation)]
    */
  def scrollTo(targetLocation: Double): Unit = js.native
  
  def scrollToElement(element: JQuery): Unit = js.native
  /**
    * [descr:dxScrollable.scrollToElement(targetLocation)]
    */
  def scrollToElement(element: Element): Unit = js.native
  
  /**
    * [descr:dxScrollable.scrollTop()]
    */
  def scrollTop(): Double = js.native
  
  /**
    * [descr:dxScrollable.scrollWidth()]
    */
  def scrollWidth(): Double = js.native
  
  /**
    * [descr:dxScrollable.update()]
    */
  def update(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
