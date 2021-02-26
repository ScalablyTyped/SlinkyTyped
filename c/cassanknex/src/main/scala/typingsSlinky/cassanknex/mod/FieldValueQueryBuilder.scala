package typingsSlinky.cassanknex.mod

import typingsSlinky.cassandraDriver.mod.types.BigDecimal
import typingsSlinky.cassandraDriver.mod.types.InetAddress
import typingsSlinky.cassandraDriver.mod.types.LocalDate
import typingsSlinky.cassandraDriver.mod.types.TimeUuid
import typingsSlinky.cassandraDriver.mod.types.Uuid
import typingsSlinky.long.mod.Long
import typingsSlinky.node.Buffer
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldValueQueryBuilder[T] extends StObject {
  
  def ascii[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, String, this.type] = js.native
  
  def bigint[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Long, this.type] = js.native
  
  def blob[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Buffer, this.type] = js.native
  
  def boolean[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Boolean, this.type] = js.native
  
  def counter[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Long, this.type] = js.native
  
  def date[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, LocalDate, this.type] = js.native
  
  def decimal[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, BigDecimal, this.type] = js.native
  
  def double[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Long, this.type] = js.native
  
  def float[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Double, this.type] = js.native
  
  def inet[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, InetAddress, this.type] = js.native
  
  def int[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Double, this.type] = js.native
  
  def list[K /* <: /* keyof T */ String */](columnName: K, typeName: String): TypeMatchedValue[T, K, js.Array[_], this.type] = js.native
  
  def map[K /* <: /* keyof T */ String */, A /* <: String */, B](columnName: K, a: A, b: B): TypeMatchedValue[T, K, Map[A, B], this.type] = js.native
  
  def primary(primaryKey: String): this.type = js.native
  
  def set[K /* <: /* keyof T */ String */, A /* <: String */](columnName: K, a: A): TypeMatchedValue[
    T, 
    K, 
    Set[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ], 
    this.type
  ] = js.native
  
  def text[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, String, this.type] = js.native
  
  def timestamp[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, js.Date, this.type] = js.native
  
  def timeuuid[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, TimeUuid, this.type] = js.native
  
  def uuid[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, Uuid, this.type] = js.native
  
  def varchar[K /* <: /* keyof T */ String */](columnName: K): TypeMatchedValue[T, K, String, this.type] = js.native
}
object FieldValueQueryBuilder {
  
  @scala.inline
  def apply[T](
    ascii: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]],
    bigint: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]],
    blob: js.Any => TypeMatchedValue[T, js.Any, Buffer, FieldValueQueryBuilder[T]],
    boolean: js.Any => TypeMatchedValue[T, js.Any, Boolean, FieldValueQueryBuilder[T]],
    counter: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]],
    date: js.Any => TypeMatchedValue[T, js.Any, LocalDate, FieldValueQueryBuilder[T]],
    decimal: js.Any => TypeMatchedValue[T, js.Any, BigDecimal, FieldValueQueryBuilder[T]],
    double: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]],
    float: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]],
    inet: js.Any => TypeMatchedValue[T, js.Any, InetAddress, FieldValueQueryBuilder[T]],
    int: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]],
    list: (js.Any, String) => TypeMatchedValue[T, js.Any, js.Array[_], FieldValueQueryBuilder[T]],
    map: (js.Any, js.Any, js.Any) => TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], FieldValueQueryBuilder[T]],
    primary: String => FieldValueQueryBuilder[T],
    set: (js.Any, js.Any) => TypeMatchedValue[
      T, 
      js.Any, 
      Set[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      FieldValueQueryBuilder[T]
    ],
    text: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]],
    timestamp: js.Any => TypeMatchedValue[T, js.Any, js.Date, FieldValueQueryBuilder[T]],
    timeuuid: js.Any => TypeMatchedValue[T, js.Any, TimeUuid, FieldValueQueryBuilder[T]],
    uuid: js.Any => TypeMatchedValue[T, js.Any, Uuid, FieldValueQueryBuilder[T]],
    varchar: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]
  ): FieldValueQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(ascii = js.Any.fromFunction1(ascii), bigint = js.Any.fromFunction1(bigint), blob = js.Any.fromFunction1(blob), boolean = js.Any.fromFunction1(boolean), counter = js.Any.fromFunction1(counter), date = js.Any.fromFunction1(date), decimal = js.Any.fromFunction1(decimal), double = js.Any.fromFunction1(double), float = js.Any.fromFunction1(float), inet = js.Any.fromFunction1(inet), int = js.Any.fromFunction1(int), list = js.Any.fromFunction2(list), map = js.Any.fromFunction3(map), primary = js.Any.fromFunction1(primary), set = js.Any.fromFunction2(set), text = js.Any.fromFunction1(text), timestamp = js.Any.fromFunction1(timestamp), timeuuid = js.Any.fromFunction1(timeuuid), uuid = js.Any.fromFunction1(uuid), varchar = js.Any.fromFunction1(varchar))
    __obj.asInstanceOf[FieldValueQueryBuilder[T]]
  }
  
  @scala.inline
  implicit class FieldValueQueryBuilderMutableBuilder[Self <: FieldValueQueryBuilder[_], T] (val x: Self with FieldValueQueryBuilder[T]) extends AnyVal {
    
    @scala.inline
    def setAscii(value: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "ascii", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBigint(value: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "bigint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlob(value: js.Any => TypeMatchedValue[T, js.Any, Buffer, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "blob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBoolean(value: js.Any => TypeMatchedValue[T, js.Any, Boolean, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCounter(value: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "counter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDate(value: js.Any => TypeMatchedValue[T, js.Any, LocalDate, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecimal(value: js.Any => TypeMatchedValue[T, js.Any, BigDecimal, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "decimal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDouble(value: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "double", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFloat(value: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "float", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInet(value: js.Any => TypeMatchedValue[T, js.Any, InetAddress, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "inet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInt(value: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "int", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: (js.Any, String) => TypeMatchedValue[T, js.Any, js.Array[_], FieldValueQueryBuilder[T]]): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMap(
      value: (js.Any, js.Any, js.Any) => TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], FieldValueQueryBuilder[T]]
    ): Self = StObject.set(x, "map", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrimary(value: String => FieldValueQueryBuilder[T]): Self = StObject.set(x, "primary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(
      value: (js.Any, js.Any) => TypeMatchedValue[
          T, 
          js.Any, 
          Set[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          FieldValueQueryBuilder[T]
        ]
    ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimestamp(value: js.Any => TypeMatchedValue[T, js.Any, js.Date, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "timestamp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeuuid(value: js.Any => TypeMatchedValue[T, js.Any, TimeUuid, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "timeuuid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUuid(value: js.Any => TypeMatchedValue[T, js.Any, Uuid, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "uuid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVarchar(value: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]): Self = StObject.set(x, "varchar", js.Any.fromFunction1(value))
  }
}
