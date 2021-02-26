package typingsSlinky.cassanknex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typingsSlinky.cassanknex.mod.CassanKnex = typingsSlinky.cassanknex.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.cassanknex.mod.CassanKnex]
  @scala.inline
  def apply(options: typingsSlinky.cassanknex.mod.DriverOptions): typingsSlinky.cassanknex.mod.CassanKnex = typingsSlinky.cassanknex.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.cassanknex.mod.CassanKnex]
  
  type AlterColumnFamilyQueryBuilder[T] = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.AlterableQueryBuilder[T] with typingsSlinky.cassanknex.mod.FieldValueQueryBuilder[T]
  
  type CreateColumnFamilyQueryBuilder[T] = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.FieldValueQueryBuilder[T] with typingsSlinky.cassanknex.mod.CreateableColumnFamilyBuilder[T]
  
  type CreateTypeQueryBuilder[T] = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.FieldValueQueryBuilder[T]
  
  type DeleteQueryBuilder[T] = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.WhereableQueryBuilder[T] with typingsSlinky.cassanknex.mod.FromableQueryBuilder
  
  type InsertQueryBuilder = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.InsertableQueryBuilder with typingsSlinky.cassanknex.mod.TtlableQueryBuilder
  
  type KeyspaceQueryBuilder = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.KeyspaceableQueryBuilder
  
  type MappedDict[B] = org.scalablytyped.runtime.StringDictionary[B]
  
  type SelectAsClause[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string}
    */ typingsSlinky.cassanknex.cassanknexStrings.SelectAsClause with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type SelectQueryBuilder[T] = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.WhereableQueryBuilder[T] with typingsSlinky.cassanknex.mod.LimitableQueryBuilder with typingsSlinky.cassanknex.mod.FromableQueryBuilder
  
  /**
    * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
    */
  type TypeMatchedValue[T, K /* <: /* keyof T */ java.lang.String */, Type, This] = This
  
  type UpdateQueryBuilder[T] = typingsSlinky.cassanknex.mod.QueryBuilder with typingsSlinky.cassanknex.mod.WhereableQueryBuilder[T] with typingsSlinky.cassanknex.mod.UpdateableQueryBuilder[T] with typingsSlinky.cassanknex.mod.IfableQueryBuilder[T] with typingsSlinky.cassanknex.mod.TtlableQueryBuilder
}
