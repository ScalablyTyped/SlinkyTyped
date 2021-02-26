package typingsSlinky.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableModel extends StObject {
  
  def bindTo(element: js.Any): Unit = js.native
  
  def get(index: Double): Unit = js.native
  
  def getChanges(): Changes = js.native
  
  def insert(json: js.Any): Unit = js.native
  
  def isDirty(): Boolean = js.native
  
  def length(): Double = js.native
  
  def off(eventName: String, handler: js.Any): Unit = js.native
  
  def on(eventName: String, handler: js.Any): Unit = js.native
  
  def rejectChanges(): Unit = js.native
  
  def remove(key: String): Unit = js.native
  
  def saveChanges(): Unit = js.native
  
  def setDataManager(dataManager: DataManager): Unit = js.native
  
  def setDirty(dirty: js.Any, model: js.Any): Unit = js.native
  
  def toArray(): js.Array[_] = js.native
  
  def update(value: js.Any): Unit = js.native
}
object TableModel {
  
  @scala.inline
  def apply(
    bindTo: js.Any => Unit,
    get: Double => Unit,
    getChanges: () => Changes,
    insert: js.Any => Unit,
    isDirty: () => Boolean,
    length: () => Double,
    off: (String, js.Any) => Unit,
    on: (String, js.Any) => Unit,
    rejectChanges: () => Unit,
    remove: String => Unit,
    saveChanges: () => Unit,
    setDataManager: DataManager => Unit,
    setDirty: (js.Any, js.Any) => Unit,
    toArray: () => js.Array[_],
    update: js.Any => Unit
  ): TableModel = {
    val __obj = js.Dynamic.literal(bindTo = js.Any.fromFunction1(bindTo), get = js.Any.fromFunction1(get), getChanges = js.Any.fromFunction0(getChanges), insert = js.Any.fromFunction1(insert), isDirty = js.Any.fromFunction0(isDirty), length = js.Any.fromFunction0(length), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), rejectChanges = js.Any.fromFunction0(rejectChanges), remove = js.Any.fromFunction1(remove), saveChanges = js.Any.fromFunction0(saveChanges), setDataManager = js.Any.fromFunction1(setDataManager), setDirty = js.Any.fromFunction2(setDirty), toArray = js.Any.fromFunction0(toArray), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TableModel]
  }
  
  @scala.inline
  implicit class TableModelMutableBuilder[Self <: TableModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindTo(value: js.Any => Unit): Self = StObject.set(x, "bindTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Double => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChanges(value: () => Changes): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: js.Any => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDirty(value: () => Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOff(value: (String, js.Any) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRejectChanges(value: () => Unit): Self = StObject.set(x, "rejectChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveChanges(value: () => Unit): Self = StObject.set(x, "saveChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataManager(value: DataManager => Unit): Self = StObject.set(x, "setDataManager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirty(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "setDirty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[_]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
