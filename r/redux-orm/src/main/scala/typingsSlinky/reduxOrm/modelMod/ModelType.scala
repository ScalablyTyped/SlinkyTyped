package typingsSlinky.reduxOrm.modelMod

import typingsSlinky.reduxOrm.fieldsMod.AttributeWithDefault
import typingsSlinky.reduxOrm.helpersMod.OptionalKeys
import typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupProps
import typingsSlinky.reduxOrm.querySetMod.QuerySet.LookupSpec
import typingsSlinky.reduxOrm.querySetMod.QuerySet.QueryBuilder
import typingsSlinky.reduxOrm.tableMod.ModelTableOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelType[M /* <: AnyModel */]
  extends QueryBuilder[M, js.Object] {
  
  /**
    * @see {@link Model#create}
    */
  def create[T /* <: CreateProps[
    M, 
    ModelFields[M], 
    /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String, 
    FieldSpecKeys[M, AttributeWithDefault], 
    (/* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelFields<M>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ String) | OptionalKeys[ModelFields[M]] | (FieldSpecKeys[M, AttributeWithDefault]) | IdKeyOpt[M]
  ] */](props: T): SessionBoundModel[M, CustomInstanceProps[M, T]] = js.native
  
  /**
    * @see {@link Model#exists}
    */
  def exists(props: LookupProps[M]): Boolean = js.native
  
  var fields: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelClass<M>['fields'] */ js.Any = js.native
  
  /**
    * @see {@link Model#get}
    */
  def get(lookupSpec: LookupSpec[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
  
  /**
    * @see {@link Model#idExists}
    */
  def idExists(id: IdType[M]): Boolean = js.native
  
  var modelName: /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelClass<M>['modelName'] */ js.Any = js.native
  
  var options: ModelTableOpts[ModelClass[M]] = js.native
  
  /**
    * @see {@link Model#upsert}
    */
  def upsert[T /* <: UpsertProps[M] */](props: T): SessionBoundModel[M, CustomInstanceProps[M, T]] = js.native
  
  /**
    * @see {@link Model#withId}
    */
  def withId(id: IdType[M]): (SessionBoundModel[M, js.Object]) | Null = js.native
}
