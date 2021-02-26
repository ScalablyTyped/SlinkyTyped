package typingsSlinky.devextreme.mod.DevExpress

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import typingsSlinky.devextreme.anon.X
import typingsSlinky.devextreme.anon.XY
import typingsSlinky.devextreme.anon.Y
import typingsSlinky.devextreme.devextremeStrings.`fit flip`
import typingsSlinky.devextreme.devextremeStrings.`fit flipfit`
import typingsSlinky.devextreme.devextremeStrings.`fit none`
import typingsSlinky.devextreme.devextremeStrings.`flip fit`
import typingsSlinky.devextreme.devextremeStrings.`flip none`
import typingsSlinky.devextreme.devextremeStrings.`flipfit fit`
import typingsSlinky.devextreme.devextremeStrings.`flipfit none`
import typingsSlinky.devextreme.devextremeStrings.`left bottom`
import typingsSlinky.devextreme.devextremeStrings.`left top`
import typingsSlinky.devextreme.devextremeStrings.`none fit`
import typingsSlinky.devextreme.devextremeStrings.`none flip`
import typingsSlinky.devextreme.devextremeStrings.`none flipfit`
import typingsSlinky.devextreme.devextremeStrings.`right bottom`
import typingsSlinky.devextreme.devextremeStrings.`right top`
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.fit
import typingsSlinky.devextreme.devextremeStrings.flip
import typingsSlinky.devextreme.devextremeStrings.flipfit
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait positionConfig extends StObject {
  
  /**
    * [descr:positionConfig.at]
    */
  var at: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.native
  
  /**
    * [descr:positionConfig.boundary]
    */
  var boundary: js.UndefOr[String | Element | JQuery | Window] = js.native
  
  /**
    * [descr:positionConfig.boundaryOffset]
    */
  var boundaryOffset: js.UndefOr[String | Y] = js.native
  
  /**
    * [descr:positionConfig.collision]
    */
  var collision: js.UndefOr[
    fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
  ] = js.native
  
  /**
    * [descr:positionConfig.my]
    */
  var my: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
  ] = js.native
  
  /**
    * [descr:positionConfig.of]
    */
  var of: js.UndefOr[String | Element | JQuery | Window] = js.native
  
  /**
    * [descr:positionConfig.offset]
    */
  var offset: js.UndefOr[String | Y] = js.native
}
object positionConfig {
  
  @scala.inline
  def apply(): positionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[positionConfig]
  }
  
  @scala.inline
  implicit class positionConfigMutableBuilder[Self <: positionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAt(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    @scala.inline
    def setBoundary(value: String | Element | JQuery | Window): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryElement(value: Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryOffset(value: String | Y): Self = StObject.set(x, "boundaryOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryOffsetUndefined: Self = StObject.set(x, "boundaryOffset", js.undefined)
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setBoundaryWindow(value: Window): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollision(
      value: fit | (`fit flip`) | (`fit flipfit`) | (`fit none`) | flip | (`flip fit`) | (`flip none`) | flipfit | (`flipfit fit`) | (`flipfit none`) | none | (`none fit`) | (`none flip`) | (`none flipfit`) | XY
    ): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    @scala.inline
    def setMy(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | X
    ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    @scala.inline
    def setOf(value: String | Element | JQuery | Window): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfElement(value: Element): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    @scala.inline
    def setOfWindow(value: Window): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: String | Y): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
