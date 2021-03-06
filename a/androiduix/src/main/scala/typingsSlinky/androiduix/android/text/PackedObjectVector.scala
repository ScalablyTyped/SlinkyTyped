package typingsSlinky.androiduix.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackedObjectVector[E] extends StObject {
  
  def deleteAt(row: Double, count: Double): Unit = js.native
  
  def dump(): Unit = js.native
  
  def getValue(row: Double, column: Double): E = js.native
  
  /* private */ def growBuffer(): js.Any = js.native
  
  def insertAt(row: Double, values: js.Array[E]): Unit = js.native
  
  var mColumns: js.Any = js.native
  
  var mRowGapLength: js.Any = js.native
  
  var mRowGapStart: js.Any = js.native
  
  var mRows: js.Any = js.native
  
  var mValues: js.Any = js.native
  
  /* private */ def moveRowGapTo(where: js.Any): js.Any = js.native
  
  def setValue(row: Double, column: Double, value: E): Unit = js.native
  
  def size(): Double = js.native
  
  def width(): Double = js.native
}
object PackedObjectVector {
  
  @scala.inline
  def apply[E](
    deleteAt: (Double, Double) => Unit,
    dump: () => Unit,
    getValue: (Double, Double) => E,
    growBuffer: () => js.Any,
    insertAt: (Double, js.Array[E]) => Unit,
    mColumns: js.Any,
    mRowGapLength: js.Any,
    mRowGapStart: js.Any,
    mRows: js.Any,
    mValues: js.Any,
    moveRowGapTo: js.Any => js.Any,
    setValue: (Double, Double, E) => Unit,
    size: () => Double,
    width: () => Double
  ): PackedObjectVector[E] = {
    val __obj = js.Dynamic.literal(deleteAt = js.Any.fromFunction2(deleteAt), dump = js.Any.fromFunction0(dump), getValue = js.Any.fromFunction2(getValue), growBuffer = js.Any.fromFunction0(growBuffer), insertAt = js.Any.fromFunction2(insertAt), mColumns = mColumns.asInstanceOf[js.Any], mRowGapLength = mRowGapLength.asInstanceOf[js.Any], mRowGapStart = mRowGapStart.asInstanceOf[js.Any], mRows = mRows.asInstanceOf[js.Any], mValues = mValues.asInstanceOf[js.Any], moveRowGapTo = js.Any.fromFunction1(moveRowGapTo), setValue = js.Any.fromFunction3(setValue), size = js.Any.fromFunction0(size), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[PackedObjectVector[E]]
  }
  
  @scala.inline
  implicit class PackedObjectVectorMutableBuilder[Self <: PackedObjectVector[_], E] (val x: Self with PackedObjectVector[E]) extends AnyVal {
    
    @scala.inline
    def setDeleteAt(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDump(value: () => Unit): Self = StObject.set(x, "dump", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: (Double, Double) => E): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGrowBuffer(value: () => js.Any): Self = StObject.set(x, "growBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertAt(value: (Double, js.Array[E]) => Unit): Self = StObject.set(x, "insertAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMColumns(value: js.Any): Self = StObject.set(x, "mColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRowGapLength(value: js.Any): Self = StObject.set(x, "mRowGapLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRowGapStart(value: js.Any): Self = StObject.set(x, "mRowGapStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRows(value: js.Any): Self = StObject.set(x, "mRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMValues(value: js.Any): Self = StObject.set(x, "mValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveRowGapTo(value: js.Any => js.Any): Self = StObject.set(x, "moveRowGapTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: (Double, Double, E) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
  }
}
