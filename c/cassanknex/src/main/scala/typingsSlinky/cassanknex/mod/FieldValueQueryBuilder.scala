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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldValueQueryBuilder[T] extends js.Object {
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
  implicit class FieldValueQueryBuilderOps[Self[t] <: FieldValueQueryBuilder[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAscii(value: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascii")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBigint(value: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlob(value: js.Any => TypeMatchedValue[T, js.Any, Buffer, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBoolean(value: js.Any => TypeMatchedValue[T, js.Any, Boolean, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCounter(value: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDate(value: js.Any => TypeMatchedValue[T, js.Any, LocalDate, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecimal(value: js.Any => TypeMatchedValue[T, js.Any, BigDecimal, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDouble(value: js.Any => TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("double")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFloat(value: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInet(value: js.Any => TypeMatchedValue[T, js.Any, InetAddress, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInt(value: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: (js.Any, String) => TypeMatchedValue[T, js.Any, js.Array[_], FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMap(
      value: (js.Any, js.Any, js.Any) => TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], FieldValueQueryBuilder[T]]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPrimary(value: String => FieldValueQueryBuilder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(
      value: (js.Any, js.Any) => TypeMatchedValue[
          T, 
          js.Any, 
          Set[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          FieldValueQueryBuilder[T]
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withText(value: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Any => TypeMatchedValue[T, js.Any, js.Date, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeuuid(value: js.Any => TypeMatchedValue[T, js.Any, TimeUuid, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeuuid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUuid(value: js.Any => TypeMatchedValue[T, js.Any, Uuid, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVarchar(value: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varchar")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

