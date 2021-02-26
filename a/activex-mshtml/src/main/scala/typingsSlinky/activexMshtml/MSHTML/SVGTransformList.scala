package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGTransformList extends StObject {
  
  @JSName("MSHTML.SVGTransformList_typekey")
  var MSHTMLDotSVGTransformList_typekey: SVGTransformList = js.native
  
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  
  def clear(): Unit = js.native
  
  def consolidate(): SVGTransform = js.native
  
  def createSVGTransformFromMatrix(newItem: SVGMatrix): SVGTransform = js.native
  
  def getItem(index: Double): SVGTransform = js.native
  
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  
  var numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGTransform = js.native
  
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}
object SVGTransformList {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGTransformList_typekey: SVGTransformList,
    appendItem: SVGTransform => SVGTransform,
    clear: () => Unit,
    consolidate: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    getItem: Double => SVGTransform,
    initialize: SVGTransform => SVGTransform,
    insertItemBefore: (SVGTransform, Double) => SVGTransform,
    numberOfItems: Double,
    removeItem: Double => SVGTransform,
    replaceItem: (SVGTransform, Double) => SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.updateDynamic("MSHTML.SVGTransformList_typekey")(MSHTMLDotSVGTransformList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransformList]
  }
  
  @scala.inline
  implicit class SVGTransformListMutableBuilder[Self <: SVGTransformList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: SVGTransform => SVGTransform): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConsolidate(value: () => SVGTransform): Self = StObject.set(x, "consolidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGTransform): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGTransform => SVGTransform): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGTransform, Double) => SVGTransform): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMSHTMLDotSVGTransformList_typekey(value: SVGTransformList): Self = StObject.set(x, "MSHTML.SVGTransformList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGTransform): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGTransform, Double) => SVGTransform): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
